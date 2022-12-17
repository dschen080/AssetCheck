package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Orglisting implements Serializable {
    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "单位全名")
    private String unitname;

    @ApiModelProperty(value = "单位类型 ")
    private String usertype;

    @ApiModelProperty(value = "单位联系人")
    private String contact;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "单位标签模板")
    private String labelmodule;

    @ApiModelProperty(value = "备注")
    private String notes;

    @ApiModelProperty(value = "系统时间")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLabelmodule() {
        return labelmodule;
    }

    public void setLabelmodule(String labelmodule) {
        this.labelmodule = labelmodule;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgid=").append(orgid);
        sb.append(", unitname=").append(unitname);
        sb.append(", usertype=").append(usertype);
        sb.append(", contact=").append(contact);
        sb.append(", phone=").append(phone);
        sb.append(", labelmodule=").append(labelmodule);
        sb.append(", notes=").append(notes);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}