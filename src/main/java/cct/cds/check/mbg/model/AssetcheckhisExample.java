package cct.cds.check.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetcheckhisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetcheckhisExample() {
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

        public Criteria andAssetchkidIsNull() {
            addCriterion("assetChkId is null");
            return (Criteria) this;
        }

        public Criteria andAssetchkidIsNotNull() {
            addCriterion("assetChkId is not null");
            return (Criteria) this;
        }

        public Criteria andAssetchkidEqualTo(Integer value) {
            addCriterion("assetChkId =", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidNotEqualTo(Integer value) {
            addCriterion("assetChkId <>", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidGreaterThan(Integer value) {
            addCriterion("assetChkId >", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("assetChkId >=", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidLessThan(Integer value) {
            addCriterion("assetChkId <", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidLessThanOrEqualTo(Integer value) {
            addCriterion("assetChkId <=", value, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidIn(List<Integer> values) {
            addCriterion("assetChkId in", values, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidNotIn(List<Integer> values) {
            addCriterion("assetChkId not in", values, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidBetween(Integer value1, Integer value2) {
            addCriterion("assetChkId between", value1, value2, "assetchkid");
            return (Criteria) this;
        }

        public Criteria andAssetchkidNotBetween(Integer value1, Integer value2) {
            addCriterion("assetChkId not between", value1, value2, "assetchkid");
            return (Criteria) this;
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("checkResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("checkResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(Byte value) {
            addCriterion("checkResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(Byte value) {
            addCriterion("checkResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(Byte value) {
            addCriterion("checkResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(Byte value) {
            addCriterion("checkResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(Byte value) {
            addCriterion("checkResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(Byte value) {
            addCriterion("checkResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<Byte> values) {
            addCriterion("checkResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<Byte> values) {
            addCriterion("checkResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(Byte value1, Byte value2) {
            addCriterion("checkResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(Byte value1, Byte value2) {
            addCriterion("checkResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckmodeIsNull() {
            addCriterion("checkMode is null");
            return (Criteria) this;
        }

        public Criteria andCheckmodeIsNotNull() {
            addCriterion("checkMode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmodeEqualTo(Byte value) {
            addCriterion("checkMode =", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeNotEqualTo(Byte value) {
            addCriterion("checkMode <>", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeGreaterThan(Byte value) {
            addCriterion("checkMode >", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("checkMode >=", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeLessThan(Byte value) {
            addCriterion("checkMode <", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeLessThanOrEqualTo(Byte value) {
            addCriterion("checkMode <=", value, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeIn(List<Byte> values) {
            addCriterion("checkMode in", values, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeNotIn(List<Byte> values) {
            addCriterion("checkMode not in", values, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeBetween(Byte value1, Byte value2) {
            addCriterion("checkMode between", value1, value2, "checkmode");
            return (Criteria) this;
        }

        public Criteria andCheckmodeNotBetween(Byte value1, Byte value2) {
            addCriterion("checkMode not between", value1, value2, "checkmode");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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