package setflag.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DailyPunchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected int offset;

   	protected int limit;
   	
   	public int getOffset() {
   		return offset;
   	}

   	public void setOffset(int offset) {
   		this.offset = offset;
   	}

   	public int getLimit() {
   		return limit;
   	}

   	public void setLimit(int limit) {
   		this.limit = limit;
   	}
   	
    protected List<Criteria> oredCriteria;

    public DailyPunchExample() {
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

        public Criteria andDailyPunchIdIsNull() {
            addCriterion("daily_punch_id is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdIsNotNull() {
            addCriterion("daily_punch_id is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdEqualTo(String value) {
            addCriterion("daily_punch_id =", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdNotEqualTo(String value) {
            addCriterion("daily_punch_id <>", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdGreaterThan(String value) {
            addCriterion("daily_punch_id >", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdGreaterThanOrEqualTo(String value) {
            addCriterion("daily_punch_id >=", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdLessThan(String value) {
            addCriterion("daily_punch_id <", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdLessThanOrEqualTo(String value) {
            addCriterion("daily_punch_id <=", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdLike(String value) {
            addCriterion("daily_punch_id like", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdNotLike(String value) {
            addCriterion("daily_punch_id not like", value, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdIn(List<String> values) {
            addCriterion("daily_punch_id in", values, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdNotIn(List<String> values) {
            addCriterion("daily_punch_id not in", values, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdBetween(String value1, String value2) {
            addCriterion("daily_punch_id between", value1, value2, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchIdNotBetween(String value1, String value2) {
            addCriterion("daily_punch_id not between", value1, value2, "dailyPunchId");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleIsNull() {
            addCriterion("daily_punch_title is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleIsNotNull() {
            addCriterion("daily_punch_title is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleEqualTo(String value) {
            addCriterion("daily_punch_title =", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleNotEqualTo(String value) {
            addCriterion("daily_punch_title <>", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleGreaterThan(String value) {
            addCriterion("daily_punch_title >", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleGreaterThanOrEqualTo(String value) {
            addCriterion("daily_punch_title >=", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleLessThan(String value) {
            addCriterion("daily_punch_title <", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleLessThanOrEqualTo(String value) {
            addCriterion("daily_punch_title <=", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleLike(String value) {
            addCriterion("daily_punch_title like", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleNotLike(String value) {
            addCriterion("daily_punch_title not like", value, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleIn(List<String> values) {
            addCriterion("daily_punch_title in", values, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleNotIn(List<String> values) {
            addCriterion("daily_punch_title not in", values, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleBetween(String value1, String value2) {
            addCriterion("daily_punch_title between", value1, value2, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchTitleNotBetween(String value1, String value2) {
            addCriterion("daily_punch_title not between", value1, value2, "dailyPunchTitle");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageIsNull() {
            addCriterion("daily_punch_image is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageIsNotNull() {
            addCriterion("daily_punch_image is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageEqualTo(String value) {
            addCriterion("daily_punch_image =", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageNotEqualTo(String value) {
            addCriterion("daily_punch_image <>", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageGreaterThan(String value) {
            addCriterion("daily_punch_image >", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageGreaterThanOrEqualTo(String value) {
            addCriterion("daily_punch_image >=", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageLessThan(String value) {
            addCriterion("daily_punch_image <", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageLessThanOrEqualTo(String value) {
            addCriterion("daily_punch_image <=", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageLike(String value) {
            addCriterion("daily_punch_image like", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageNotLike(String value) {
            addCriterion("daily_punch_image not like", value, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageIn(List<String> values) {
            addCriterion("daily_punch_image in", values, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageNotIn(List<String> values) {
            addCriterion("daily_punch_image not in", values, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageBetween(String value1, String value2) {
            addCriterion("daily_punch_image between", value1, value2, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchImageNotBetween(String value1, String value2) {
            addCriterion("daily_punch_image not between", value1, value2, "dailyPunchImage");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateIsNull() {
            addCriterion("daily_punch_date is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateIsNotNull() {
            addCriterion("daily_punch_date is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateEqualTo(Date value) {
            addCriterionForJDBCDate("daily_punch_date =", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("daily_punch_date <>", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("daily_punch_date >", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("daily_punch_date >=", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateLessThan(Date value) {
            addCriterionForJDBCDate("daily_punch_date <", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("daily_punch_date <=", value, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateIn(List<Date> values) {
            addCriterionForJDBCDate("daily_punch_date in", values, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("daily_punch_date not in", values, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("daily_punch_date between", value1, value2, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("daily_punch_date not between", value1, value2, "dailyPunchDate");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumIsNull() {
            addCriterion("daily_punch_comment_num is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumIsNotNull() {
            addCriterion("daily_punch_comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumEqualTo(Integer value) {
            addCriterion("daily_punch_comment_num =", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumNotEqualTo(Integer value) {
            addCriterion("daily_punch_comment_num <>", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumGreaterThan(Integer value) {
            addCriterion("daily_punch_comment_num >", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_punch_comment_num >=", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumLessThan(Integer value) {
            addCriterion("daily_punch_comment_num <", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("daily_punch_comment_num <=", value, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumIn(List<Integer> values) {
            addCriterion("daily_punch_comment_num in", values, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumNotIn(List<Integer> values) {
            addCriterion("daily_punch_comment_num not in", values, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("daily_punch_comment_num between", value1, value2, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_punch_comment_num not between", value1, value2, "dailyPunchCommentNum");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeIsNull() {
            addCriterion("daily_punch_agree is null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeIsNotNull() {
            addCriterion("daily_punch_agree is not null");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeEqualTo(Integer value) {
            addCriterion("daily_punch_agree =", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeNotEqualTo(Integer value) {
            addCriterion("daily_punch_agree <>", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeGreaterThan(Integer value) {
            addCriterion("daily_punch_agree >", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_punch_agree >=", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeLessThan(Integer value) {
            addCriterion("daily_punch_agree <", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("daily_punch_agree <=", value, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeIn(List<Integer> values) {
            addCriterion("daily_punch_agree in", values, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeNotIn(List<Integer> values) {
            addCriterion("daily_punch_agree not in", values, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeBetween(Integer value1, Integer value2) {
            addCriterion("daily_punch_agree between", value1, value2, "dailyPunchAgree");
            return (Criteria) this;
        }

        public Criteria andDailyPunchAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_punch_agree not between", value1, value2, "dailyPunchAgree");
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