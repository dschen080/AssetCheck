package cct.cds.check.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class AssetcheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetcheckExample() {
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

        public Criteria andAssetidIsNull() {
            addCriterion("assetId is null");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNotNull() {
            addCriterion("assetId is not null");
            return (Criteria) this;
        }

        public Criteria andAssetidEqualTo(Integer value) {
            addCriterion("assetId =", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotEqualTo(Integer value) {
            addCriterion("assetId <>", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThan(Integer value) {
            addCriterion("assetId >", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("assetId >=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThan(Integer value) {
            addCriterion("assetId <", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThanOrEqualTo(Integer value) {
            addCriterion("assetId <=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidIn(List<Integer> values) {
            addCriterion("assetId in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotIn(List<Integer> values) {
            addCriterion("assetId not in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidBetween(Integer value1, Integer value2) {
            addCriterion("assetId between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotBetween(Integer value1, Integer value2) {
            addCriterion("assetId not between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(String value) {
            addCriterion("orgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(String value) {
            addCriterion("orgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(String value) {
            addCriterion("orgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("orgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(String value) {
            addCriterion("orgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(String value) {
            addCriterion("orgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLike(String value) {
            addCriterion("orgId like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotLike(String value) {
            addCriterion("orgId not like", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<String> values) {
            addCriterion("orgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<String> values) {
            addCriterion("orgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(String value1, String value2) {
            addCriterion("orgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(String value1, String value2) {
            addCriterion("orgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNull() {
            addCriterion("printCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNotNull() {
            addCriterion("printCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcountEqualTo(Byte value) {
            addCriterion("printCount =", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotEqualTo(Byte value) {
            addCriterion("printCount <>", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThan(Byte value) {
            addCriterion("printCount >", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThanOrEqualTo(Byte value) {
            addCriterion("printCount >=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThan(Byte value) {
            addCriterion("printCount <", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThanOrEqualTo(Byte value) {
            addCriterion("printCount <=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountIn(List<Byte> values) {
            addCriterion("printCount in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotIn(List<Byte> values) {
            addCriterion("printCount not in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountBetween(Byte value1, Byte value2) {
            addCriterion("printCount between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotBetween(Byte value1, Byte value2) {
            addCriterion("printCount not between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andLabletypeIsNull() {
            addCriterion("lableType is null");
            return (Criteria) this;
        }

        public Criteria andLabletypeIsNotNull() {
            addCriterion("lableType is not null");
            return (Criteria) this;
        }

        public Criteria andLabletypeEqualTo(Byte value) {
            addCriterion("lableType =", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeNotEqualTo(Byte value) {
            addCriterion("lableType <>", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeGreaterThan(Byte value) {
            addCriterion("lableType >", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("lableType >=", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeLessThan(Byte value) {
            addCriterion("lableType <", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeLessThanOrEqualTo(Byte value) {
            addCriterion("lableType <=", value, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeIn(List<Byte> values) {
            addCriterion("lableType in", values, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeNotIn(List<Byte> values) {
            addCriterion("lableType not in", values, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeBetween(Byte value1, Byte value2) {
            addCriterion("lableType between", value1, value2, "labletype");
            return (Criteria) this;
        }

        public Criteria andLabletypeNotBetween(Byte value1, Byte value2) {
            addCriterion("lableType not between", value1, value2, "labletype");
            return (Criteria) this;
        }

        public Criteria andUsername4unitIsNull() {
            addCriterion("username4unit is null");
            return (Criteria) this;
        }

        public Criteria andUsername4unitIsNotNull() {
            addCriterion("username4unit is not null");
            return (Criteria) this;
        }

        public Criteria andUsername4unitEqualTo(String value) {
            addCriterion("username4unit =", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitNotEqualTo(String value) {
            addCriterion("username4unit <>", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitGreaterThan(String value) {
            addCriterion("username4unit >", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitGreaterThanOrEqualTo(String value) {
            addCriterion("username4unit >=", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitLessThan(String value) {
            addCriterion("username4unit <", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitLessThanOrEqualTo(String value) {
            addCriterion("username4unit <=", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitLike(String value) {
            addCriterion("username4unit like", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitNotLike(String value) {
            addCriterion("username4unit not like", value, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitIn(List<String> values) {
            addCriterion("username4unit in", values, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitNotIn(List<String> values) {
            addCriterion("username4unit not in", values, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitBetween(String value1, String value2) {
            addCriterion("username4unit between", value1, value2, "username4unit");
            return (Criteria) this;
        }

        public Criteria andUsername4unitNotBetween(String value1, String value2) {
            addCriterion("username4unit not between", value1, value2, "username4unit");
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