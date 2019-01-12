package com.youzhong.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andThumbnailfilenameIsNull() {
            addCriterion("THUMBNAILFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameIsNotNull() {
            addCriterion("THUMBNAILFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameEqualTo(String value) {
            addCriterion("THUMBNAILFILENAME =", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameNotEqualTo(String value) {
            addCriterion("THUMBNAILFILENAME <>", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameGreaterThan(String value) {
            addCriterion("THUMBNAILFILENAME >", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("THUMBNAILFILENAME >=", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameLessThan(String value) {
            addCriterion("THUMBNAILFILENAME <", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameLessThanOrEqualTo(String value) {
            addCriterion("THUMBNAILFILENAME <=", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameLike(String value) {
            addCriterion("THUMBNAILFILENAME like", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameNotLike(String value) {
            addCriterion("THUMBNAILFILENAME not like", value, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameIn(List<String> values) {
            addCriterion("THUMBNAILFILENAME in", values, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameNotIn(List<String> values) {
            addCriterion("THUMBNAILFILENAME not in", values, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameBetween(String value1, String value2) {
            addCriterion("THUMBNAILFILENAME between", value1, value2, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andThumbnailfilenameNotBetween(String value1, String value2) {
            addCriterion("THUMBNAILFILENAME not between", value1, value2, "thumbnailfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameIsNull() {
            addCriterion("NEWFILENAME is null");
            return (Criteria) this;
        }

        public Criteria andNewfilenameIsNotNull() {
            addCriterion("NEWFILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andNewfilenameEqualTo(String value) {
            addCriterion("NEWFILENAME =", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameNotEqualTo(String value) {
            addCriterion("NEWFILENAME <>", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameGreaterThan(String value) {
            addCriterion("NEWFILENAME >", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("NEWFILENAME >=", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameLessThan(String value) {
            addCriterion("NEWFILENAME <", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameLessThanOrEqualTo(String value) {
            addCriterion("NEWFILENAME <=", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameLike(String value) {
            addCriterion("NEWFILENAME like", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameNotLike(String value) {
            addCriterion("NEWFILENAME not like", value, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameIn(List<String> values) {
            addCriterion("NEWFILENAME in", values, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameNotIn(List<String> values) {
            addCriterion("NEWFILENAME not in", values, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameBetween(String value1, String value2) {
            addCriterion("NEWFILENAME between", value1, value2, "newfilename");
            return (Criteria) this;
        }

        public Criteria andNewfilenameNotBetween(String value1, String value2) {
            addCriterion("NEWFILENAME not between", value1, value2, "newfilename");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNull() {
            addCriterion("CONTENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNotNull() {
            addCriterion("CONTENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContenttypeEqualTo(String value) {
            addCriterion("CONTENTTYPE =", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotEqualTo(String value) {
            addCriterion("CONTENTTYPE <>", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThan(String value) {
            addCriterion("CONTENTTYPE >", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTTYPE >=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThan(String value) {
            addCriterion("CONTENTTYPE <", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENTTYPE <=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLike(String value) {
            addCriterion("CONTENTTYPE like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotLike(String value) {
            addCriterion("CONTENTTYPE not like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeIn(List<String> values) {
            addCriterion("CONTENTTYPE in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotIn(List<String> values) {
            addCriterion("CONTENTTYPE not in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeBetween(String value1, String value2) {
            addCriterion("CONTENTTYPE between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotBetween(String value1, String value2) {
            addCriterion("CONTENTTYPE not between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andImagesizeIsNull() {
            addCriterion("IMAGESIZE is null");
            return (Criteria) this;
        }

        public Criteria andImagesizeIsNotNull() {
            addCriterion("IMAGESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andImagesizeEqualTo(BigDecimal value) {
            addCriterion("IMAGESIZE =", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotEqualTo(BigDecimal value) {
            addCriterion("IMAGESIZE <>", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeGreaterThan(BigDecimal value) {
            addCriterion("IMAGESIZE >", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMAGESIZE >=", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeLessThan(BigDecimal value) {
            addCriterion("IMAGESIZE <", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMAGESIZE <=", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeIn(List<BigDecimal> values) {
            addCriterion("IMAGESIZE in", values, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotIn(List<BigDecimal> values) {
            addCriterion("IMAGESIZE not in", values, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMAGESIZE between", value1, value2, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMAGESIZE not between", value1, value2, "imagesize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeIsNull() {
            addCriterion("THUMBNAILSIZE is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeIsNotNull() {
            addCriterion("THUMBNAILSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeEqualTo(BigDecimal value) {
            addCriterion("THUMBNAILSIZE =", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeNotEqualTo(BigDecimal value) {
            addCriterion("THUMBNAILSIZE <>", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeGreaterThan(BigDecimal value) {
            addCriterion("THUMBNAILSIZE >", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THUMBNAILSIZE >=", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeLessThan(BigDecimal value) {
            addCriterion("THUMBNAILSIZE <", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THUMBNAILSIZE <=", value, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeIn(List<BigDecimal> values) {
            addCriterion("THUMBNAILSIZE in", values, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeNotIn(List<BigDecimal> values) {
            addCriterion("THUMBNAILSIZE not in", values, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THUMBNAILSIZE between", value1, value2, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andThumbnailsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THUMBNAILSIZE not between", value1, value2, "thumbnailsize");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNull() {
            addCriterion("DATECREATED is null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIsNotNull() {
            addCriterion("DATECREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDatecreatedEqualTo(Date value) {
            addCriterionForJDBCDate("DATECREATED =", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATECREATED <>", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATECREATED >", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATECREATED >=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThan(Date value) {
            addCriterionForJDBCDate("DATECREATED <", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATECREATED <=", value, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedIn(List<Date> values) {
            addCriterionForJDBCDate("DATECREATED in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATECREATED not in", values, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATECREATED between", value1, value2, "datecreated");
            return (Criteria) this;
        }

        public Criteria andDatecreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATECREATED not between", value1, value2, "datecreated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedIsNull() {
            addCriterion("LASTUPDATED is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedIsNotNull() {
            addCriterion("LASTUPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatedEqualTo(Date value) {
            addCriterionForJDBCDate("LASTUPDATED =", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("LASTUPDATED <>", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedGreaterThan(Date value) {
            addCriterionForJDBCDate("LASTUPDATED >", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTUPDATED >=", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedLessThan(Date value) {
            addCriterionForJDBCDate("LASTUPDATED <", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTUPDATED <=", value, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedIn(List<Date> values) {
            addCriterionForJDBCDate("LASTUPDATED in", values, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("LASTUPDATED not in", values, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTUPDATED between", value1, value2, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andLastupdatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTUPDATED not between", value1, value2, "lastupdated");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIsNull() {
            addCriterion("THUMBNAILURL is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIsNotNull() {
            addCriterion("THUMBNAILURL is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlEqualTo(String value) {
            addCriterion("THUMBNAILURL =", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotEqualTo(String value) {
            addCriterion("THUMBNAILURL <>", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlGreaterThan(String value) {
            addCriterion("THUMBNAILURL >", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlGreaterThanOrEqualTo(String value) {
            addCriterion("THUMBNAILURL >=", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLessThan(String value) {
            addCriterion("THUMBNAILURL <", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLessThanOrEqualTo(String value) {
            addCriterion("THUMBNAILURL <=", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLike(String value) {
            addCriterion("THUMBNAILURL like", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotLike(String value) {
            addCriterion("THUMBNAILURL not like", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIn(List<String> values) {
            addCriterion("THUMBNAILURL in", values, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotIn(List<String> values) {
            addCriterion("THUMBNAILURL not in", values, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlBetween(String value1, String value2) {
            addCriterion("THUMBNAILURL between", value1, value2, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotBetween(String value1, String value2) {
            addCriterion("THUMBNAILURL not between", value1, value2, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlIsNull() {
            addCriterion("DELETEURL is null");
            return (Criteria) this;
        }

        public Criteria andDeleteurlIsNotNull() {
            addCriterion("DELETEURL is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteurlEqualTo(String value) {
            addCriterion("DELETEURL =", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlNotEqualTo(String value) {
            addCriterion("DELETEURL <>", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlGreaterThan(String value) {
            addCriterion("DELETEURL >", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlGreaterThanOrEqualTo(String value) {
            addCriterion("DELETEURL >=", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlLessThan(String value) {
            addCriterion("DELETEURL <", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlLessThanOrEqualTo(String value) {
            addCriterion("DELETEURL <=", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlLike(String value) {
            addCriterion("DELETEURL like", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlNotLike(String value) {
            addCriterion("DELETEURL not like", value, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlIn(List<String> values) {
            addCriterion("DELETEURL in", values, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlNotIn(List<String> values) {
            addCriterion("DELETEURL not in", values, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlBetween(String value1, String value2) {
            addCriterion("DELETEURL between", value1, value2, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeleteurlNotBetween(String value1, String value2) {
            addCriterion("DELETEURL not between", value1, value2, "deleteurl");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNull() {
            addCriterion("DELETETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIsNotNull() {
            addCriterion("DELETETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetypeEqualTo(String value) {
            addCriterion("DELETETYPE =", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotEqualTo(String value) {
            addCriterion("DELETETYPE <>", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThan(String value) {
            addCriterion("DELETETYPE >", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DELETETYPE >=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThan(String value) {
            addCriterion("DELETETYPE <", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("DELETETYPE <=", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeLike(String value) {
            addCriterion("DELETETYPE like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotLike(String value) {
            addCriterion("DELETETYPE not like", value, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeIn(List<String> values) {
            addCriterion("DELETETYPE in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotIn(List<String> values) {
            addCriterion("DELETETYPE not in", values, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeBetween(String value1, String value2) {
            addCriterion("DELETETYPE between", value1, value2, "deletetype");
            return (Criteria) this;
        }

        public Criteria andDeletetypeNotBetween(String value1, String value2) {
            addCriterion("DELETETYPE not between", value1, value2, "deletetype");
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