package setflag.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andCommentAgreeIsNull() {
            addCriterion("comment_agree is null");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeIsNotNull() {
            addCriterion("comment_agree is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeEqualTo(Integer value) {
            addCriterion("comment_agree =", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeNotEqualTo(Integer value) {
            addCriterion("comment_agree <>", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeGreaterThan(Integer value) {
            addCriterion("comment_agree >", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_agree >=", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeLessThan(Integer value) {
            addCriterion("comment_agree <", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_agree <=", value, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeIn(List<Integer> values) {
            addCriterion("comment_agree in", values, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeNotIn(List<Integer> values) {
            addCriterion("comment_agree not in", values, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeBetween(Integer value1, Integer value2) {
            addCriterion("comment_agree between", value1, value2, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_agree not between", value1, value2, "commentAgree");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNull() {
            addCriterion("comment_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNotNull() {
            addCriterion("comment_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeEqualTo(Date value) {
            addCriterion("comment_create_time =", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotEqualTo(Date value) {
            addCriterion("comment_create_time <>", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThan(Date value) {
            addCriterion("comment_create_time >", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_create_time >=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThan(Date value) {
            addCriterion("comment_create_time <", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_create_time <=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIn(List<Date> values) {
            addCriterion("comment_create_time in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotIn(List<Date> values) {
            addCriterion("comment_create_time not in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("comment_create_time between", value1, value2, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_create_time not between", value1, value2, "commentCreateTime");
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