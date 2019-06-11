package setflag.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysFlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
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

    public SysFlagExample() {
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

        public Criteria andSysFlagIdIsNull() {
            addCriterion("sys_flag_id is null");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdIsNotNull() {
            addCriterion("sys_flag_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdEqualTo(String value) {
            addCriterion("sys_flag_id =", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdNotEqualTo(String value) {
            addCriterion("sys_flag_id <>", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdGreaterThan(String value) {
            addCriterion("sys_flag_id >", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_flag_id >=", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdLessThan(String value) {
            addCriterion("sys_flag_id <", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdLessThanOrEqualTo(String value) {
            addCriterion("sys_flag_id <=", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdLike(String value) {
            addCriterion("sys_flag_id like", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdNotLike(String value) {
            addCriterion("sys_flag_id not like", value, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdIn(List<String> values) {
            addCriterion("sys_flag_id in", values, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdNotIn(List<String> values) {
            addCriterion("sys_flag_id not in", values, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdBetween(String value1, String value2) {
            addCriterion("sys_flag_id between", value1, value2, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagIdNotBetween(String value1, String value2) {
            addCriterion("sys_flag_id not between", value1, value2, "sysFlagId");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleIsNull() {
            addCriterion("sys_flag_title is null");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleIsNotNull() {
            addCriterion("sys_flag_title is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleEqualTo(String value) {
            addCriterion("sys_flag_title =", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleNotEqualTo(String value) {
            addCriterion("sys_flag_title <>", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleGreaterThan(String value) {
            addCriterion("sys_flag_title >", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sys_flag_title >=", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleLessThan(String value) {
            addCriterion("sys_flag_title <", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleLessThanOrEqualTo(String value) {
            addCriterion("sys_flag_title <=", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleLike(String value) {
            addCriterion("sys_flag_title like", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleNotLike(String value) {
            addCriterion("sys_flag_title not like", value, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleIn(List<String> values) {
            addCriterion("sys_flag_title in", values, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleNotIn(List<String> values) {
            addCriterion("sys_flag_title not in", values, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleBetween(String value1, String value2) {
            addCriterion("sys_flag_title between", value1, value2, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagTitleNotBetween(String value1, String value2) {
            addCriterion("sys_flag_title not between", value1, value2, "sysFlagTitle");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentIsNull() {
            addCriterion("sys_flag_content is null");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentIsNotNull() {
            addCriterion("sys_flag_content is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentEqualTo(String value) {
            addCriterion("sys_flag_content =", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentNotEqualTo(String value) {
            addCriterion("sys_flag_content <>", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentGreaterThan(String value) {
            addCriterion("sys_flag_content >", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentGreaterThanOrEqualTo(String value) {
            addCriterion("sys_flag_content >=", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentLessThan(String value) {
            addCriterion("sys_flag_content <", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentLessThanOrEqualTo(String value) {
            addCriterion("sys_flag_content <=", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentLike(String value) {
            addCriterion("sys_flag_content like", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentNotLike(String value) {
            addCriterion("sys_flag_content not like", value, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentIn(List<String> values) {
            addCriterion("sys_flag_content in", values, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentNotIn(List<String> values) {
            addCriterion("sys_flag_content not in", values, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentBetween(String value1, String value2) {
            addCriterion("sys_flag_content between", value1, value2, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagContentNotBetween(String value1, String value2) {
            addCriterion("sys_flag_content not between", value1, value2, "sysFlagContent");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageIsNull() {
            addCriterion("sys_flag_image is null");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageIsNotNull() {
            addCriterion("sys_flag_image is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageEqualTo(String value) {
            addCriterion("sys_flag_image =", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageNotEqualTo(String value) {
            addCriterion("sys_flag_image <>", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageGreaterThan(String value) {
            addCriterion("sys_flag_image >", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageGreaterThanOrEqualTo(String value) {
            addCriterion("sys_flag_image >=", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageLessThan(String value) {
            addCriterion("sys_flag_image <", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageLessThanOrEqualTo(String value) {
            addCriterion("sys_flag_image <=", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageLike(String value) {
            addCriterion("sys_flag_image like", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageNotLike(String value) {
            addCriterion("sys_flag_image not like", value, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageIn(List<String> values) {
            addCriterion("sys_flag_image in", values, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageNotIn(List<String> values) {
            addCriterion("sys_flag_image not in", values, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageBetween(String value1, String value2) {
            addCriterion("sys_flag_image between", value1, value2, "sysFlagImage");
            return (Criteria) this;
        }

        public Criteria andSysFlagImageNotBetween(String value1, String value2) {
            addCriterion("sys_flag_image not between", value1, value2, "sysFlagImage");
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