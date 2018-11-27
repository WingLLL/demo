package com.zhkj.demo.model;

import java.util.ArrayList;
import java.util.List;

public class zhanchorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public zhanchorExample() {
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

        public Criteria andZidIsNull() {
            addCriterion("zid is null");
            return (Criteria) this;
        }

        public Criteria andZidIsNotNull() {
            addCriterion("zid is not null");
            return (Criteria) this;
        }

        public Criteria andZidEqualTo(Integer value) {
            addCriterion("zid =", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotEqualTo(Integer value) {
            addCriterion("zid <>", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThan(Integer value) {
            addCriterion("zid >", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zid >=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThan(Integer value) {
            addCriterion("zid <", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThanOrEqualTo(Integer value) {
            addCriterion("zid <=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidIn(List<Integer> values) {
            addCriterion("zid in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotIn(List<Integer> values) {
            addCriterion("zid not in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidBetween(Integer value1, Integer value2) {
            addCriterion("zid between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotBetween(Integer value1, Integer value2) {
            addCriterion("zid not between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZnameIsNull() {
            addCriterion("zname is null");
            return (Criteria) this;
        }

        public Criteria andZnameIsNotNull() {
            addCriterion("zname is not null");
            return (Criteria) this;
        }

        public Criteria andZnameEqualTo(String value) {
            addCriterion("zname =", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotEqualTo(String value) {
            addCriterion("zname <>", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThan(String value) {
            addCriterion("zname >", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameGreaterThanOrEqualTo(String value) {
            addCriterion("zname >=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThan(String value) {
            addCriterion("zname <", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLessThanOrEqualTo(String value) {
            addCriterion("zname <=", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameLike(String value) {
            addCriterion("zname like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotLike(String value) {
            addCriterion("zname not like", value, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameIn(List<String> values) {
            addCriterion("zname in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotIn(List<String> values) {
            addCriterion("zname not in", values, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameBetween(String value1, String value2) {
            addCriterion("zname between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andZnameNotBetween(String value1, String value2) {
            addCriterion("zname not between", value1, value2, "zname");
            return (Criteria) this;
        }

        public Criteria andZroomidIsNull() {
            addCriterion("zroomid is null");
            return (Criteria) this;
        }

        public Criteria andZroomidIsNotNull() {
            addCriterion("zroomid is not null");
            return (Criteria) this;
        }

        public Criteria andZroomidEqualTo(Integer value) {
            addCriterion("zroomid =", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidNotEqualTo(Integer value) {
            addCriterion("zroomid <>", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidGreaterThan(Integer value) {
            addCriterion("zroomid >", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zroomid >=", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidLessThan(Integer value) {
            addCriterion("zroomid <", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidLessThanOrEqualTo(Integer value) {
            addCriterion("zroomid <=", value, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidIn(List<Integer> values) {
            addCriterion("zroomid in", values, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidNotIn(List<Integer> values) {
            addCriterion("zroomid not in", values, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidBetween(Integer value1, Integer value2) {
            addCriterion("zroomid between", value1, value2, "zroomid");
            return (Criteria) this;
        }

        public Criteria andZroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("zroomid not between", value1, value2, "zroomid");
            return (Criteria) this;
        }

        public Criteria andFunsnumIsNull() {
            addCriterion("funsnum is null");
            return (Criteria) this;
        }

        public Criteria andFunsnumIsNotNull() {
            addCriterion("funsnum is not null");
            return (Criteria) this;
        }

        public Criteria andFunsnumEqualTo(Integer value) {
            addCriterion("funsnum =", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumNotEqualTo(Integer value) {
            addCriterion("funsnum <>", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumGreaterThan(Integer value) {
            addCriterion("funsnum >", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("funsnum >=", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumLessThan(Integer value) {
            addCriterion("funsnum <", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumLessThanOrEqualTo(Integer value) {
            addCriterion("funsnum <=", value, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumIn(List<Integer> values) {
            addCriterion("funsnum in", values, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumNotIn(List<Integer> values) {
            addCriterion("funsnum not in", values, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumBetween(Integer value1, Integer value2) {
            addCriterion("funsnum between", value1, value2, "funsnum");
            return (Criteria) this;
        }

        public Criteria andFunsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("funsnum not between", value1, value2, "funsnum");
            return (Criteria) this;
        }

        public Criteria andZpicIsNull() {
            addCriterion("zpic is null");
            return (Criteria) this;
        }

        public Criteria andZpicIsNotNull() {
            addCriterion("zpic is not null");
            return (Criteria) this;
        }

        public Criteria andZpicEqualTo(String value) {
            addCriterion("zpic =", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicNotEqualTo(String value) {
            addCriterion("zpic <>", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicGreaterThan(String value) {
            addCriterion("zpic >", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicGreaterThanOrEqualTo(String value) {
            addCriterion("zpic >=", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicLessThan(String value) {
            addCriterion("zpic <", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicLessThanOrEqualTo(String value) {
            addCriterion("zpic <=", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicLike(String value) {
            addCriterion("zpic like", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicNotLike(String value) {
            addCriterion("zpic not like", value, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicIn(List<String> values) {
            addCriterion("zpic in", values, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicNotIn(List<String> values) {
            addCriterion("zpic not in", values, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicBetween(String value1, String value2) {
            addCriterion("zpic between", value1, value2, "zpic");
            return (Criteria) this;
        }

        public Criteria andZpicNotBetween(String value1, String value2) {
            addCriterion("zpic not between", value1, value2, "zpic");
            return (Criteria) this;
        }

        public Criteria andZintroIsNull() {
            addCriterion("zintro is null");
            return (Criteria) this;
        }

        public Criteria andZintroIsNotNull() {
            addCriterion("zintro is not null");
            return (Criteria) this;
        }

        public Criteria andZintroEqualTo(String value) {
            addCriterion("zintro =", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroNotEqualTo(String value) {
            addCriterion("zintro <>", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroGreaterThan(String value) {
            addCriterion("zintro >", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroGreaterThanOrEqualTo(String value) {
            addCriterion("zintro >=", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroLessThan(String value) {
            addCriterion("zintro <", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroLessThanOrEqualTo(String value) {
            addCriterion("zintro <=", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroLike(String value) {
            addCriterion("zintro like", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroNotLike(String value) {
            addCriterion("zintro not like", value, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroIn(List<String> values) {
            addCriterion("zintro in", values, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroNotIn(List<String> values) {
            addCriterion("zintro not in", values, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroBetween(String value1, String value2) {
            addCriterion("zintro between", value1, value2, "zintro");
            return (Criteria) this;
        }

        public Criteria andZintroNotBetween(String value1, String value2) {
            addCriterion("zintro not between", value1, value2, "zintro");
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