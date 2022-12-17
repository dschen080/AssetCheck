package cct.cds.check.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class AssetrecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetrecExample() {
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

        public Criteria andAssetcodeIsNull() {
            addCriterion("assetCode is null");
            return (Criteria) this;
        }

        public Criteria andAssetcodeIsNotNull() {
            addCriterion("assetCode is not null");
            return (Criteria) this;
        }

        public Criteria andAssetcodeEqualTo(String value) {
            addCriterion("assetCode =", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotEqualTo(String value) {
            addCriterion("assetCode <>", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeGreaterThan(String value) {
            addCriterion("assetCode >", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("assetCode >=", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLessThan(String value) {
            addCriterion("assetCode <", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLessThanOrEqualTo(String value) {
            addCriterion("assetCode <=", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLike(String value) {
            addCriterion("assetCode like", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotLike(String value) {
            addCriterion("assetCode not like", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeIn(List<String> values) {
            addCriterion("assetCode in", values, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotIn(List<String> values) {
            addCriterion("assetCode not in", values, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeBetween(String value1, String value2) {
            addCriterion("assetCode between", value1, value2, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotBetween(String value1, String value2) {
            addCriterion("assetCode not between", value1, value2, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNull() {
            addCriterion("assetName is null");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNotNull() {
            addCriterion("assetName is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnameEqualTo(String value) {
            addCriterion("assetName =", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotEqualTo(String value) {
            addCriterion("assetName <>", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThan(String value) {
            addCriterion("assetName >", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetName >=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThan(String value) {
            addCriterion("assetName <", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThanOrEqualTo(String value) {
            addCriterion("assetName <=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLike(String value) {
            addCriterion("assetName like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotLike(String value) {
            addCriterion("assetName not like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameIn(List<String> values) {
            addCriterion("assetName in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotIn(List<String> values) {
            addCriterion("assetName not in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameBetween(String value1, String value2) {
            addCriterion("assetName between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotBetween(String value1, String value2) {
            addCriterion("assetName not between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andCode4gs1IsNull() {
            addCriterion("code4GS1 is null");
            return (Criteria) this;
        }

        public Criteria andCode4gs1IsNotNull() {
            addCriterion("code4GS1 is not null");
            return (Criteria) this;
        }

        public Criteria andCode4gs1EqualTo(String value) {
            addCriterion("code4GS1 =", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1NotEqualTo(String value) {
            addCriterion("code4GS1 <>", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1GreaterThan(String value) {
            addCriterion("code4GS1 >", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1GreaterThanOrEqualTo(String value) {
            addCriterion("code4GS1 >=", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1LessThan(String value) {
            addCriterion("code4GS1 <", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1LessThanOrEqualTo(String value) {
            addCriterion("code4GS1 <=", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1Like(String value) {
            addCriterion("code4GS1 like", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1NotLike(String value) {
            addCriterion("code4GS1 not like", value, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1In(List<String> values) {
            addCriterion("code4GS1 in", values, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1NotIn(List<String> values) {
            addCriterion("code4GS1 not in", values, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1Between(String value1, String value2) {
            addCriterion("code4GS1 between", value1, value2, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andCode4gs1NotBetween(String value1, String value2) {
            addCriterion("code4GS1 not between", value1, value2, "code4gs1");
            return (Criteria) this;
        }

        public Criteria andAssetpriceIsNull() {
            addCriterion("assetPrice is null");
            return (Criteria) this;
        }

        public Criteria andAssetpriceIsNotNull() {
            addCriterion("assetPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAssetpriceEqualTo(String value) {
            addCriterion("assetPrice =", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceNotEqualTo(String value) {
            addCriterion("assetPrice <>", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceGreaterThan(String value) {
            addCriterion("assetPrice >", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceGreaterThanOrEqualTo(String value) {
            addCriterion("assetPrice >=", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceLessThan(String value) {
            addCriterion("assetPrice <", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceLessThanOrEqualTo(String value) {
            addCriterion("assetPrice <=", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceLike(String value) {
            addCriterion("assetPrice like", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceNotLike(String value) {
            addCriterion("assetPrice not like", value, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceIn(List<String> values) {
            addCriterion("assetPrice in", values, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceNotIn(List<String> values) {
            addCriterion("assetPrice not in", values, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceBetween(String value1, String value2) {
            addCriterion("assetPrice between", value1, value2, "assetprice");
            return (Criteria) this;
        }

        public Criteria andAssetpriceNotBetween(String value1, String value2) {
            addCriterion("assetPrice not between", value1, value2, "assetprice");
            return (Criteria) this;
        }

        public Criteria andTakedateIsNull() {
            addCriterion("takeDate is null");
            return (Criteria) this;
        }

        public Criteria andTakedateIsNotNull() {
            addCriterion("takeDate is not null");
            return (Criteria) this;
        }

        public Criteria andTakedateEqualTo(String value) {
            addCriterion("takeDate =", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotEqualTo(String value) {
            addCriterion("takeDate <>", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateGreaterThan(String value) {
            addCriterion("takeDate >", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateGreaterThanOrEqualTo(String value) {
            addCriterion("takeDate >=", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateLessThan(String value) {
            addCriterion("takeDate <", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateLessThanOrEqualTo(String value) {
            addCriterion("takeDate <=", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateLike(String value) {
            addCriterion("takeDate like", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotLike(String value) {
            addCriterion("takeDate not like", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateIn(List<String> values) {
            addCriterion("takeDate in", values, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotIn(List<String> values) {
            addCriterion("takeDate not in", values, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateBetween(String value1, String value2) {
            addCriterion("takeDate between", value1, value2, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotBetween(String value1, String value2) {
            addCriterion("takeDate not between", value1, value2, "takedate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Byte value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Byte value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Byte value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Byte value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Byte value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Byte value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Byte> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Byte> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Byte value1, Byte value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Byte value1, Byte value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNull() {
            addCriterion("measure is null");
            return (Criteria) this;
        }

        public Criteria andMeasureIsNotNull() {
            addCriterion("measure is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureEqualTo(String value) {
            addCriterion("measure =", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotEqualTo(String value) {
            addCriterion("measure <>", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThan(String value) {
            addCriterion("measure >", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("measure >=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThan(String value) {
            addCriterion("measure <", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLessThanOrEqualTo(String value) {
            addCriterion("measure <=", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureLike(String value) {
            addCriterion("measure like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotLike(String value) {
            addCriterion("measure not like", value, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureIn(List<String> values) {
            addCriterion("measure in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotIn(List<String> values) {
            addCriterion("measure not in", values, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureBetween(String value1, String value2) {
            addCriterion("measure between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andMeasureNotBetween(String value1, String value2) {
            addCriterion("measure not between", value1, value2, "measure");
            return (Criteria) this;
        }

        public Criteria andAccdepreIsNull() {
            addCriterion("accDepre is null");
            return (Criteria) this;
        }

        public Criteria andAccdepreIsNotNull() {
            addCriterion("accDepre is not null");
            return (Criteria) this;
        }

        public Criteria andAccdepreEqualTo(String value) {
            addCriterion("accDepre =", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreNotEqualTo(String value) {
            addCriterion("accDepre <>", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreGreaterThan(String value) {
            addCriterion("accDepre >", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreGreaterThanOrEqualTo(String value) {
            addCriterion("accDepre >=", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreLessThan(String value) {
            addCriterion("accDepre <", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreLessThanOrEqualTo(String value) {
            addCriterion("accDepre <=", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreLike(String value) {
            addCriterion("accDepre like", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreNotLike(String value) {
            addCriterion("accDepre not like", value, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreIn(List<String> values) {
            addCriterion("accDepre in", values, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreNotIn(List<String> values) {
            addCriterion("accDepre not in", values, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreBetween(String value1, String value2) {
            addCriterion("accDepre between", value1, value2, "accdepre");
            return (Criteria) this;
        }

        public Criteria andAccdepreNotBetween(String value1, String value2) {
            addCriterion("accDepre not between", value1, value2, "accdepre");
            return (Criteria) this;
        }

        public Criteria andStorelocIsNull() {
            addCriterion("storeLoc is null");
            return (Criteria) this;
        }

        public Criteria andStorelocIsNotNull() {
            addCriterion("storeLoc is not null");
            return (Criteria) this;
        }

        public Criteria andStorelocEqualTo(String value) {
            addCriterion("storeLoc =", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocNotEqualTo(String value) {
            addCriterion("storeLoc <>", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocGreaterThan(String value) {
            addCriterion("storeLoc >", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocGreaterThanOrEqualTo(String value) {
            addCriterion("storeLoc >=", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocLessThan(String value) {
            addCriterion("storeLoc <", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocLessThanOrEqualTo(String value) {
            addCriterion("storeLoc <=", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocLike(String value) {
            addCriterion("storeLoc like", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocNotLike(String value) {
            addCriterion("storeLoc not like", value, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocIn(List<String> values) {
            addCriterion("storeLoc in", values, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocNotIn(List<String> values) {
            addCriterion("storeLoc not in", values, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocBetween(String value1, String value2) {
            addCriterion("storeLoc between", value1, value2, "storeloc");
            return (Criteria) this;
        }

        public Criteria andStorelocNotBetween(String value1, String value2) {
            addCriterion("storeLoc not between", value1, value2, "storeloc");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andSpecificsIsNull() {
            addCriterion("specifics is null");
            return (Criteria) this;
        }

        public Criteria andSpecificsIsNotNull() {
            addCriterion("specifics is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificsEqualTo(String value) {
            addCriterion("specifics =", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsNotEqualTo(String value) {
            addCriterion("specifics <>", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsGreaterThan(String value) {
            addCriterion("specifics >", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsGreaterThanOrEqualTo(String value) {
            addCriterion("specifics >=", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsLessThan(String value) {
            addCriterion("specifics <", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsLessThanOrEqualTo(String value) {
            addCriterion("specifics <=", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsLike(String value) {
            addCriterion("specifics like", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsNotLike(String value) {
            addCriterion("specifics not like", value, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsIn(List<String> values) {
            addCriterion("specifics in", values, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsNotIn(List<String> values) {
            addCriterion("specifics not in", values, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsBetween(String value1, String value2) {
            addCriterion("specifics between", value1, value2, "specifics");
            return (Criteria) this;
        }

        public Criteria andSpecificsNotBetween(String value1, String value2) {
            addCriterion("specifics not between", value1, value2, "specifics");
            return (Criteria) this;
        }

        public Criteria andAccdocnoIsNull() {
            addCriterion("accDocNo is null");
            return (Criteria) this;
        }

        public Criteria andAccdocnoIsNotNull() {
            addCriterion("accDocNo is not null");
            return (Criteria) this;
        }

        public Criteria andAccdocnoEqualTo(String value) {
            addCriterion("accDocNo =", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoNotEqualTo(String value) {
            addCriterion("accDocNo <>", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoGreaterThan(String value) {
            addCriterion("accDocNo >", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoGreaterThanOrEqualTo(String value) {
            addCriterion("accDocNo >=", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoLessThan(String value) {
            addCriterion("accDocNo <", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoLessThanOrEqualTo(String value) {
            addCriterion("accDocNo <=", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoLike(String value) {
            addCriterion("accDocNo like", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoNotLike(String value) {
            addCriterion("accDocNo not like", value, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoIn(List<String> values) {
            addCriterion("accDocNo in", values, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoNotIn(List<String> values) {
            addCriterion("accDocNo not in", values, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoBetween(String value1, String value2) {
            addCriterion("accDocNo between", value1, value2, "accdocno");
            return (Criteria) this;
        }

        public Criteria andAccdocnoNotBetween(String value1, String value2) {
            addCriterion("accDocNo not between", value1, value2, "accdocno");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andAssetuserIsNull() {
            addCriterion("assetUser is null");
            return (Criteria) this;
        }

        public Criteria andAssetuserIsNotNull() {
            addCriterion("assetUser is not null");
            return (Criteria) this;
        }

        public Criteria andAssetuserEqualTo(String value) {
            addCriterion("assetUser =", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserNotEqualTo(String value) {
            addCriterion("assetUser <>", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserGreaterThan(String value) {
            addCriterion("assetUser >", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserGreaterThanOrEqualTo(String value) {
            addCriterion("assetUser >=", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserLessThan(String value) {
            addCriterion("assetUser <", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserLessThanOrEqualTo(String value) {
            addCriterion("assetUser <=", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserLike(String value) {
            addCriterion("assetUser like", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserNotLike(String value) {
            addCriterion("assetUser not like", value, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserIn(List<String> values) {
            addCriterion("assetUser in", values, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserNotIn(List<String> values) {
            addCriterion("assetUser not in", values, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserBetween(String value1, String value2) {
            addCriterion("assetUser between", value1, value2, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetuserNotBetween(String value1, String value2) {
            addCriterion("assetUser not between", value1, value2, "assetuser");
            return (Criteria) this;
        }

        public Criteria andAssetdeptIsNull() {
            addCriterion("assetDept is null");
            return (Criteria) this;
        }

        public Criteria andAssetdeptIsNotNull() {
            addCriterion("assetDept is not null");
            return (Criteria) this;
        }

        public Criteria andAssetdeptEqualTo(String value) {
            addCriterion("assetDept =", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptNotEqualTo(String value) {
            addCriterion("assetDept <>", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptGreaterThan(String value) {
            addCriterion("assetDept >", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptGreaterThanOrEqualTo(String value) {
            addCriterion("assetDept >=", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptLessThan(String value) {
            addCriterion("assetDept <", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptLessThanOrEqualTo(String value) {
            addCriterion("assetDept <=", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptLike(String value) {
            addCriterion("assetDept like", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptNotLike(String value) {
            addCriterion("assetDept not like", value, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptIn(List<String> values) {
            addCriterion("assetDept in", values, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptNotIn(List<String> values) {
            addCriterion("assetDept not in", values, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptBetween(String value1, String value2) {
            addCriterion("assetDept between", value1, value2, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetdeptNotBetween(String value1, String value2) {
            addCriterion("assetDept not between", value1, value2, "assetdept");
            return (Criteria) this;
        }

        public Criteria andAssetclassIsNull() {
            addCriterion("assetClass is null");
            return (Criteria) this;
        }

        public Criteria andAssetclassIsNotNull() {
            addCriterion("assetClass is not null");
            return (Criteria) this;
        }

        public Criteria andAssetclassEqualTo(String value) {
            addCriterion("assetClass =", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassNotEqualTo(String value) {
            addCriterion("assetClass <>", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassGreaterThan(String value) {
            addCriterion("assetClass >", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassGreaterThanOrEqualTo(String value) {
            addCriterion("assetClass >=", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassLessThan(String value) {
            addCriterion("assetClass <", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassLessThanOrEqualTo(String value) {
            addCriterion("assetClass <=", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassLike(String value) {
            addCriterion("assetClass like", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassNotLike(String value) {
            addCriterion("assetClass not like", value, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassIn(List<String> values) {
            addCriterion("assetClass in", values, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassNotIn(List<String> values) {
            addCriterion("assetClass not in", values, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassBetween(String value1, String value2) {
            addCriterion("assetClass between", value1, value2, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetclassNotBetween(String value1, String value2) {
            addCriterion("assetClass not between", value1, value2, "assetclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassIsNull() {
            addCriterion("assetGbClass is null");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassIsNotNull() {
            addCriterion("assetGbClass is not null");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassEqualTo(String value) {
            addCriterion("assetGbClass =", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassNotEqualTo(String value) {
            addCriterion("assetGbClass <>", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassGreaterThan(String value) {
            addCriterion("assetGbClass >", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassGreaterThanOrEqualTo(String value) {
            addCriterion("assetGbClass >=", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassLessThan(String value) {
            addCriterion("assetGbClass <", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassLessThanOrEqualTo(String value) {
            addCriterion("assetGbClass <=", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassLike(String value) {
            addCriterion("assetGbClass like", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassNotLike(String value) {
            addCriterion("assetGbClass not like", value, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassIn(List<String> values) {
            addCriterion("assetGbClass in", values, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassNotIn(List<String> values) {
            addCriterion("assetGbClass not in", values, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassBetween(String value1, String value2) {
            addCriterion("assetGbClass between", value1, value2, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andAssetgbclassNotBetween(String value1, String value2) {
            addCriterion("assetGbClass not between", value1, value2, "assetgbclass");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNull() {
            addCriterion("useType is null");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNotNull() {
            addCriterion("useType is not null");
            return (Criteria) this;
        }

        public Criteria andUsetypeEqualTo(String value) {
            addCriterion("useType =", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotEqualTo(String value) {
            addCriterion("useType <>", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThan(String value) {
            addCriterion("useType >", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("useType >=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThan(String value) {
            addCriterion("useType <", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThanOrEqualTo(String value) {
            addCriterion("useType <=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLike(String value) {
            addCriterion("useType like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotLike(String value) {
            addCriterion("useType not like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIn(List<String> values) {
            addCriterion("useType in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotIn(List<String> values) {
            addCriterion("useType not in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeBetween(String value1, String value2) {
            addCriterion("useType between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotBetween(String value1, String value2) {
            addCriterion("useType not between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsestateIsNull() {
            addCriterion("useState is null");
            return (Criteria) this;
        }

        public Criteria andUsestateIsNotNull() {
            addCriterion("useState is not null");
            return (Criteria) this;
        }

        public Criteria andUsestateEqualTo(String value) {
            addCriterion("useState =", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotEqualTo(String value) {
            addCriterion("useState <>", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateGreaterThan(String value) {
            addCriterion("useState >", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateGreaterThanOrEqualTo(String value) {
            addCriterion("useState >=", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateLessThan(String value) {
            addCriterion("useState <", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateLessThanOrEqualTo(String value) {
            addCriterion("useState <=", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateLike(String value) {
            addCriterion("useState like", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotLike(String value) {
            addCriterion("useState not like", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateIn(List<String> values) {
            addCriterion("useState in", values, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotIn(List<String> values) {
            addCriterion("useState not in", values, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateBetween(String value1, String value2) {
            addCriterion("useState between", value1, value2, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotBetween(String value1, String value2) {
            addCriterion("useState not between", value1, value2, "usestate");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeIsNull() {
            addCriterion("assetClassCode is null");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeIsNotNull() {
            addCriterion("assetClassCode is not null");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeEqualTo(String value) {
            addCriterion("assetClassCode =", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeNotEqualTo(String value) {
            addCriterion("assetClassCode <>", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeGreaterThan(String value) {
            addCriterion("assetClassCode >", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeGreaterThanOrEqualTo(String value) {
            addCriterion("assetClassCode >=", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeLessThan(String value) {
            addCriterion("assetClassCode <", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeLessThanOrEqualTo(String value) {
            addCriterion("assetClassCode <=", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeLike(String value) {
            addCriterion("assetClassCode like", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeNotLike(String value) {
            addCriterion("assetClassCode not like", value, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeIn(List<String> values) {
            addCriterion("assetClassCode in", values, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeNotIn(List<String> values) {
            addCriterion("assetClassCode not in", values, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeBetween(String value1, String value2) {
            addCriterion("assetClassCode between", value1, value2, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andAssetclasscodeNotBetween(String value1, String value2) {
            addCriterion("assetClassCode not between", value1, value2, "assetclasscode");
            return (Criteria) this;
        }

        public Criteria andTakemodeIsNull() {
            addCriterion("takeMode is null");
            return (Criteria) this;
        }

        public Criteria andTakemodeIsNotNull() {
            addCriterion("takeMode is not null");
            return (Criteria) this;
        }

        public Criteria andTakemodeEqualTo(String value) {
            addCriterion("takeMode =", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeNotEqualTo(String value) {
            addCriterion("takeMode <>", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeGreaterThan(String value) {
            addCriterion("takeMode >", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeGreaterThanOrEqualTo(String value) {
            addCriterion("takeMode >=", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeLessThan(String value) {
            addCriterion("takeMode <", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeLessThanOrEqualTo(String value) {
            addCriterion("takeMode <=", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeLike(String value) {
            addCriterion("takeMode like", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeNotLike(String value) {
            addCriterion("takeMode not like", value, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeIn(List<String> values) {
            addCriterion("takeMode in", values, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeNotIn(List<String> values) {
            addCriterion("takeMode not in", values, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeBetween(String value1, String value2) {
            addCriterion("takeMode between", value1, value2, "takemode");
            return (Criteria) this;
        }

        public Criteria andTakemodeNotBetween(String value1, String value2) {
            addCriterion("takeMode not between", value1, value2, "takemode");
            return (Criteria) this;
        }

        public Criteria andWorklocIsNull() {
            addCriterion("workLoc is null");
            return (Criteria) this;
        }

        public Criteria andWorklocIsNotNull() {
            addCriterion("workLoc is not null");
            return (Criteria) this;
        }

        public Criteria andWorklocEqualTo(String value) {
            addCriterion("workLoc =", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocNotEqualTo(String value) {
            addCriterion("workLoc <>", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocGreaterThan(String value) {
            addCriterion("workLoc >", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocGreaterThanOrEqualTo(String value) {
            addCriterion("workLoc >=", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocLessThan(String value) {
            addCriterion("workLoc <", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocLessThanOrEqualTo(String value) {
            addCriterion("workLoc <=", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocLike(String value) {
            addCriterion("workLoc like", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocNotLike(String value) {
            addCriterion("workLoc not like", value, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocIn(List<String> values) {
            addCriterion("workLoc in", values, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocNotIn(List<String> values) {
            addCriterion("workLoc not in", values, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocBetween(String value1, String value2) {
            addCriterion("workLoc between", value1, value2, "workloc");
            return (Criteria) this;
        }

        public Criteria andWorklocNotBetween(String value1, String value2) {
            addCriterion("workLoc not between", value1, value2, "workloc");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthIsNull() {
            addCriterion("accDepreMonth is null");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthIsNotNull() {
            addCriterion("accDepreMonth is not null");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthEqualTo(Integer value) {
            addCriterion("accDepreMonth =", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthNotEqualTo(Integer value) {
            addCriterion("accDepreMonth <>", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthGreaterThan(Integer value) {
            addCriterion("accDepreMonth >", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("accDepreMonth >=", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthLessThan(Integer value) {
            addCriterion("accDepreMonth <", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthLessThanOrEqualTo(Integer value) {
            addCriterion("accDepreMonth <=", value, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthIn(List<Integer> values) {
            addCriterion("accDepreMonth in", values, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthNotIn(List<Integer> values) {
            addCriterion("accDepreMonth not in", values, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthBetween(Integer value1, Integer value2) {
            addCriterion("accDepreMonth between", value1, value2, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andAccdepremonthNotBetween(Integer value1, Integer value2) {
            addCriterion("accDepreMonth not between", value1, value2, "accdepremonth");
            return (Criteria) this;
        }

        public Criteria andFirstusedateIsNull() {
            addCriterion("firstUseDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstusedateIsNotNull() {
            addCriterion("firstUseDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstusedateEqualTo(String value) {
            addCriterion("firstUseDate =", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateNotEqualTo(String value) {
            addCriterion("firstUseDate <>", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateGreaterThan(String value) {
            addCriterion("firstUseDate >", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateGreaterThanOrEqualTo(String value) {
            addCriterion("firstUseDate >=", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateLessThan(String value) {
            addCriterion("firstUseDate <", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateLessThanOrEqualTo(String value) {
            addCriterion("firstUseDate <=", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateLike(String value) {
            addCriterion("firstUseDate like", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateNotLike(String value) {
            addCriterion("firstUseDate not like", value, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateIn(List<String> values) {
            addCriterion("firstUseDate in", values, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateNotIn(List<String> values) {
            addCriterion("firstUseDate not in", values, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateBetween(String value1, String value2) {
            addCriterion("firstUseDate between", value1, value2, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andFirstusedateNotBetween(String value1, String value2) {
            addCriterion("firstUseDate not between", value1, value2, "firstusedate");
            return (Criteria) this;
        }

        public Criteria andBillingdateIsNull() {
            addCriterion("BillingDate is null");
            return (Criteria) this;
        }

        public Criteria andBillingdateIsNotNull() {
            addCriterion("BillingDate is not null");
            return (Criteria) this;
        }

        public Criteria andBillingdateEqualTo(String value) {
            addCriterion("BillingDate =", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateNotEqualTo(String value) {
            addCriterion("BillingDate <>", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateGreaterThan(String value) {
            addCriterion("BillingDate >", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateGreaterThanOrEqualTo(String value) {
            addCriterion("BillingDate >=", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateLessThan(String value) {
            addCriterion("BillingDate <", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateLessThanOrEqualTo(String value) {
            addCriterion("BillingDate <=", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateLike(String value) {
            addCriterion("BillingDate like", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateNotLike(String value) {
            addCriterion("BillingDate not like", value, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateIn(List<String> values) {
            addCriterion("BillingDate in", values, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateNotIn(List<String> values) {
            addCriterion("BillingDate not in", values, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateBetween(String value1, String value2) {
            addCriterion("BillingDate between", value1, value2, "billingdate");
            return (Criteria) this;
        }

        public Criteria andBillingdateNotBetween(String value1, String value2) {
            addCriterion("BillingDate not between", value1, value2, "billingdate");
            return (Criteria) this;
        }

        public Criteria andFundingsrcIsNull() {
            addCriterion("fundingSrc is null");
            return (Criteria) this;
        }

        public Criteria andFundingsrcIsNotNull() {
            addCriterion("fundingSrc is not null");
            return (Criteria) this;
        }

        public Criteria andFundingsrcEqualTo(String value) {
            addCriterion("fundingSrc =", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcNotEqualTo(String value) {
            addCriterion("fundingSrc <>", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcGreaterThan(String value) {
            addCriterion("fundingSrc >", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcGreaterThanOrEqualTo(String value) {
            addCriterion("fundingSrc >=", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcLessThan(String value) {
            addCriterion("fundingSrc <", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcLessThanOrEqualTo(String value) {
            addCriterion("fundingSrc <=", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcLike(String value) {
            addCriterion("fundingSrc like", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcNotLike(String value) {
            addCriterion("fundingSrc not like", value, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcIn(List<String> values) {
            addCriterion("fundingSrc in", values, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcNotIn(List<String> values) {
            addCriterion("fundingSrc not in", values, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcBetween(String value1, String value2) {
            addCriterion("fundingSrc between", value1, value2, "fundingsrc");
            return (Criteria) this;
        }

        public Criteria andFundingsrcNotBetween(String value1, String value2) {
            addCriterion("fundingSrc not between", value1, value2, "fundingsrc");
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