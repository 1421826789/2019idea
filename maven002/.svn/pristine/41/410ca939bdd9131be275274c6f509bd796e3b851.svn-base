package com.youzhong.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andProUserIsNull() {
            addCriterion("PRO_USER is null");
            return (Criteria) this;
        }

        public Criteria andProUserIsNotNull() {
            addCriterion("PRO_USER is not null");
            return (Criteria) this;
        }

        public Criteria andProUserEqualTo(String value) {
            addCriterion("PRO_USER =", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserNotEqualTo(String value) {
            addCriterion("PRO_USER <>", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserGreaterThan(String value) {
            addCriterion("PRO_USER >", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_USER >=", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserLessThan(String value) {
            addCriterion("PRO_USER <", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserLessThanOrEqualTo(String value) {
            addCriterion("PRO_USER <=", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserLike(String value) {
            addCriterion("PRO_USER like", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserNotLike(String value) {
            addCriterion("PRO_USER not like", value, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserIn(List<String> values) {
            addCriterion("PRO_USER in", values, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserNotIn(List<String> values) {
            addCriterion("PRO_USER not in", values, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserBetween(String value1, String value2) {
            addCriterion("PRO_USER between", value1, value2, "proUser");
            return (Criteria) this;
        }

        public Criteria andProUserNotBetween(String value1, String value2) {
            addCriterion("PRO_USER not between", value1, value2, "proUser");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNull() {
            addCriterion("TEST_USER is null");
            return (Criteria) this;
        }

        public Criteria andTestUserIsNotNull() {
            addCriterion("TEST_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTestUserEqualTo(String value) {
            addCriterion("TEST_USER =", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotEqualTo(String value) {
            addCriterion("TEST_USER <>", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThan(String value) {
            addCriterion("TEST_USER >", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_USER >=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThan(String value) {
            addCriterion("TEST_USER <", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLessThanOrEqualTo(String value) {
            addCriterion("TEST_USER <=", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserLike(String value) {
            addCriterion("TEST_USER like", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotLike(String value) {
            addCriterion("TEST_USER not like", value, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserIn(List<String> values) {
            addCriterion("TEST_USER in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotIn(List<String> values) {
            addCriterion("TEST_USER not in", values, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserBetween(String value1, String value2) {
            addCriterion("TEST_USER between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andTestUserNotBetween(String value1, String value2) {
            addCriterion("TEST_USER not between", value1, value2, "testUser");
            return (Criteria) this;
        }

        public Criteria andPubUserIsNull() {
            addCriterion("PUB_USER is null");
            return (Criteria) this;
        }

        public Criteria andPubUserIsNotNull() {
            addCriterion("PUB_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPubUserEqualTo(String value) {
            addCriterion("PUB_USER =", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserNotEqualTo(String value) {
            addCriterion("PUB_USER <>", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserGreaterThan(String value) {
            addCriterion("PUB_USER >", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserGreaterThanOrEqualTo(String value) {
            addCriterion("PUB_USER >=", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserLessThan(String value) {
            addCriterion("PUB_USER <", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserLessThanOrEqualTo(String value) {
            addCriterion("PUB_USER <=", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserLike(String value) {
            addCriterion("PUB_USER like", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserNotLike(String value) {
            addCriterion("PUB_USER not like", value, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserIn(List<String> values) {
            addCriterion("PUB_USER in", values, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserNotIn(List<String> values) {
            addCriterion("PUB_USER not in", values, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserBetween(String value1, String value2) {
            addCriterion("PUB_USER between", value1, value2, "pubUser");
            return (Criteria) this;
        }

        public Criteria andPubUserNotBetween(String value1, String value2) {
            addCriterion("PUB_USER not between", value1, value2, "pubUser");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNull() {
            addCriterion("PRO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProTypeIsNotNull() {
            addCriterion("PRO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProTypeEqualTo(String value) {
            addCriterion("PRO_TYPE =", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotEqualTo(String value) {
            addCriterion("PRO_TYPE <>", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThan(String value) {
            addCriterion("PRO_TYPE >", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE >=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThan(String value) {
            addCriterion("PRO_TYPE <", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLessThanOrEqualTo(String value) {
            addCriterion("PRO_TYPE <=", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeLike(String value) {
            addCriterion("PRO_TYPE like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotLike(String value) {
            addCriterion("PRO_TYPE not like", value, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeIn(List<String> values) {
            addCriterion("PRO_TYPE in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotIn(List<String> values) {
            addCriterion("PRO_TYPE not in", values, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeBetween(String value1, String value2) {
            addCriterion("PRO_TYPE between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProTypeNotBetween(String value1, String value2) {
            addCriterion("PRO_TYPE not between", value1, value2, "proType");
            return (Criteria) this;
        }

        public Criteria andProDescIsNull() {
            addCriterion("PRO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProDescIsNotNull() {
            addCriterion("PRO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProDescEqualTo(String value) {
            addCriterion("PRO_DESC =", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotEqualTo(String value) {
            addCriterion("PRO_DESC <>", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThan(String value) {
            addCriterion("PRO_DESC >", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_DESC >=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThan(String value) {
            addCriterion("PRO_DESC <", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLessThanOrEqualTo(String value) {
            addCriterion("PRO_DESC <=", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescLike(String value) {
            addCriterion("PRO_DESC like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotLike(String value) {
            addCriterion("PRO_DESC not like", value, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescIn(List<String> values) {
            addCriterion("PRO_DESC in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotIn(List<String> values) {
            addCriterion("PRO_DESC not in", values, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescBetween(String value1, String value2) {
            addCriterion("PRO_DESC between", value1, value2, "proDesc");
            return (Criteria) this;
        }

        public Criteria andProDescNotBetween(String value1, String value2) {
            addCriterion("PRO_DESC not between", value1, value2, "proDesc");
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