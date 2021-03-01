package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarpoolinginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarpoolinginfoExample() {
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

        public Criteria andUseridsIsNull() {
            addCriterion("userIDS is null");
            return (Criteria) this;
        }

        public Criteria andUseridsIsNotNull() {
            addCriterion("userIDS is not null");
            return (Criteria) this;
        }

        public Criteria andUseridsEqualTo(String value) {
            addCriterion("userIDS =", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotEqualTo(String value) {
            addCriterion("userIDS <>", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThan(String value) {
            addCriterion("userIDS >", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThanOrEqualTo(String value) {
            addCriterion("userIDS >=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThan(String value) {
            addCriterion("userIDS <", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThanOrEqualTo(String value) {
            addCriterion("userIDS <=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLike(String value) {
            addCriterion("userIDS like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotLike(String value) {
            addCriterion("userIDS not like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsIn(List<String> values) {
            addCriterion("userIDS in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotIn(List<String> values) {
            addCriterion("userIDS not in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsBetween(String value1, String value2) {
            addCriterion("userIDS between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotBetween(String value1, String value2) {
            addCriterion("userIDS not between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andGetnumIsNull() {
            addCriterion("getNum is null");
            return (Criteria) this;
        }

        public Criteria andGetnumIsNotNull() {
            addCriterion("getNum is not null");
            return (Criteria) this;
        }

        public Criteria andGetnumEqualTo(Integer value) {
            addCriterion("getNum =", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotEqualTo(Integer value) {
            addCriterion("getNum <>", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumGreaterThan(Integer value) {
            addCriterion("getNum >", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("getNum >=", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumLessThan(Integer value) {
            addCriterion("getNum <", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumLessThanOrEqualTo(Integer value) {
            addCriterion("getNum <=", value, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumIn(List<Integer> values) {
            addCriterion("getNum in", values, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotIn(List<Integer> values) {
            addCriterion("getNum not in", values, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumBetween(Integer value1, Integer value2) {
            addCriterion("getNum between", value1, value2, "getnum");
            return (Criteria) this;
        }

        public Criteria andGetnumNotBetween(Integer value1, Integer value2) {
            addCriterion("getNum not between", value1, value2, "getnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalNum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalNum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Integer value) {
            addCriterion("totalNum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Integer value) {
            addCriterion("totalNum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Integer value) {
            addCriterion("totalNum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalNum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Integer value) {
            addCriterion("totalNum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("totalNum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Integer> values) {
            addCriterion("totalNum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Integer> values) {
            addCriterion("totalNum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("totalNum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("totalNum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andReadytimeIsNull() {
            addCriterion("readyTime is null");
            return (Criteria) this;
        }

        public Criteria andReadytimeIsNotNull() {
            addCriterion("readyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReadytimeEqualTo(Date value) {
            addCriterion("readyTime =", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeNotEqualTo(Date value) {
            addCriterion("readyTime <>", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeGreaterThan(Date value) {
            addCriterion("readyTime >", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("readyTime >=", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeLessThan(Date value) {
            addCriterion("readyTime <", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeLessThanOrEqualTo(Date value) {
            addCriterion("readyTime <=", value, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeIn(List<Date> values) {
            addCriterion("readyTime in", values, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeNotIn(List<Date> values) {
            addCriterion("readyTime not in", values, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeBetween(Date value1, Date value2) {
            addCriterion("readyTime between", value1, value2, "readytime");
            return (Criteria) this;
        }

        public Criteria andReadytimeNotBetween(Date value1, Date value2) {
            addCriterion("readyTime not between", value1, value2, "readytime");
            return (Criteria) this;
        }

        public Criteria andGotimeIsNull() {
            addCriterion("GoTime is null");
            return (Criteria) this;
        }

        public Criteria andGotimeIsNotNull() {
            addCriterion("GoTime is not null");
            return (Criteria) this;
        }

        public Criteria andGotimeEqualTo(Date value) {
            addCriterion("GoTime =", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotEqualTo(Date value) {
            addCriterion("GoTime <>", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThan(Date value) {
            addCriterion("GoTime >", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GoTime >=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThan(Date value) {
            addCriterion("GoTime <", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeLessThanOrEqualTo(Date value) {
            addCriterion("GoTime <=", value, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeIn(List<Date> values) {
            addCriterion("GoTime in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotIn(List<Date> values) {
            addCriterion("GoTime not in", values, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeBetween(Date value1, Date value2) {
            addCriterion("GoTime between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andGotimeNotBetween(Date value1, Date value2) {
            addCriterion("GoTime not between", value1, value2, "gotime");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIsNull() {
            addCriterion("readyPlace is null");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIsNotNull() {
            addCriterion("readyPlace is not null");
            return (Criteria) this;
        }

        public Criteria andReadyplaceEqualTo(String value) {
            addCriterion("readyPlace =", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotEqualTo(String value) {
            addCriterion("readyPlace <>", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceGreaterThan(String value) {
            addCriterion("readyPlace >", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceGreaterThanOrEqualTo(String value) {
            addCriterion("readyPlace >=", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLessThan(String value) {
            addCriterion("readyPlace <", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLessThanOrEqualTo(String value) {
            addCriterion("readyPlace <=", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceLike(String value) {
            addCriterion("readyPlace like", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotLike(String value) {
            addCriterion("readyPlace not like", value, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceIn(List<String> values) {
            addCriterion("readyPlace in", values, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotIn(List<String> values) {
            addCriterion("readyPlace not in", values, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceBetween(String value1, String value2) {
            addCriterion("readyPlace between", value1, value2, "readyplace");
            return (Criteria) this;
        }

        public Criteria andReadyplaceNotBetween(String value1, String value2) {
            addCriterion("readyPlace not between", value1, value2, "readyplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceIsNull() {
            addCriterion("GoPlace is null");
            return (Criteria) this;
        }

        public Criteria andGoplaceIsNotNull() {
            addCriterion("GoPlace is not null");
            return (Criteria) this;
        }

        public Criteria andGoplaceEqualTo(String value) {
            addCriterion("GoPlace =", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotEqualTo(String value) {
            addCriterion("GoPlace <>", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceGreaterThan(String value) {
            addCriterion("GoPlace >", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceGreaterThanOrEqualTo(String value) {
            addCriterion("GoPlace >=", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLessThan(String value) {
            addCriterion("GoPlace <", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLessThanOrEqualTo(String value) {
            addCriterion("GoPlace <=", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceLike(String value) {
            addCriterion("GoPlace like", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotLike(String value) {
            addCriterion("GoPlace not like", value, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceIn(List<String> values) {
            addCriterion("GoPlace in", values, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotIn(List<String> values) {
            addCriterion("GoPlace not in", values, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceBetween(String value1, String value2) {
            addCriterion("GoPlace between", value1, value2, "goplace");
            return (Criteria) this;
        }

        public Criteria andGoplaceNotBetween(String value1, String value2) {
            addCriterion("GoPlace not between", value1, value2, "goplace");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("limit is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("limit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Integer value) {
            addCriterion("limit =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Integer value) {
            addCriterion("limit <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Integer value) {
            addCriterion("limit >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Integer value) {
            addCriterion("limit <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Integer value) {
            addCriterion("limit <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Integer> values) {
            addCriterion("limit in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Integer> values) {
            addCriterion("limit not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Integer value1, Integer value2) {
            addCriterion("limit between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("limit not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLeavenumIsNull() {
            addCriterion("LeaveNum is null");
            return (Criteria) this;
        }

        public Criteria andLeavenumIsNotNull() {
            addCriterion("LeaveNum is not null");
            return (Criteria) this;
        }

        public Criteria andLeavenumEqualTo(String value) {
            addCriterion("LeaveNum =", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumNotEqualTo(String value) {
            addCriterion("LeaveNum <>", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumGreaterThan(String value) {
            addCriterion("LeaveNum >", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveNum >=", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumLessThan(String value) {
            addCriterion("LeaveNum <", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumLessThanOrEqualTo(String value) {
            addCriterion("LeaveNum <=", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumLike(String value) {
            addCriterion("LeaveNum like", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumNotLike(String value) {
            addCriterion("LeaveNum not like", value, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumIn(List<String> values) {
            addCriterion("LeaveNum in", values, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumNotIn(List<String> values) {
            addCriterion("LeaveNum not in", values, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumBetween(String value1, String value2) {
            addCriterion("LeaveNum between", value1, value2, "leavenum");
            return (Criteria) this;
        }

        public Criteria andLeavenumNotBetween(String value1, String value2) {
            addCriterion("LeaveNum not between", value1, value2, "leavenum");
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