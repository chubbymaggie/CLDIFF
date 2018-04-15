package edu.fdu.se.main.astdiff.RQ;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import edu.fdu.se.git.commitcodeinfo.CommitCodeInfo;
import org.eclipse.jgit.api.ListBranchCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.diff.Edit;
import org.eclipse.jgit.diff.EditList;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.patch.FileHeader;
import org.eclipse.jgit.revwalk.RevCommit;

import edu.fdu.se.astdiff.preprocessingfile.data.FileOutputLog;
import edu.fdu.se.git.JGitCommand;
import edu.fdu.se.main.astdiff.BaseDiffMiner;
import edu.fdu.se.main.astdiff.DiffMiner;
import edu.fdu.se.main.astdiff.DiffMinerTest;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;

/**
 * Created by huangkaifeng on 2018/4/6.
 *
 */
public class JGitHelper extends JGitCommand {

    public JGitHelper(String repopath) {
        super(repopath);
    }

    /**
     * 输出output即可
     */
    public void walkRepoFromBackwards(RQ rq) {
        try {
        	//wang 4/11
        	DiffMinerTest diffMinerTest = new DiffMinerTest();
        	int commitNum = 0;
            Queue<RevCommit> commitQueue = new LinkedList<>();
            Map<String, Boolean> isTraversed = new HashMap<>();

            List<Ref> mList = this.git.branchList().setListMode(ListBranchCommand.ListMode.ALL).call();
            for (Ref item : mList) {
                RevCommit commit = revWalk.parseCommit(item.getObjectId());
                commitQueue.offer(commit);
                while (commitQueue.size() != 0) {
                    RevCommit queueCommitItem = commitQueue.poll();
                    //wang 4/11
                	commitNum ++;
                	
                    RevCommit[] parentCommits = queueCommitItem.getParents();
                    if (isTraversed.containsKey(queueCommitItem.getName()) || parentCommits == null) {
                        continue;
                    }
                    Map<String, Map<String, List<String>>> changedFiles = this.getCommitParentMappedFileList(queueCommitItem.getName());

                    rq.handleCommits(changedFiles,queueCommitItem.getName());

                    isTraversed.put(queueCommitItem.getName(), true);
                    for (RevCommit item2 : parentCommits) {
                        RevCommit commit2 = revWalk.parseCommit(item2.getId());
                        commitQueue.offer(commit2);
                    }
//                    break;
                }
            }
//            System.out.println("CommitSum:" + isTraversed.size());
            System.out.println("commitNum:" + commitNum);
            System.out.println("wholeSize:" + diffMinerTest.wholeSize);
            
        } catch (MissingObjectException e) {
            e.printStackTrace();
        } catch (IncorrectObjectTypeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 输出debug的文件
     * @param commitString
     */
    public void analyzeOneCommit(RQ rq,String commitString) {
        try {

            ObjectId commitId = ObjectId.fromString(commitString);
            RevCommit commit = revWalk.parseCommit(commitId);
            if (commit.getParents() == null) {
                return;
            }
            Map<String, Map<String, List<String>>> changedFiles = this.getCommitParentMappedFileList(commit.getName());
            rq.handleCommit(changedFiles,commitString);

        } catch (MissingObjectException e) {
            e.printStackTrace();
        } catch (IncorrectObjectTypeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /**
     * 输出output即可
     */
    public void walkRepoFromBackwardsCountLineNumber(RQ2 rq) {
        try {
            //wang 4/11
            DiffMinerTest diffMinerTest = new DiffMinerTest();
            int commitNum = 0;
            Queue<RevCommit> commitQueue = new LinkedList<>();
            Map<String, Boolean> isTraversed = new HashMap<>();

            List<Ref> mList = this.git.branchList().setListMode(ListBranchCommand.ListMode.ALL).call();
            for (Ref item : mList) {
                RevCommit commit = revWalk.parseCommit(item.getObjectId());
                commitQueue.offer(commit);
                while (commitQueue.size() != 0) {
                    RevCommit queueCommitItem = commitQueue.poll();
                    commitNum ++;

                    RevCommit[] parentCommits = queueCommitItem.getParents();
                    if (isTraversed.containsKey(queueCommitItem.getName()) || parentCommits == null) {
                        continue;
                    }
                    int tmp = getCommitFileEditLineNumber(queueCommitItem);
                    rq.changedLineNumber(queueCommitItem.getName(),tmp);
                    isTraversed.put(queueCommitItem.getName(), true);
                    for (RevCommit item2 : parentCommits) {
                        RevCommit commit2 = revWalk.parseCommit(item2.getId());
                        commitQueue.offer(commit2);
                    }
                }
            }
//            System.out.println("CommitSum:" + isTraversed.size());
            System.out.println("commitNum:" + commitNum);
            System.out.println("wholeSize:" + diffMinerTest.wholeSize);

        } catch (MissingObjectException e) {
            e.printStackTrace();
        } catch (IncorrectObjectTypeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GitAPIException e1) {
            e1.printStackTrace();
        }
    }





    public int getCommitFileEditLineNumber(RevCommit commit) {
        try {
            int count = 0;
            RevCommit[] parentsCommits = commit.getParents();
            for (RevCommit parent : parentsCommits) {
                ObjectReader reader = git.getRepository().newObjectReader();
                CanonicalTreeParser newTreeIter = new CanonicalTreeParser();
                ObjectId newTree = commit.getTree().getId();
                newTreeIter.reset(reader, newTree);
                CanonicalTreeParser oldTreeIter = new CanonicalTreeParser();
                RevCommit pCommit = revWalk.parseCommit(parent.getId());
                ObjectId oldTree = pCommit.getTree().getId();
                oldTreeIter.reset(reader, oldTree);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                DiffFormatter diffFormatter = new DiffFormatter(out);
                diffFormatter.setRepository(git.getRepository());
                List<DiffEntry> entries = diffFormatter.scan(oldTreeIter, newTreeIter);
                diffFormatter.setContext(0);
                for (DiffEntry entry : entries) {
                    switch (entry.getChangeType()) {
                        case MODIFY:
                            String mOldPath = entry.getOldPath();
                            if(!mOldPath.toLowerCase().contains("test")&&mOldPath.endsWith(".java")){
                                FileHeader fileHeader = diffFormatter.toFileHeader(entry);
                                EditList editList = fileHeader.toEditList();
                                count += lineNumber(editList);
                                diffFormatter.format(entry);
                                out.reset();
                            }
                            break;
                        case ADD:
                        case DELETE:
                        default:
                            break;
                    }
                }
                diffFormatter.close();
            }
            return count;
        } catch (MissingObjectException e) {
            e.printStackTrace();
        } catch (IncorrectObjectTypeException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int lineNumber(EditList edits){
        int cnt = 0;
        for(Edit e:edits){
            if(e.getBeginA()==e.getEndA()){
                cnt += e.getEndB() -e.getBeginB();

            }else if(e.getBeginB() == e.getEndB()){
                cnt+= e.getEndA() - e.getBeginA();
            }else if(e.getBeginA() < e.getEndA()&&e.getBeginB() < e.getEndB()){
                cnt += e.getEndB() -e.getBeginB() +  e.getEndA() - e.getBeginA();
            }
        }
        return cnt;
    }

}