package edu.fdu.se.gumtree;

import java.util.ArrayList;
import java.util.List;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.tree.ITree;
import com.github.gumtreediff.tree.Tree;

public class MyTreeUtil{
	/**
     * Returns a list of every subtrees and the tree ordered using a breadth-first order.
     * @param tree a Tree.
     */
    public static List<ITree> layeredBreadthFirst(ITree root,List<Integer> layerIndex) {
        List<ITree> trees = new ArrayList<>();
        List<ITree> currents = new ArrayList<>();
        currents.add(root);
        int queueCounter=0;
        int currentLayerCountDown=1;
        int nextLayerChildrenSum=0;
        while (currents.size() > 0) {
        	queueCounter++;
        	currentLayerCountDown--;
        	
            ITree c = currents.remove(0);
            nextLayerChildrenSum += c.getChildren().size();
            if(currentLayerCountDown==0){
        		layerIndex.add(queueCounter);
        		currentLayerCountDown = nextLayerChildrenSum;
        		nextLayerChildrenSum = 0;
        	}
            trees.add(c);
            currents.addAll(c.getChildren());
        }
        return trees;
    }
    /**
     * a的所有直接非直接孩子，并且标记同样的action操作
     * @param a
     * @return
     */
    public static List<Action> traverseNodeGetSameEditActions(Action a){
    	List<Action> result = new ArrayList<Action>();
    	ITree node = a.getNode();
    	for(ITree tmp:node.preOrder()){
    		Tree myTree = (Tree) tmp;
    		if(myTree.getDoAction()==null) continue;
    		if(myTree.getDoAction().getClass().equals(a.getClass())){
    			result.add(myTree.getDoAction());
    		}
    	}
    	return result;
    }
    
    /**
     * a的所有直接非直接孩子，并且标记同样的action操作
     * @param a
     * @return
     */
    public static List<Action> traverseNodeGetSameEditActions(Action a,ITree node){
    	List<Action> result = new ArrayList<Action>();
    	for(ITree tmp:node.preOrder()){
    		Tree myTree = (Tree) tmp;
    		if(myTree.getDoAction()==null) continue;
    		if(myTree.getDoAction().getClass().equals(a.getClass())){
    			result.add(myTree.getDoAction());
    		}
    	}
    	return result;
    }
    /**
     * a的直接孩子，而且是标记同样action操作
     * @param a
     * @return
     */
    public static List<Action> traverseNodeChildrenGetSameEditAction(Action a){
    	List<Action> result = new ArrayList<Action>();
    	ITree node  = a.getNode();
    	ITree parent = node.getParent();
    	int pos = parent.getChildPosition(node);
    	if(pos <= 1) return result;
    	for(int i=pos;i<parent.getChildren().size();i++){
    		Tree myTree = (Tree) parent.getChildren().get(i);
    		if(myTree.getDoAction()==null) continue;
    		if(myTree.getDoAction().getClass().equals(a.getClass())){
    			result.add(myTree.getDoAction());
    		}
    	}
    	return result;
    }
    /**
     * 返回值表示是否所有节点都是相同action 
     * result变量返回action集合
     * @param a
     * @param result
     * @return
     */
    public static boolean traverseAllChilrenCheckIfSameAction(Action a,List<Action> result){
    	if(result == null){
    		System.err.println("ERR");
    	}
    	ITree node = a.getNode();
    	boolean isAllSameAction = true;
    	for(ITree tmp:node.preOrder()){
    		Tree myTree = (Tree) tmp;
    		if(myTree.getDoAction()==null) continue;
    		if(myTree.getDoAction().getClass().equals(a.getClass())){
    			result.add(myTree.getDoAction());
    		}else{
    			isAllSameAction = false;
    		}
    	}
    	return isAllSameAction;
    }
}
