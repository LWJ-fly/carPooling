package online.wenmeng.bean;

import java.util.ArrayList;
import java.util.List;

public class UinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UinfoExample() {
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

        public Criteria andTallmailIsNull() {
            addCriterion("tallMail is null");
            return (Criteria) this;
        }

        public Criteria andTallmailIsNotNull() {
            addCriterion("tallMail is not null");
            return (Criteria) this;
        }

        public Criteria andTallmailEqualTo(String value) {
            addCriterion("tallMail =", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailNotEqualTo(String value) {
            addCriterion("tallMail <>", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailGreaterThan(String value) {
            addCriterion("tallMail >", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailGreaterThanOrEqualTo(String value) {
            addCriterion("tallMail >=", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailLessThan(String value) {
            addCriterion("tallMail <", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailLessThanOrEqualTo(String value) {
            addCriterion("tallMail <=", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailLike(String value) {
            addCriterion("tallMail like", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailNotLike(String value) {
            addCriterion("tallMail not like", value, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailIn(List<String> values) {
            addCriterion("tallMail in", values, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailNotIn(List<String> values) {
            addCriterion("tallMail not in", values, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailBetween(String value1, String value2) {
            addCriterion("tallMail between", value1, value2, "tallmail");
            return (Criteria) this;
        }

        public Criteria andTallmailNotBetween(String value1, String value2) {
            addCriterion("tallMail not between", value1, value2, "tallmail");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNull() {
            addCriterion("URealName is null");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNotNull() {
            addCriterion("URealName is not null");
            return (Criteria) this;
        }

        public Criteria andUrealnameEqualTo(String value) {
            addCriterion("URealName =", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotEqualTo(String value) {
            addCriterion("URealName <>", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThan(String value) {
            addCriterion("URealName >", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("URealName >=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThan(String value) {
            addCriterion("URealName <", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThanOrEqualTo(String value) {
            addCriterion("URealName <=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLike(String value) {
            addCriterion("URealName like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotLike(String value) {
            addCriterion("URealName not like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameIn(List<String> values) {
            addCriterion("URealName in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotIn(List<String> values) {
            addCriterion("URealName not in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameBetween(String value1, String value2) {
            addCriterion("URealName between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotBetween(String value1, String value2) {
            addCriterion("URealName not between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNull() {
            addCriterion("UNickname is null");
            return (Criteria) this;
        }

        public Criteria andUnicknameIsNotNull() {
            addCriterion("UNickname is not null");
            return (Criteria) this;
        }

        public Criteria andUnicknameEqualTo(String value) {
            addCriterion("UNickname =", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotEqualTo(String value) {
            addCriterion("UNickname <>", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThan(String value) {
            addCriterion("UNickname >", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("UNickname >=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThan(String value) {
            addCriterion("UNickname <", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLessThanOrEqualTo(String value) {
            addCriterion("UNickname <=", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameLike(String value) {
            addCriterion("UNickname like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotLike(String value) {
            addCriterion("UNickname not like", value, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameIn(List<String> values) {
            addCriterion("UNickname in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotIn(List<String> values) {
            addCriterion("UNickname not in", values, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameBetween(String value1, String value2) {
            addCriterion("UNickname between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andUnicknameNotBetween(String value1, String value2) {
            addCriterion("UNickname not between", value1, value2, "unickname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andUwalletIsNull() {
            addCriterion("UWallet is null");
            return (Criteria) this;
        }

        public Criteria andUwalletIsNotNull() {
            addCriterion("UWallet is not null");
            return (Criteria) this;
        }

        public Criteria andUwalletEqualTo(Double value) {
            addCriterion("UWallet =", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletNotEqualTo(Double value) {
            addCriterion("UWallet <>", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletGreaterThan(Double value) {
            addCriterion("UWallet >", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletGreaterThanOrEqualTo(Double value) {
            addCriterion("UWallet >=", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletLessThan(Double value) {
            addCriterion("UWallet <", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletLessThanOrEqualTo(Double value) {
            addCriterion("UWallet <=", value, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletIn(List<Double> values) {
            addCriterion("UWallet in", values, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletNotIn(List<Double> values) {
            addCriterion("UWallet not in", values, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletBetween(Double value1, Double value2) {
            addCriterion("UWallet between", value1, value2, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUwalletNotBetween(Double value1, Double value2) {
            addCriterion("UWallet not between", value1, value2, "uwallet");
            return (Criteria) this;
        }

        public Criteria andUcredibilityIsNull() {
            addCriterion("UCredibility is null");
            return (Criteria) this;
        }

        public Criteria andUcredibilityIsNotNull() {
            addCriterion("UCredibility is not null");
            return (Criteria) this;
        }

        public Criteria andUcredibilityEqualTo(Integer value) {
            addCriterion("UCredibility =", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityNotEqualTo(Integer value) {
            addCriterion("UCredibility <>", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityGreaterThan(Integer value) {
            addCriterion("UCredibility >", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("UCredibility >=", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityLessThan(Integer value) {
            addCriterion("UCredibility <", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityLessThanOrEqualTo(Integer value) {
            addCriterion("UCredibility <=", value, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityIn(List<Integer> values) {
            addCriterion("UCredibility in", values, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityNotIn(List<Integer> values) {
            addCriterion("UCredibility not in", values, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityBetween(Integer value1, Integer value2) {
            addCriterion("UCredibility between", value1, value2, "ucredibility");
            return (Criteria) this;
        }

        public Criteria andUcredibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("UCredibility not between", value1, value2, "ucredibility");
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