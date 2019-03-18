package com.tl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("UNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UNAME =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UNAME <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UNAME >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNAME >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UNAME <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UNAME <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UNAME like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UNAME not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UNAME in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UNAME not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UNAME between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UNAME not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpassIsNull() {
            addCriterion("UPASS is null");
            return (Criteria) this;
        }

        public Criteria andUpassIsNotNull() {
            addCriterion("UPASS is not null");
            return (Criteria) this;
        }

        public Criteria andUpassEqualTo(String value) {
            addCriterion("UPASS =", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotEqualTo(String value) {
            addCriterion("UPASS <>", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassGreaterThan(String value) {
            addCriterion("UPASS >", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassGreaterThanOrEqualTo(String value) {
            addCriterion("UPASS >=", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLessThan(String value) {
            addCriterion("UPASS <", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLessThanOrEqualTo(String value) {
            addCriterion("UPASS <=", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassLike(String value) {
            addCriterion("UPASS like", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotLike(String value) {
            addCriterion("UPASS not like", value, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassIn(List<String> values) {
            addCriterion("UPASS in", values, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotIn(List<String> values) {
            addCriterion("UPASS not in", values, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassBetween(String value1, String value2) {
            addCriterion("UPASS between", value1, value2, "upass");
            return (Criteria) this;
        }

        public Criteria andUpassNotBetween(String value1, String value2) {
            addCriterion("UPASS not between", value1, value2, "upass");
            return (Criteria) this;
        }

        public Criteria andUageIsNull() {
            addCriterion("UAGE is null");
            return (Criteria) this;
        }

        public Criteria andUageIsNotNull() {
            addCriterion("UAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUageEqualTo(Integer value) {
            addCriterion("UAGE =", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotEqualTo(Integer value) {
            addCriterion("UAGE <>", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThan(Integer value) {
            addCriterion("UAGE >", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageGreaterThanOrEqualTo(Integer value) {
            addCriterion("UAGE >=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThan(Integer value) {
            addCriterion("UAGE <", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageLessThanOrEqualTo(Integer value) {
            addCriterion("UAGE <=", value, "uage");
            return (Criteria) this;
        }

        public Criteria andUageIn(List<Integer> values) {
            addCriterion("UAGE in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotIn(List<Integer> values) {
            addCriterion("UAGE not in", values, "uage");
            return (Criteria) this;
        }

        public Criteria andUageBetween(Integer value1, Integer value2) {
            addCriterion("UAGE between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUageNotBetween(Integer value1, Integer value2) {
            addCriterion("UAGE not between", value1, value2, "uage");
            return (Criteria) this;
        }

        public Criteria andUbirthIsNull() {
            addCriterion("UBIRTH is null");
            return (Criteria) this;
        }

        public Criteria andUbirthIsNotNull() {
            addCriterion("UBIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andUbirthEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH =", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH <>", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("UBIRTH >", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH >=", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthLessThan(Date value) {
            addCriterionForJDBCDate("UBIRTH <", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UBIRTH <=", value, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthIn(List<Date> values) {
            addCriterionForJDBCDate("UBIRTH in", values, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("UBIRTH not in", values, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UBIRTH between", value1, value2, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UBIRTH not between", value1, value2, "ubirth");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("USEX is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("USEX is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("USEX =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("USEX <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("USEX >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("USEX >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("USEX <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("USEX <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("USEX like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("USEX not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("USEX in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("USEX not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("USEX between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("USEX not between", value1, value2, "usex");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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