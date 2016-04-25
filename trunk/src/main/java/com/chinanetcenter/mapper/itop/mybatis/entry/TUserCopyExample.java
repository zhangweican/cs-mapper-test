package com.chinanetcenter.mapper.itop.mybatis.entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserCopyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public TUserCopyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
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
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_copy
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_copy
     *
     * @mbggenerated
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

        public Criteria andId2IsNull() {
            addCriterion("id2 is null");
            return (Criteria) this;
        }

        public Criteria andId2IsNotNull() {
            addCriterion("id2 is not null");
            return (Criteria) this;
        }

        public Criteria andId2EqualTo(Long value) {
            addCriterion("id2 =", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotEqualTo(Long value) {
            addCriterion("id2 <>", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThan(Long value) {
            addCriterion("id2 >", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2GreaterThanOrEqualTo(Long value) {
            addCriterion("id2 >=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThan(Long value) {
            addCriterion("id2 <", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2LessThanOrEqualTo(Long value) {
            addCriterion("id2 <=", value, "id2");
            return (Criteria) this;
        }

        public Criteria andId2In(List<Long> values) {
            addCriterion("id2 in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotIn(List<Long> values) {
            addCriterion("id2 not in", values, "id2");
            return (Criteria) this;
        }

        public Criteria andId2Between(Long value1, Long value2) {
            addCriterion("id2 between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andId2NotBetween(Long value1, Long value2) {
            addCriterion("id2 not between", value1, value2, "id2");
            return (Criteria) this;
        }

        public Criteria andId1IsNull() {
            addCriterion("id1 is null");
            return (Criteria) this;
        }

        public Criteria andId1IsNotNull() {
            addCriterion("id1 is not null");
            return (Criteria) this;
        }

        public Criteria andId1EqualTo(Long value) {
            addCriterion("id1 =", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotEqualTo(Long value) {
            addCriterion("id1 <>", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1GreaterThan(Long value) {
            addCriterion("id1 >", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1GreaterThanOrEqualTo(Long value) {
            addCriterion("id1 >=", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1LessThan(Long value) {
            addCriterion("id1 <", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1LessThanOrEqualTo(Long value) {
            addCriterion("id1 <=", value, "id1");
            return (Criteria) this;
        }

        public Criteria andId1In(List<Long> values) {
            addCriterion("id1 in", values, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotIn(List<Long> values) {
            addCriterion("id1 not in", values, "id1");
            return (Criteria) this;
        }

        public Criteria andId1Between(Long value1, Long value2) {
            addCriterion("id1 between", value1, value2, "id1");
            return (Criteria) this;
        }

        public Criteria andId1NotBetween(Long value1, Long value2) {
            addCriterion("id1 not between", value1, value2, "id1");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_copy
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_copy
     *
     * @mbggenerated
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