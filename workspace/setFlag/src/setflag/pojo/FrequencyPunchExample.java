package setflag.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FrequencyPunchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FrequencyPunchExample() {
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

        public Criteria andFrequencyPunchIdIsNull() {
            addCriterion("frequency_punch_id is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdIsNotNull() {
            addCriterion("frequency_punch_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdEqualTo(String value) {
            addCriterion("frequency_punch_id =", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdNotEqualTo(String value) {
            addCriterion("frequency_punch_id <>", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdGreaterThan(String value) {
            addCriterion("frequency_punch_id >", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdGreaterThanOrEqualTo(String value) {
            addCriterion("frequency_punch_id >=", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdLessThan(String value) {
            addCriterion("frequency_punch_id <", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdLessThanOrEqualTo(String value) {
            addCriterion("frequency_punch_id <=", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdLike(String value) {
            addCriterion("frequency_punch_id like", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdNotLike(String value) {
            addCriterion("frequency_punch_id not like", value, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdIn(List<String> values) {
            addCriterion("frequency_punch_id in", values, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdNotIn(List<String> values) {
            addCriterion("frequency_punch_id not in", values, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdBetween(String value1, String value2) {
            addCriterion("frequency_punch_id between", value1, value2, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchIdNotBetween(String value1, String value2) {
            addCriterion("frequency_punch_id not between", value1, value2, "frequencyPunchId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFlagIdIsNull() {
            addCriterion("flag_id is null");
            return (Criteria) this;
        }

        public Criteria andFlagIdIsNotNull() {
            addCriterion("flag_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlagIdEqualTo(String value) {
            addCriterion("flag_id =", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotEqualTo(String value) {
            addCriterion("flag_id <>", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThan(String value) {
            addCriterion("flag_id >", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThanOrEqualTo(String value) {
            addCriterion("flag_id >=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThan(String value) {
            addCriterion("flag_id <", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThanOrEqualTo(String value) {
            addCriterion("flag_id <=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLike(String value) {
            addCriterion("flag_id like", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotLike(String value) {
            addCriterion("flag_id not like", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdIn(List<String> values) {
            addCriterion("flag_id in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotIn(List<String> values) {
            addCriterion("flag_id not in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdBetween(String value1, String value2) {
            addCriterion("flag_id between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotBetween(String value1, String value2) {
            addCriterion("flag_id not between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andIsTureIsNull() {
            addCriterion("is_ture is null");
            return (Criteria) this;
        }

        public Criteria andIsTureIsNotNull() {
            addCriterion("is_ture is not null");
            return (Criteria) this;
        }

        public Criteria andIsTureEqualTo(String value) {
            addCriterion("is_ture =", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureNotEqualTo(String value) {
            addCriterion("is_ture <>", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureGreaterThan(String value) {
            addCriterion("is_ture >", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureGreaterThanOrEqualTo(String value) {
            addCriterion("is_ture >=", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureLessThan(String value) {
            addCriterion("is_ture <", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureLessThanOrEqualTo(String value) {
            addCriterion("is_ture <=", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureLike(String value) {
            addCriterion("is_ture like", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureNotLike(String value) {
            addCriterion("is_ture not like", value, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureIn(List<String> values) {
            addCriterion("is_ture in", values, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureNotIn(List<String> values) {
            addCriterion("is_ture not in", values, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureBetween(String value1, String value2) {
            addCriterion("is_ture between", value1, value2, "isTure");
            return (Criteria) this;
        }

        public Criteria andIsTureNotBetween(String value1, String value2) {
            addCriterion("is_ture not between", value1, value2, "isTure");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateIsNull() {
            addCriterion("frequency_punch_date is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateIsNotNull() {
            addCriterion("frequency_punch_date is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateEqualTo(Date value) {
            addCriterionForJDBCDate("frequency_punch_date =", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("frequency_punch_date <>", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("frequency_punch_date >", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("frequency_punch_date >=", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateLessThan(Date value) {
            addCriterionForJDBCDate("frequency_punch_date <", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("frequency_punch_date <=", value, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateIn(List<Date> values) {
            addCriterionForJDBCDate("frequency_punch_date in", values, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("frequency_punch_date not in", values, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("frequency_punch_date between", value1, value2, "frequencyPunchDate");
            return (Criteria) this;
        }

        public Criteria andFrequencyPunchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("frequency_punch_date not between", value1, value2, "frequencyPunchDate");
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