package edu.fdu.se.bean;

public class AndroidBranch {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column android_branch.id
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column android_branch.branch_name_full
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    private String branchNameFull;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column android_branch.branch_name_short
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    private String branchNameShort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column android_branch.branch_commit_sha
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    private String branchCommitSha;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column android_branch.project_name
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    private String projectName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public AndroidBranch(Integer id, String branchNameFull, String branchNameShort, String branchCommitSha, String projectName) {
        this.id = id;
        this.branchNameFull = branchNameFull;
        this.branchNameShort = branchNameShort;
        this.branchCommitSha = branchCommitSha;
        this.projectName = projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public AndroidBranch() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column android_branch.id
     *
     * @return the value of android_branch.id
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column android_branch.id
     *
     * @param id the value for android_branch.id
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column android_branch.branch_name_full
     *
     * @return the value of android_branch.branch_name_full
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public String getBranchNameFull() {
        return branchNameFull;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column android_branch.branch_name_full
     *
     * @param branchNameFull the value for android_branch.branch_name_full
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void setBranchNameFull(String branchNameFull) {
        this.branchNameFull = branchNameFull == null ? null : branchNameFull.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column android_branch.branch_name_short
     *
     * @return the value of android_branch.branch_name_short
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public String getBranchNameShort() {
        return branchNameShort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column android_branch.branch_name_short
     *
     * @param branchNameShort the value for android_branch.branch_name_short
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void setBranchNameShort(String branchNameShort) {
        this.branchNameShort = branchNameShort == null ? null : branchNameShort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column android_branch.branch_commit_sha
     *
     * @return the value of android_branch.branch_commit_sha
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public String getBranchCommitSha() {
        return branchCommitSha;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column android_branch.branch_commit_sha
     *
     * @param branchCommitSha the value for android_branch.branch_commit_sha
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void setBranchCommitSha(String branchCommitSha) {
        this.branchCommitSha = branchCommitSha == null ? null : branchCommitSha.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column android_branch.project_name
     *
     * @return the value of android_branch.project_name
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column android_branch.project_name
     *
     * @param projectName the value for android_branch.project_name
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }
}