package edu.fdu.se.bean;

import java.util.ArrayList;
import java.util.List;

public class AndroidBranchExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    public AndroidBranchExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:05 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullIsNull() {
            addCriterion("branch_name_full is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullIsNotNull() {
            addCriterion("branch_name_full is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullEqualTo(String value) {
            addCriterion("branch_name_full =", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullNotEqualTo(String value) {
            addCriterion("branch_name_full <>", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullGreaterThan(String value) {
            addCriterion("branch_name_full >", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name_full >=", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullLessThan(String value) {
            addCriterion("branch_name_full <", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullLessThanOrEqualTo(String value) {
            addCriterion("branch_name_full <=", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullLike(String value) {
            addCriterion("branch_name_full like", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullNotLike(String value) {
            addCriterion("branch_name_full not like", value, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullIn(List<String> values) {
            addCriterion("branch_name_full in", values, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullNotIn(List<String> values) {
            addCriterion("branch_name_full not in", values, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullBetween(String value1, String value2) {
            addCriterion("branch_name_full between", value1, value2, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameFullNotBetween(String value1, String value2) {
            addCriterion("branch_name_full not between", value1, value2, "branchNameFull");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortIsNull() {
            addCriterion("branch_name_short is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortIsNotNull() {
            addCriterion("branch_name_short is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortEqualTo(String value) {
            addCriterion("branch_name_short =", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortNotEqualTo(String value) {
            addCriterion("branch_name_short <>", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortGreaterThan(String value) {
            addCriterion("branch_name_short >", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name_short >=", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortLessThan(String value) {
            addCriterion("branch_name_short <", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortLessThanOrEqualTo(String value) {
            addCriterion("branch_name_short <=", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortLike(String value) {
            addCriterion("branch_name_short like", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortNotLike(String value) {
            addCriterion("branch_name_short not like", value, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortIn(List<String> values) {
            addCriterion("branch_name_short in", values, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortNotIn(List<String> values) {
            addCriterion("branch_name_short not in", values, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortBetween(String value1, String value2) {
            addCriterion("branch_name_short between", value1, value2, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchNameShortNotBetween(String value1, String value2) {
            addCriterion("branch_name_short not between", value1, value2, "branchNameShort");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaIsNull() {
            addCriterion("branch_commit_sha is null");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaIsNotNull() {
            addCriterion("branch_commit_sha is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaEqualTo(String value) {
            addCriterion("branch_commit_sha =", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaNotEqualTo(String value) {
            addCriterion("branch_commit_sha <>", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaGreaterThan(String value) {
            addCriterion("branch_commit_sha >", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaGreaterThanOrEqualTo(String value) {
            addCriterion("branch_commit_sha >=", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaLessThan(String value) {
            addCriterion("branch_commit_sha <", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaLessThanOrEqualTo(String value) {
            addCriterion("branch_commit_sha <=", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaLike(String value) {
            addCriterion("branch_commit_sha like", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaNotLike(String value) {
            addCriterion("branch_commit_sha not like", value, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaIn(List<String> values) {
            addCriterion("branch_commit_sha in", values, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaNotIn(List<String> values) {
            addCriterion("branch_commit_sha not in", values, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaBetween(String value1, String value2) {
            addCriterion("branch_commit_sha between", value1, value2, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andBranchCommitShaNotBetween(String value1, String value2) {
            addCriterion("branch_commit_sha not between", value1, value2, "branchCommitSha");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table android_branch
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 29 15:30:06 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table android_branch
     *
     * @mbg.generated Fri Dec 29 15:30:06 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}