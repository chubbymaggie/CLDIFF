package edu.fdu.se.bean;

import java.util.ArrayList;
import java.util.List;

public class AndroidPlatformFrameworkProjectExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public AndroidPlatformFrameworkProjectExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
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

		public Criteria andProjectSubPathIsNull() {
			addCriterion("project_sub_path is null");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathIsNotNull() {
			addCriterion("project_sub_path is not null");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathEqualTo(String value) {
			addCriterion("project_sub_path =", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathNotEqualTo(String value) {
			addCriterion("project_sub_path <>", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathGreaterThan(String value) {
			addCriterion("project_sub_path >", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathGreaterThanOrEqualTo(String value) {
			addCriterion("project_sub_path >=", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathLessThan(String value) {
			addCriterion("project_sub_path <", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathLessThanOrEqualTo(String value) {
			addCriterion("project_sub_path <=", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathLike(String value) {
			addCriterion("project_sub_path like", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathNotLike(String value) {
			addCriterion("project_sub_path not like", value, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathIn(List<String> values) {
			addCriterion("project_sub_path in", values, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathNotIn(List<String> values) {
			addCriterion("project_sub_path not in", values, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathBetween(String value1, String value2) {
			addCriterion("project_sub_path between", value1, value2, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubPathNotBetween(String value1, String value2) {
			addCriterion("project_sub_path not between", value1, value2, "projectSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathIsNull() {
			addCriterion("project_sub_sub_path is null");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathIsNotNull() {
			addCriterion("project_sub_sub_path is not null");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathEqualTo(String value) {
			addCriterion("project_sub_sub_path =", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathNotEqualTo(String value) {
			addCriterion("project_sub_sub_path <>", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathGreaterThan(String value) {
			addCriterion("project_sub_sub_path >", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathGreaterThanOrEqualTo(String value) {
			addCriterion("project_sub_sub_path >=", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathLessThan(String value) {
			addCriterion("project_sub_sub_path <", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathLessThanOrEqualTo(String value) {
			addCriterion("project_sub_sub_path <=", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathLike(String value) {
			addCriterion("project_sub_sub_path like", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathNotLike(String value) {
			addCriterion("project_sub_sub_path not like", value, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathIn(List<String> values) {
			addCriterion("project_sub_sub_path in", values, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathNotIn(List<String> values) {
			addCriterion("project_sub_sub_path not in", values, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathBetween(String value1, String value2) {
			addCriterion("project_sub_sub_path between", value1, value2, "projectSubSubPath");
			return (Criteria) this;
		}

		public Criteria andProjectSubSubPathNotBetween(String value1, String value2) {
			addCriterion("project_sub_sub_path not between", value1, value2, "projectSubSubPath");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table android_platform_framework_project
	 * @mbg.generated  Fri Dec 29 15:30:05 CST 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table android_platform_framework_project
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 17 17:23:35 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}