package com.youzhong.entity;

import java.util.ArrayList;
import java.util.List;

public class RequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequireExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProidIsNull() {
            addCriterion("PROID is null");
            return (Criteria) this;
        }

        public Criteria andProidIsNotNull() {
            addCriterion("PROID is not null");
            return (Criteria) this;
        }

        public Criteria andProidEqualTo(Long value) {
            addCriterion("PROID =", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotEqualTo(Long value) {
            addCriterion("PROID <>", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThan(Long value) {
            addCriterion("PROID >", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidGreaterThanOrEqualTo(Long value) {
            addCriterion("PROID >=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThan(Long value) {
            addCriterion("PROID <", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidLessThanOrEqualTo(Long value) {
            addCriterion("PROID <=", value, "proid");
            return (Criteria) this;
        }

        public Criteria andProidIn(List<Long> values) {
            addCriterion("PROID in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotIn(List<Long> values) {
            addCriterion("PROID not in", values, "proid");
            return (Criteria) this;
        }

        public Criteria andProidBetween(Long value1, Long value2) {
            addCriterion("PROID between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andProidNotBetween(Long value1, Long value2) {
            addCriterion("PROID not between", value1, value2, "proid");
            return (Criteria) this;
        }

        public Criteria andModelidIsNull() {
            addCriterion("MODELID is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("MODELID is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Long value) {
            addCriterion("MODELID =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Long value) {
            addCriterion("MODELID <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Long value) {
            addCriterion("MODELID >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Long value) {
            addCriterion("MODELID >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Long value) {
            addCriterion("MODELID <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Long value) {
            addCriterion("MODELID <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Long> values) {
            addCriterion("MODELID in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Long> values) {
            addCriterion("MODELID not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Long value1, Long value2) {
            addCriterion("MODELID between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Long value1, Long value2) {
            addCriterion("MODELID not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Long value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Long value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Long value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Long value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Long value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Long value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Long> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Long> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Long value1, Long value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Long value1, Long value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andFromidIsNull() {
            addCriterion("FROMID is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("FROMID is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Long value) {
            addCriterion("FROMID =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Long value) {
            addCriterion("FROMID <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Long value) {
            addCriterion("FROMID >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Long value) {
            addCriterion("FROMID >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Long value) {
            addCriterion("FROMID <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Long value) {
            addCriterion("FROMID <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Long> values) {
            addCriterion("FROMID in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Long> values) {
            addCriterion("FROMID not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Long value1, Long value2) {
            addCriterion("FROMID between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Long value1, Long value2) {
            addCriterion("FROMID not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andExamuserIsNull() {
            addCriterion("EXAMUSER is null");
            return (Criteria) this;
        }

        public Criteria andExamuserIsNotNull() {
            addCriterion("EXAMUSER is not null");
            return (Criteria) this;
        }

        public Criteria andExamuserEqualTo(String value) {
            addCriterion("EXAMUSER =", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserNotEqualTo(String value) {
            addCriterion("EXAMUSER <>", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserGreaterThan(String value) {
            addCriterion("EXAMUSER >", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMUSER >=", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserLessThan(String value) {
            addCriterion("EXAMUSER <", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserLessThanOrEqualTo(String value) {
            addCriterion("EXAMUSER <=", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserLike(String value) {
            addCriterion("EXAMUSER like", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserNotLike(String value) {
            addCriterion("EXAMUSER not like", value, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserIn(List<String> values) {
            addCriterion("EXAMUSER in", values, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserNotIn(List<String> values) {
            addCriterion("EXAMUSER not in", values, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserBetween(String value1, String value2) {
            addCriterion("EXAMUSER between", value1, value2, "examuser");
            return (Criteria) this;
        }

        public Criteria andExamuserNotBetween(String value1, String value2) {
            addCriterion("EXAMUSER not between", value1, value2, "examuser");
            return (Criteria) this;
        }

        public Criteria andRLevelIsNull() {
            addCriterion("R_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andRLevelIsNotNull() {
            addCriterion("R_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andRLevelEqualTo(Long value) {
            addCriterion("R_LEVEL =", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotEqualTo(Long value) {
            addCriterion("R_LEVEL <>", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelGreaterThan(Long value) {
            addCriterion("R_LEVEL >", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("R_LEVEL >=", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelLessThan(Long value) {
            addCriterion("R_LEVEL <", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelLessThanOrEqualTo(Long value) {
            addCriterion("R_LEVEL <=", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelIn(List<Long> values) {
            addCriterion("R_LEVEL in", values, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotIn(List<Long> values) {
            addCriterion("R_LEVEL not in", values, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelBetween(Long value1, Long value2) {
            addCriterion("R_LEVEL between", value1, value2, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotBetween(Long value1, Long value2) {
            addCriterion("R_LEVEL not between", value1, value2, "rLevel");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSenduserIsNull() {
            addCriterion("SENDUSER is null");
            return (Criteria) this;
        }

        public Criteria andSenduserIsNotNull() {
            addCriterion("SENDUSER is not null");
            return (Criteria) this;
        }

        public Criteria andSenduserEqualTo(String value) {
            addCriterion("SENDUSER =", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserNotEqualTo(String value) {
            addCriterion("SENDUSER <>", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserGreaterThan(String value) {
            addCriterion("SENDUSER >", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserGreaterThanOrEqualTo(String value) {
            addCriterion("SENDUSER >=", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserLessThan(String value) {
            addCriterion("SENDUSER <", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserLessThanOrEqualTo(String value) {
            addCriterion("SENDUSER <=", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserLike(String value) {
            addCriterion("SENDUSER like", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserNotLike(String value) {
            addCriterion("SENDUSER not like", value, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserIn(List<String> values) {
            addCriterion("SENDUSER in", values, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserNotIn(List<String> values) {
            addCriterion("SENDUSER not in", values, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserBetween(String value1, String value2) {
            addCriterion("SENDUSER between", value1, value2, "senduser");
            return (Criteria) this;
        }

        public Criteria andSenduserNotBetween(String value1, String value2) {
            addCriterion("SENDUSER not between", value1, value2, "senduser");
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