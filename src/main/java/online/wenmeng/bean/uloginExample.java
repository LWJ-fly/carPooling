package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.List;

public class uloginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public uloginExample() {
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

        public Criteria andQqloginIsNull() {
            addCriterion("qqLogin is null");
            return (Criteria) this;
        }

        public Criteria andQqloginIsNotNull() {
            addCriterion("qqLogin is not null");
            return (Criteria) this;
        }

        public Criteria andQqloginEqualTo(Integer value) {
            addCriterion("qqLogin =", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotEqualTo(Integer value) {
            addCriterion("qqLogin <>", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThan(Integer value) {
            addCriterion("qqLogin >", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("qqLogin >=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThan(Integer value) {
            addCriterion("qqLogin <", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginLessThanOrEqualTo(Integer value) {
            addCriterion("qqLogin <=", value, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginIn(List<Integer> values) {
            addCriterion("qqLogin in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotIn(List<Integer> values) {
            addCriterion("qqLogin not in", values, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginBetween(Integer value1, Integer value2) {
            addCriterion("qqLogin between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andQqloginNotBetween(Integer value1, Integer value2) {
            addCriterion("qqLogin not between", value1, value2, "qqlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginIsNull() {
            addCriterion("wxLogin is null");
            return (Criteria) this;
        }

        public Criteria andWxloginIsNotNull() {
            addCriterion("wxLogin is not null");
            return (Criteria) this;
        }

        public Criteria andWxloginEqualTo(String value) {
            addCriterion("wxLogin =", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotEqualTo(String value) {
            addCriterion("wxLogin <>", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginGreaterThan(String value) {
            addCriterion("wxLogin >", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginGreaterThanOrEqualTo(String value) {
            addCriterion("wxLogin >=", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLessThan(String value) {
            addCriterion("wxLogin <", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLessThanOrEqualTo(String value) {
            addCriterion("wxLogin <=", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginLike(String value) {
            addCriterion("wxLogin like", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotLike(String value) {
            addCriterion("wxLogin not like", value, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginIn(List<String> values) {
            addCriterion("wxLogin in", values, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotIn(List<String> values) {
            addCriterion("wxLogin not in", values, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginBetween(String value1, String value2) {
            addCriterion("wxLogin between", value1, value2, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andWxloginNotBetween(String value1, String value2) {
            addCriterion("wxLogin not between", value1, value2, "wxlogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginIsNull() {
            addCriterion("zfbLogin is null");
            return (Criteria) this;
        }

        public Criteria andZfbloginIsNotNull() {
            addCriterion("zfbLogin is not null");
            return (Criteria) this;
        }

        public Criteria andZfbloginEqualTo(String value) {
            addCriterion("zfbLogin =", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotEqualTo(String value) {
            addCriterion("zfbLogin <>", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginGreaterThan(String value) {
            addCriterion("zfbLogin >", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginGreaterThanOrEqualTo(String value) {
            addCriterion("zfbLogin >=", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLessThan(String value) {
            addCriterion("zfbLogin <", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLessThanOrEqualTo(String value) {
            addCriterion("zfbLogin <=", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginLike(String value) {
            addCriterion("zfbLogin like", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotLike(String value) {
            addCriterion("zfbLogin not like", value, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginIn(List<String> values) {
            addCriterion("zfbLogin in", values, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotIn(List<String> values) {
            addCriterion("zfbLogin not in", values, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginBetween(String value1, String value2) {
            addCriterion("zfbLogin between", value1, value2, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andZfbloginNotBetween(String value1, String value2) {
            addCriterion("zfbLogin not between", value1, value2, "zfblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginIsNull() {
            addCriterion("tbLogin is null");
            return (Criteria) this;
        }

        public Criteria andTbloginIsNotNull() {
            addCriterion("tbLogin is not null");
            return (Criteria) this;
        }

        public Criteria andTbloginEqualTo(String value) {
            addCriterion("tbLogin =", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotEqualTo(String value) {
            addCriterion("tbLogin <>", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginGreaterThan(String value) {
            addCriterion("tbLogin >", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginGreaterThanOrEqualTo(String value) {
            addCriterion("tbLogin >=", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLessThan(String value) {
            addCriterion("tbLogin <", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLessThanOrEqualTo(String value) {
            addCriterion("tbLogin <=", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginLike(String value) {
            addCriterion("tbLogin like", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotLike(String value) {
            addCriterion("tbLogin not like", value, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginIn(List<String> values) {
            addCriterion("tbLogin in", values, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotIn(List<String> values) {
            addCriterion("tbLogin not in", values, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginBetween(String value1, String value2) {
            addCriterion("tbLogin between", value1, value2, "tblogin");
            return (Criteria) this;
        }

        public Criteria andTbloginNotBetween(String value1, String value2) {
            addCriterion("tbLogin not between", value1, value2, "tblogin");
            return (Criteria) this;
        }

        public Criteria andZhloginIsNull() {
            addCriterion("zhLogin is null");
            return (Criteria) this;
        }

        public Criteria andZhloginIsNotNull() {
            addCriterion("zhLogin is not null");
            return (Criteria) this;
        }

        public Criteria andZhloginEqualTo(String value) {
            addCriterion("zhLogin =", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginNotEqualTo(String value) {
            addCriterion("zhLogin <>", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginGreaterThan(String value) {
            addCriterion("zhLogin >", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginGreaterThanOrEqualTo(String value) {
            addCriterion("zhLogin >=", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginLessThan(String value) {
            addCriterion("zhLogin <", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginLessThanOrEqualTo(String value) {
            addCriterion("zhLogin <=", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginLike(String value) {
            addCriterion("zhLogin like", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginNotLike(String value) {
            addCriterion("zhLogin not like", value, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginIn(List<String> values) {
            addCriterion("zhLogin in", values, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginNotIn(List<String> values) {
            addCriterion("zhLogin not in", values, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginBetween(String value1, String value2) {
            addCriterion("zhLogin between", value1, value2, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhloginNotBetween(String value1, String value2) {
            addCriterion("zhLogin not between", value1, value2, "zhlogin");
            return (Criteria) this;
        }

        public Criteria andZhpwdIsNull() {
            addCriterion("zhPwd is null");
            return (Criteria) this;
        }

        public Criteria andZhpwdIsNotNull() {
            addCriterion("zhPwd is not null");
            return (Criteria) this;
        }

        public Criteria andZhpwdEqualTo(String value) {
            addCriterion("zhPwd =", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdNotEqualTo(String value) {
            addCriterion("zhPwd <>", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdGreaterThan(String value) {
            addCriterion("zhPwd >", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdGreaterThanOrEqualTo(String value) {
            addCriterion("zhPwd >=", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdLessThan(String value) {
            addCriterion("zhPwd <", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdLessThanOrEqualTo(String value) {
            addCriterion("zhPwd <=", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdLike(String value) {
            addCriterion("zhPwd like", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdNotLike(String value) {
            addCriterion("zhPwd not like", value, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdIn(List<String> values) {
            addCriterion("zhPwd in", values, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdNotIn(List<String> values) {
            addCriterion("zhPwd not in", values, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdBetween(String value1, String value2) {
            addCriterion("zhPwd between", value1, value2, "zhpwd");
            return (Criteria) this;
        }

        public Criteria andZhpwdNotBetween(String value1, String value2) {
            addCriterion("zhPwd not between", value1, value2, "zhpwd");
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