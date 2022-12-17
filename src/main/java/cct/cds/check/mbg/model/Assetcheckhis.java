package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Assetcheckhis implements Serializable {
    private Integer assetchkid;

    private Integer assetid;

    private String orgid;

    private Integer taskid;

    private Byte checkresult;

    private Byte checkmode;

    private String username4unit;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getAssetchkid() {
        return assetchkid;
    }

    public void setAssetchkid(Integer assetchkid) {
        this.assetchkid = assetchkid;
    }

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

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Byte getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(Byte checkresult) {
        this.checkresult = checkresult;
    }

    public Byte getCheckmode() {
        return checkmode;
    }

    public void setCheckmode(Byte checkmode) {
        this.checkmode = checkmode;
    }

    public String getUsername4unit() {
        return username4unit;
    }

    public void setUsername4unit(String username4unit) {
        this.username4unit = username4unit;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetchkid=").append(assetchkid);
        sb.append(", assetid=").append(assetid);
        sb.append(", orgid=").append(orgid);
        sb.append(", taskid=").append(taskid);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", checkmode=").append(checkmode);
        sb.append(", username4unit=").append(username4unit);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}