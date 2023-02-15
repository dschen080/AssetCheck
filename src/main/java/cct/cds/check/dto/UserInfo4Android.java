package cct.cds.check.dto;

import io.swagger.annotations.ApiModelProperty;

public class UserInfo4Android {
    @ApiModelProperty(value = "登录用户名，唯一，可能来自资产云")
    private String staffid;

    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "本单位的员工ID")
    private String username4unit;

    @ApiModelProperty(value = "真实姓名")
    private String realname;

    @ApiModelProperty(value = "用户名类型")
    private Byte usertype;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "部门")
    private String sectname;

    @ApiModelProperty(value = "备注")
    private String notes;

    @ApiModelProperty(value = "单位全名")
    private String unitname;

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getUsername4unit() {
        return username4unit;
    }

    public void setUsername4unit(String username4unit) {
        this.username4unit = username4unit;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Byte getUsertype() {
        return usertype;
    }

    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSectname() {
        return sectname;
    }

    public void setSectname(String sectname) {
        this.sectname = sectname;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }
    
}
