package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UinacarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UinacarinfoExample() {
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

        public Criteria andCaridIsNull() {
            addCriterion("carID is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carID is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carID =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carID <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carID >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carID >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carID <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carID <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carID in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carID not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carID between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carID not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIsNull() {
            addCriterion("inCarMsg is null");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIsNotNull() {
            addCriterion("inCarMsg is not null");
            return (Criteria) this;
        }

        public Criteria andIncarmsgEqualTo(String value) {
            addCriterion("inCarMsg =", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotEqualTo(String value) {
            addCriterion("inCarMsg <>", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgGreaterThan(String value) {
            addCriterion("inCarMsg >", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgGreaterThanOrEqualTo(String value) {
            addCriterion("inCarMsg >=", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLessThan(String value) {
            addCriterion("inCarMsg <", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLessThanOrEqualTo(String value) {
            addCriterion("inCarMsg <=", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgLike(String value) {
            addCriterion("inCarMsg like", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotLike(String value) {
            addCriterion("inCarMsg not like", value, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgIn(List<String> values) {
            addCriterion("inCarMsg in", values, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotIn(List<String> values) {
            addCriterion("inCarMsg not in", values, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgBetween(String value1, String value2) {
            addCriterion("inCarMsg between", value1, value2, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andIncarmsgNotBetween(String value1, String value2) {
            addCriterion("inCarMsg not between", value1, value2, "incarmsg");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNull() {
            addCriterion("joinTime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("joinTime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(Date value) {
            addCriterion("joinTime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(Date value) {
            addCriterion("joinTime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(Date value) {
            addCriterion("joinTime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joinTime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(Date value) {
            addCriterion("joinTime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(Date value) {
            addCriterion("joinTime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<Date> values) {
            addCriterion("joinTime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<Date> values) {
            addCriterion("joinTime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(Date value1, Date value2) {
            addCriterion("joinTime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(Date value1, Date value2) {
            addCriterion("joinTime not between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNull() {
            addCriterion("carState is null");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNotNull() {
            addCriterion("carState is not null");
            return (Criteria) this;
        }

        public Criteria andCarstateEqualTo(String value) {
            addCriterion("carState =", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotEqualTo(String value) {
            addCriterion("carState <>", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThan(String value) {
            addCriterion("carState >", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThanOrEqualTo(String value) {
            addCriterion("carState >=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThan(String value) {
            addCriterion("carState <", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThanOrEqualTo(String value) {
            addCriterion("carState <=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLike(String value) {
            addCriterion("carState like", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotLike(String value) {
            addCriterion("carState not like", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateIn(List<String> values) {
            addCriterion("carState in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotIn(List<String> values) {
            addCriterion("carState not in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateBetween(String value1, String value2) {
            addCriterion("carState between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotBetween(String value1, String value2) {
            addCriterion("carState not between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andOutinfoIsNull() {
            addCriterion("outInfo is null");
            return (Criteria) this;
        }

        public Criteria andOutinfoIsNotNull() {
            addCriterion("outInfo is not null");
            return (Criteria) this;
        }

        public Criteria andOutinfoEqualTo(Integer value) {
            addCriterion("outInfo =", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotEqualTo(Integer value) {
            addCriterion("outInfo <>", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoGreaterThan(Integer value) {
            addCriterion("outInfo >", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("outInfo >=", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoLessThan(Integer value) {
            addCriterion("outInfo <", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoLessThanOrEqualTo(Integer value) {
            addCriterion("outInfo <=", value, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoIn(List<Integer> values) {
            addCriterion("outInfo in", values, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotIn(List<Integer> values) {
            addCriterion("outInfo not in", values, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoBetween(Integer value1, Integer value2) {
            addCriterion("outInfo between", value1, value2, "outinfo");
            return (Criteria) this;
        }

        public Criteria andOutinfoNotBetween(Integer value1, Integer value2) {
            addCriterion("outInfo not between", value1, value2, "outinfo");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNull() {
            addCriterion("QQNum is null");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNotNull() {
            addCriterion("QQNum is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumEqualTo(String value) {
            addCriterion("QQNum =", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotEqualTo(String value) {
            addCriterion("QQNum <>", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThan(String value) {
            addCriterion("QQNum >", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThanOrEqualTo(String value) {
            addCriterion("QQNum >=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThan(String value) {
            addCriterion("QQNum <", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThanOrEqualTo(String value) {
            addCriterion("QQNum <=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLike(String value) {
            addCriterion("QQNum like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotLike(String value) {
            addCriterion("QQNum not like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumIn(List<String> values) {
            addCriterion("QQNum in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotIn(List<String> values) {
            addCriterion("QQNum not in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumBetween(String value1, String value2) {
            addCriterion("QQNum between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotBetween(String value1, String value2) {
            addCriterion("QQNum not between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andWxnumIsNull() {
            addCriterion("WXNum is null");
            return (Criteria) this;
        }

        public Criteria andWxnumIsNotNull() {
            addCriterion("WXNum is not null");
            return (Criteria) this;
        }

        public Criteria andWxnumEqualTo(String value) {
            addCriterion("WXNum =", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotEqualTo(String value) {
            addCriterion("WXNum <>", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumGreaterThan(String value) {
            addCriterion("WXNum >", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumGreaterThanOrEqualTo(String value) {
            addCriterion("WXNum >=", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLessThan(String value) {
            addCriterion("WXNum <", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLessThanOrEqualTo(String value) {
            addCriterion("WXNum <=", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumLike(String value) {
            addCriterion("WXNum like", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotLike(String value) {
            addCriterion("WXNum not like", value, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumIn(List<String> values) {
            addCriterion("WXNum in", values, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotIn(List<String> values) {
            addCriterion("WXNum not in", values, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumBetween(String value1, String value2) {
            addCriterion("WXNum between", value1, value2, "wxnum");
            return (Criteria) this;
        }

        public Criteria andWxnumNotBetween(String value1, String value2) {
            addCriterion("WXNum not between", value1, value2, "wxnum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phoneNum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phoneNum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phoneNum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phoneNum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phoneNum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phoneNum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phoneNum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phoneNum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phoneNum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phoneNum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phoneNum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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