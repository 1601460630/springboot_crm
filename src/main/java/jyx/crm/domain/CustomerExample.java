package jyx.crm.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustIndustryIsNull() {
            addCriterion("cust_industry is null");
            return (Criteria) this;
        }

        public Criteria andCustIndustryIsNotNull() {
            addCriterion("cust_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCustIndustryEqualTo(String value) {
            addCriterion("cust_industry =", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryNotEqualTo(String value) {
            addCriterion("cust_industry <>", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryGreaterThan(String value) {
            addCriterion("cust_industry >", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("cust_industry >=", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryLessThan(String value) {
            addCriterion("cust_industry <", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryLessThanOrEqualTo(String value) {
            addCriterion("cust_industry <=", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryLike(String value) {
            addCriterion("cust_industry like", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryNotLike(String value) {
            addCriterion("cust_industry not like", value, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryIn(List<String> values) {
            addCriterion("cust_industry in", values, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryNotIn(List<String> values) {
            addCriterion("cust_industry not in", values, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryBetween(String value1, String value2) {
            addCriterion("cust_industry between", value1, value2, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustIndustryNotBetween(String value1, String value2) {
            addCriterion("cust_industry not between", value1, value2, "custIndustry");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("cust_level is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("cust_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(String value) {
            addCriterion("cust_level =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(String value) {
            addCriterion("cust_level <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(String value) {
            addCriterion("cust_level >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_level >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(String value) {
            addCriterion("cust_level <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(String value) {
            addCriterion("cust_level <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLike(String value) {
            addCriterion("cust_level like", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotLike(String value) {
            addCriterion("cust_level not like", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<String> values) {
            addCriterion("cust_level in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<String> values) {
            addCriterion("cust_level not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(String value1, String value2) {
            addCriterion("cust_level between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(String value1, String value2) {
            addCriterion("cust_level not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanIsNull() {
            addCriterion("cust_linkman is null");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanIsNotNull() {
            addCriterion("cust_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanEqualTo(String value) {
            addCriterion("cust_linkman =", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanNotEqualTo(String value) {
            addCriterion("cust_linkman <>", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanGreaterThan(String value) {
            addCriterion("cust_linkman >", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("cust_linkman >=", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanLessThan(String value) {
            addCriterion("cust_linkman <", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanLessThanOrEqualTo(String value) {
            addCriterion("cust_linkman <=", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanLike(String value) {
            addCriterion("cust_linkman like", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanNotLike(String value) {
            addCriterion("cust_linkman not like", value, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanIn(List<String> values) {
            addCriterion("cust_linkman in", values, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanNotIn(List<String> values) {
            addCriterion("cust_linkman not in", values, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanBetween(String value1, String value2) {
            addCriterion("cust_linkman between", value1, value2, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanNotBetween(String value1, String value2) {
            addCriterion("cust_linkman not between", value1, value2, "custLinkman");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileIsNull() {
            addCriterion("cust_linkman_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileIsNotNull() {
            addCriterion("cust_linkman_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileEqualTo(String value) {
            addCriterion("cust_linkman_mobile =", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileNotEqualTo(String value) {
            addCriterion("cust_linkman_mobile <>", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileGreaterThan(String value) {
            addCriterion("cust_linkman_mobile >", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cust_linkman_mobile >=", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileLessThan(String value) {
            addCriterion("cust_linkman_mobile <", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("cust_linkman_mobile <=", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileLike(String value) {
            addCriterion("cust_linkman_mobile like", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileNotLike(String value) {
            addCriterion("cust_linkman_mobile not like", value, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileIn(List<String> values) {
            addCriterion("cust_linkman_mobile in", values, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileNotIn(List<String> values) {
            addCriterion("cust_linkman_mobile not in", values, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileBetween(String value1, String value2) {
            addCriterion("cust_linkman_mobile between", value1, value2, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("cust_linkman_mobile not between", value1, value2, "custLinkmanMobile");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneEqualTo(String value) {
            addCriterion("cust_phone =", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotEqualTo(String value) {
            addCriterion("cust_phone <>", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThan(String value) {
            addCriterion("cust_phone >", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cust_phone >=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThan(String value) {
            addCriterion("cust_phone <", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThanOrEqualTo(String value) {
            addCriterion("cust_phone <=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLike(String value) {
            addCriterion("cust_phone like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotLike(String value) {
            addCriterion("cust_phone not like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIn(List<String> values) {
            addCriterion("cust_phone in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotIn(List<String> values) {
            addCriterion("cust_phone not in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneBetween(String value1, String value2) {
            addCriterion("cust_phone between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotBetween(String value1, String value2) {
            addCriterion("cust_phone not between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNull() {
            addCriterion("cust_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustMobileIsNotNull() {
            addCriterion("cust_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustMobileEqualTo(String value) {
            addCriterion("cust_mobile =", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotEqualTo(String value) {
            addCriterion("cust_mobile <>", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThan(String value) {
            addCriterion("cust_mobile >", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cust_mobile >=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThan(String value) {
            addCriterion("cust_mobile <", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLessThanOrEqualTo(String value) {
            addCriterion("cust_mobile <=", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileLike(String value) {
            addCriterion("cust_mobile like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotLike(String value) {
            addCriterion("cust_mobile not like", value, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileIn(List<String> values) {
            addCriterion("cust_mobile in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotIn(List<String> values) {
            addCriterion("cust_mobile not in", values, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileBetween(String value1, String value2) {
            addCriterion("cust_mobile between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustMobileNotBetween(String value1, String value2) {
            addCriterion("cust_mobile not between", value1, value2, "custMobile");
            return (Criteria) this;
        }

        public Criteria andCustSourceIsNull() {
            addCriterion("cust_source is null");
            return (Criteria) this;
        }

        public Criteria andCustSourceIsNotNull() {
            addCriterion("cust_source is not null");
            return (Criteria) this;
        }

        public Criteria andCustSourceEqualTo(String value) {
            addCriterion("cust_source =", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceNotEqualTo(String value) {
            addCriterion("cust_source <>", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceGreaterThan(String value) {
            addCriterion("cust_source >", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceGreaterThanOrEqualTo(String value) {
            addCriterion("cust_source >=", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceLessThan(String value) {
            addCriterion("cust_source <", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceLessThanOrEqualTo(String value) {
            addCriterion("cust_source <=", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceLike(String value) {
            addCriterion("cust_source like", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceNotLike(String value) {
            addCriterion("cust_source not like", value, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceIn(List<String> values) {
            addCriterion("cust_source in", values, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceNotIn(List<String> values) {
            addCriterion("cust_source not in", values, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceBetween(String value1, String value2) {
            addCriterion("cust_source between", value1, value2, "custSource");
            return (Criteria) this;
        }

        public Criteria andCustSourceNotBetween(String value1, String value2) {
            addCriterion("cust_source not between", value1, value2, "custSource");
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