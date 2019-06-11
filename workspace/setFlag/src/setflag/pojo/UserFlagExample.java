package setflag.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserFlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public UserFlagExample() {
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

        public Criteria andUserFlagIdIsNull() {
            addCriterion("user_flag_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdIsNotNull() {
            addCriterion("user_flag_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdEqualTo(String value) {
            addCriterion("user_flag_id =", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdNotEqualTo(String value) {
            addCriterion("user_flag_id <>", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdGreaterThan(String value) {
            addCriterion("user_flag_id >", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_flag_id >=", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdLessThan(String value) {
            addCriterion("user_flag_id <", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdLessThanOrEqualTo(String value) {
            addCriterion("user_flag_id <=", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdLike(String value) {
            addCriterion("user_flag_id like", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdNotLike(String value) {
            addCriterion("user_flag_id not like", value, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdIn(List<String> values) {
            addCriterion("user_flag_id in", values, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdNotIn(List<String> values) {
            addCriterion("user_flag_id not in", values, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdBetween(String value1, String value2) {
            addCriterion("user_flag_id between", value1, value2, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagIdNotBetween(String value1, String value2) {
            addCriterion("user_flag_id not between", value1, value2, "userFlagId");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleIsNull() {
            addCriterion("user_flag_title is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleIsNotNull() {
            addCriterion("user_flag_title is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleEqualTo(String value) {
            addCriterion("user_flag_title =", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleNotEqualTo(String value) {
            addCriterion("user_flag_title <>", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleGreaterThan(String value) {
            addCriterion("user_flag_title >", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleGreaterThanOrEqualTo(String value) {
            addCriterion("user_flag_title >=", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleLessThan(String value) {
            addCriterion("user_flag_title <", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleLessThanOrEqualTo(String value) {
            addCriterion("user_flag_title <=", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleLike(String value) {
            addCriterion("user_flag_title like", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleNotLike(String value) {
            addCriterion("user_flag_title not like", value, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleIn(List<String> values) {
            addCriterion("user_flag_title in", values, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleNotIn(List<String> values) {
            addCriterion("user_flag_title not in", values, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleBetween(String value1, String value2) {
            addCriterion("user_flag_title between", value1, value2, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagTitleNotBetween(String value1, String value2) {
            addCriterion("user_flag_title not between", value1, value2, "userFlagTitle");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentIsNull() {
            addCriterion("user_flag_content is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentIsNotNull() {
            addCriterion("user_flag_content is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentEqualTo(String value) {
            addCriterion("user_flag_content =", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentNotEqualTo(String value) {
            addCriterion("user_flag_content <>", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentGreaterThan(String value) {
            addCriterion("user_flag_content >", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentGreaterThanOrEqualTo(String value) {
            addCriterion("user_flag_content >=", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentLessThan(String value) {
            addCriterion("user_flag_content <", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentLessThanOrEqualTo(String value) {
            addCriterion("user_flag_content <=", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentLike(String value) {
            addCriterion("user_flag_content like", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentNotLike(String value) {
            addCriterion("user_flag_content not like", value, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentIn(List<String> values) {
            addCriterion("user_flag_content in", values, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentNotIn(List<String> values) {
            addCriterion("user_flag_content not in", values, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentBetween(String value1, String value2) {
            addCriterion("user_flag_content between", value1, value2, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagContentNotBetween(String value1, String value2) {
            addCriterion("user_flag_content not between", value1, value2, "userFlagContent");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateIsNull() {
            addCriterion("user_flag_date is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateIsNotNull() {
            addCriterion("user_flag_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_flag_date =", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_flag_date <>", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_flag_date >", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_flag_date >=", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateLessThan(Date value) {
            addCriterionForJDBCDate("user_flag_date <", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_flag_date <=", value, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_flag_date in", values, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_flag_date not in", values, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_flag_date between", value1, value2, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_flag_date not between", value1, value2, "userFlagDate");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageIsNull() {
            addCriterion("user_flag_image is null");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageIsNotNull() {
            addCriterion("user_flag_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageEqualTo(String value) {
            addCriterion("user_flag_image =", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageNotEqualTo(String value) {
            addCriterion("user_flag_image <>", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageGreaterThan(String value) {
            addCriterion("user_flag_image >", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_flag_image >=", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageLessThan(String value) {
            addCriterion("user_flag_image <", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageLessThanOrEqualTo(String value) {
            addCriterion("user_flag_image <=", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageLike(String value) {
            addCriterion("user_flag_image like", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageNotLike(String value) {
            addCriterion("user_flag_image not like", value, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageIn(List<String> values) {
            addCriterion("user_flag_image in", values, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageNotIn(List<String> values) {
            addCriterion("user_flag_image not in", values, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageBetween(String value1, String value2) {
            addCriterion("user_flag_image between", value1, value2, "userFlagImage");
            return (Criteria) this;
        }

        public Criteria andUserFlagImageNotBetween(String value1, String value2) {
            addCriterion("user_flag_image not between", value1, value2, "userFlagImage");
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