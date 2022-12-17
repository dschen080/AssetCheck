package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Userlisting implements Serializable {
    @ApiModelProperty(value = "orgId+username4unit")
    private String username;

    @ApiModelProperty(value = "登录用户名，唯一，可能来自资产云")
    private String staffid;

    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "本单位的员工ID")
    private String username4unit;

    @ApiModelProperty(value = "密码（MD5）")
    private String passwd;

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

    @ApiModelProperty(value = "系统时间")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
        sb.append(", username=").append(username);
        sb.append(", staffid=").append(staffid);
        sb.append(", orgid=").append(orgid);
        sb.append(", username4unit=").append(username4unit);
        sb.append(", passwd=").append(passwd);
        sb.append(", realname=").append(realname);
        sb.append(", usertype=").append(usertype);
        sb.append(", phone=").append(phone);
        sb.append(", sectname=").append(sectname);
        sb.append(", notes=").append(notes);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}