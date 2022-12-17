package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Assetrec implements Serializable {
    @ApiModelProperty(value = "记录号")
    private Integer assetid;

    @ApiModelProperty(value = "资产单位编码")
    private String orgid;

    @ApiModelProperty(value = "资产编号")
    private String assetcode;

    @ApiModelProperty(value = "资产名称")
    private String assetname;

    @ApiModelProperty(value = "GS1编码")
    private String code4gs1;

    @ApiModelProperty(value = "资产原值")
    private String assetprice;

    @ApiModelProperty(value = "取得日期")
    private String takedate;

    @ApiModelProperty(value = "数量")
    private Byte amount;

    @ApiModelProperty(value = "计量单位")
    private String measure;

    @ApiModelProperty(value = "累计折旧")
    private String accdepre;

    @ApiModelProperty(value = "存放地点")
    private String storeloc;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "规格型号")
    private String specifics;

    @ApiModelProperty(value = "会计凭证号")
    private String accdocno;

    @ApiModelProperty(value = "备注")
    private String notes;

    @ApiModelProperty(value = "使用人")
    private String assetuser;

    @ApiModelProperty(value = "使用部门")
    private String assetdept;

    @ApiModelProperty(value = "资产分类")
    private String assetclass;

    @ApiModelProperty(value = "资产国标大类")
    private String assetgbclass;

    @ApiModelProperty(value = "使用方向")
    private String usetype;

    @ApiModelProperty(value = "使用状况")
    private String usestate;

    @ApiModelProperty(value = "资产分类编码")
    private String assetclasscode;

    @ApiModelProperty(value = "取得方式")
    private String takemode;

    @ApiModelProperty(value = "坐落位置")
    private String workloc;

    @ApiModelProperty(value = "已提折旧月数")
    private Integer accdepremonth;

    @ApiModelProperty(value = "投入使用日期")
    private String firstusedate;

    @ApiModelProperty(value = "记账日期")
    private String billingdate;

    @ApiModelProperty(value = "资金来源")
    private String fundingsrc;

    private static final long serialVersionUID = 1L;

    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getAssetcode() {
        return assetcode;
    }

    public void setAssetcode(String assetcode) {
        this.assetcode = assetcode;
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    public String getCode4gs1() {
        return code4gs1;
    }

    public void setCode4gs1(String code4gs1) {
        this.code4gs1 = code4gs1;
    }

    public String getAssetprice() {
        return assetprice;
    }

    public void setAssetprice(String assetprice) {
        this.assetprice = assetprice;
    }

    public String getTakedate() {
        return takedate;
    }

    public void setTakedate(String takedate) {
        this.takedate = takedate;
    }

    public Byte getAmount() {
        return amount;
    }

    public void setAmount(Byte amount) {
        this.amount = amount;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getAccdepre() {
        return accdepre;
    }

    public void setAccdepre(String accdepre) {
        this.accdepre = accdepre;
    }

    public String getStoreloc() {
        return storeloc;
    }

    public void setStoreloc(String storeloc) {
        this.storeloc = storeloc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecifics() {
        return specifics;
    }

    public void setSpecifics(String specifics) {
        this.specifics = specifics;
    }

    public String getAccdocno() {
        return accdocno;
    }

    public void setAccdocno(String accdocno) {
        this.accdocno = accdocno;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAssetuser() {
        return assetuser;
    }

    public void setAssetuser(String assetuser) {
        this.assetuser = assetuser;
    }

    public String getAssetdept() {
        return assetdept;
    }

    public void setAssetdept(String assetdept) {
        this.assetdept = assetdept;
    }

    public String getAssetclass() {
        return assetclass;
    }

    public void setAssetclass(String assetclass) {
        this.assetclass = assetclass;
    }

    public String getAssetgbclass() {
        return assetgbclass;
    }

    public void setAssetgbclass(String assetgbclass) {
        this.assetgbclass = assetgbclass;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public String getUsestate() {
        return usestate;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate;
    }

    public String getAssetclasscode() {
        return assetclasscode;
    }

    public void setAssetclasscode(String assetclasscode) {
        this.assetclasscode = assetclasscode;
    }

    public String getTakemode() {
        return takemode;
    }

    public void setTakemode(String takemode) {
        this.takemode = takemode;
    }

    public String getWorkloc() {
        return workloc;
    }

    public void setWorkloc(String workloc) {
        this.workloc = workloc;
    }

    public Integer getAccdepremonth() {
        return accdepremonth;
    }

    public void setAccdepremonth(Integer accdepremonth) {
        this.accdepremonth = accdepremonth;
    }

    public String getFirstusedate() {
        return firstusedate;
    }

    public void setFirstusedate(String firstusedate) {
        this.firstusedate = firstusedate;
    }

    public String getBillingdate() {
        return billingdate;
    }

    public void setBillingdate(String billingdate) {
        this.billingdate = billingdate;
    }

    public String getFundingsrc() {
        return fundingsrc;
    }

    public void setFundingsrc(String fundingsrc) {
        this.fundingsrc = fundingsrc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetid=").append(assetid);
        sb.append(", orgid=").append(orgid);
        sb.append(", assetcode=").append(assetcode);
        sb.append(", assetname=").append(assetname);
        sb.append(", code4gs1=").append(code4gs1);
        sb.append(", assetprice=").append(assetprice);
        sb.append(", takedate=").append(takedate);
        sb.append(", amount=").append(amount);
        sb.append(", measure=").append(measure);
        sb.append(", accdepre=").append(accdepre);
        sb.append(", storeloc=").append(storeloc);
        sb.append(", brand=").append(brand);
        sb.append(", specifics=").append(specifics);
        sb.append(", accdocno=").append(accdocno);
        sb.append(", notes=").append(notes);
        sb.append(", assetuser=").append(assetuser);
        sb.append(", assetdept=").append(assetdept);
        sb.append(", assetclass=").append(assetclass);
        sb.append(", assetgbclass=").append(assetgbclass);
        sb.append(", usetype=").append(usetype);
        sb.append(", usestate=").append(usestate);
        sb.append(", assetclasscode=").append(assetclasscode);
        sb.append(", takemode=").append(takemode);
        sb.append(", workloc=").append(workloc);
        sb.append(", accdepremonth=").append(accdepremonth);
        sb.append(", firstusedate=").append(firstusedate);
        sb.append(", billingdate=").append(billingdate);
        sb.append(", fundingsrc=").append(fundingsrc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}