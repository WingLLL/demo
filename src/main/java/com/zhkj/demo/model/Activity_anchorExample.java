package com.zhkj.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Activity_anchorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Activity_anchorExample() {
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

        public Criteria andAnchornameIsNull() {
            addCriterion("anchorname is null");
            return (Criteria) this;
        }

        public Criteria andAnchornameIsNotNull() {
            addCriterion("anchorname is not null");
            return (Criteria) this;
        }

        public Criteria andAnchornameEqualTo(String value) {
            addCriterion("anchorname =", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotEqualTo(String value) {
            addCriterion("anchorname <>", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameGreaterThan(String value) {
            addCriterion("anchorname >", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameGreaterThanOrEqualTo(String value) {
            addCriterion("anchorname >=", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLessThan(String value) {
            addCriterion("anchorname <", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLessThanOrEqualTo(String value) {
            addCriterion("anchorname <=", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameLike(String value) {
            addCriterion("anchorname like", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotLike(String value) {
            addCriterion("anchorname not like", value, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameIn(List<String> values) {
            addCriterion("anchorname in", values, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotIn(List<String> values) {
            addCriterion("anchorname not in", values, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameBetween(String value1, String value2) {
            addCriterion("anchorname between", value1, value2, "anchorname");
            return (Criteria) this;
        }

        public Criteria andAnchornameNotBetween(String value1, String value2) {
            addCriterion("anchorname not between", value1, value2, "anchorname");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andImghostIsNull() {
            addCriterion("imghost is null");
            return (Criteria) this;
        }

        public Criteria andImghostIsNotNull() {
            addCriterion("imghost is not null");
            return (Criteria) this;
        }

        public Criteria andImghostEqualTo(String value) {
            addCriterion("imghost =", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostNotEqualTo(String value) {
            addCriterion("imghost <>", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostGreaterThan(String value) {
            addCriterion("imghost >", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostGreaterThanOrEqualTo(String value) {
            addCriterion("imghost >=", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostLessThan(String value) {
            addCriterion("imghost <", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostLessThanOrEqualTo(String value) {
            addCriterion("imghost <=", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostLike(String value) {
            addCriterion("imghost like", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostNotLike(String value) {
            addCriterion("imghost not like", value, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostIn(List<String> values) {
            addCriterion("imghost in", values, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostNotIn(List<String> values) {
            addCriterion("imghost not in", values, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostBetween(String value1, String value2) {
            addCriterion("imghost between", value1, value2, "imghost");
            return (Criteria) this;
        }

        public Criteria andImghostNotBetween(String value1, String value2) {
            addCriterion("imghost not between", value1, value2, "imghost");
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