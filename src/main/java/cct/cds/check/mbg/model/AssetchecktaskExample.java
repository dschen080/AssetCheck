package cct.cds.check.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetchecktaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetchecktaskExample() {
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

        public Criteria andTaskabstractIsNull() {
            addCriterion("taskAbstract is null");
            return (Criteria) this;
        }

        public Criteria andTaskabstractIsNotNull() {
            addCriterion("taskAbstract is not null");
            return (Criteria) this;
        }

        public Criteria andTaskabstractEqualTo(String value) {
            addCriterion("taskAbstract =", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractNotEqualTo(String value) {
            addCriterion("taskAbstract <>", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractGreaterThan(String value) {
            addCriterion("taskAbstract >", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractGreaterThanOrEqualTo(String value) {
            addCriterion("taskAbstract >=", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractLessThan(String value) {
            addCriterion("taskAbstract <", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractLessThanOrEqualTo(String value) {
            addCriterion("taskAbstract <=", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractLike(String value) {
            addCriterion("taskAbstract like", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractNotLike(String value) {
            addCriterion("taskAbstract not like", value, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractIn(List<String> values) {
            addCriterion("taskAbstract in", values, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractNotIn(List<String> values) {
            addCriterion("taskAbstract not in", values, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractBetween(String value1, String value2) {
            addCriterion("taskAbstract between", value1, value2, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskabstractNotBetween(String value1, String value2) {
            addCriterion("taskAbstract not between", value1, value2, "taskabstract");
            return (Criteria) this;
        }

        public Criteria andTaskbeginIsNull() {
            addCriterion("taskBegin is null");
            return (Criteria) this;
        }

        public Criteria andTaskbeginIsNotNull() {
            addCriterion("taskBegin is not null");
            return (Criteria) this;
        }

        public Criteria andTaskbeginEqualTo(String value) {
            addCriterion("taskBegin =", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginNotEqualTo(String value) {
            addCriterion("taskBegin <>", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginGreaterThan(String value) {
            addCriterion("taskBegin >", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginGreaterThanOrEqualTo(String value) {
            addCriterion("taskBegin >=", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginLessThan(String value) {
            addCriterion("taskBegin <", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginLessThanOrEqualTo(String value) {
            addCriterion("taskBegin <=", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginLike(String value) {
            addCriterion("taskBegin like", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginNotLike(String value) {
            addCriterion("taskBegin not like", value, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginIn(List<String> values) {
            addCriterion("taskBegin in", values, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginNotIn(List<String> values) {
            addCriterion("taskBegin not in", values, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginBetween(String value1, String value2) {
            addCriterion("taskBegin between", value1, value2, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskbeginNotBetween(String value1, String value2) {
            addCriterion("taskBegin not between", value1, value2, "taskbegin");
            return (Criteria) this;
        }

        public Criteria andTaskendIsNull() {
            addCriterion("taskEnd is null");
            return (Criteria) this;
        }

        public Criteria andTaskendIsNotNull() {
            addCriterion("taskEnd is not null");
            return (Criteria) this;
        }

        public Criteria andTaskendEqualTo(String value) {
            addCriterion("taskEnd =", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendNotEqualTo(String value) {
            addCriterion("taskEnd <>", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendGreaterThan(String value) {
            addCriterion("taskEnd >", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendGreaterThanOrEqualTo(String value) {
            addCriterion("taskEnd >=", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendLessThan(String value) {
            addCriterion("taskEnd <", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendLessThanOrEqualTo(String value) {
            addCriterion("taskEnd <=", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendLike(String value) {
            addCriterion("taskEnd like", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendNotLike(String value) {
            addCriterion("taskEnd not like", value, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendIn(List<String> values) {
            addCriterion("taskEnd in", values, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendNotIn(List<String> values) {
            addCriterion("taskEnd not in", values, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendBetween(String value1, String value2) {
            addCriterion("taskEnd between", value1, value2, "taskend");
            return (Criteria) this;
        }

        public Criteria andTaskendNotBetween(String value1, String value2) {
            addCriterion("taskEnd not between", value1, value2, "taskend");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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