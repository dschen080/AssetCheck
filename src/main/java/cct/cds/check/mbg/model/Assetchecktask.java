package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Assetchecktask implements Serializable {
    @ApiModelProperty(value = "记录号")
    private Integer taskid;

    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "任务摘要")
    private String taskabstract;

    @ApiModelProperty(value = "盘点开始时间")
    private String taskbegin;

    @ApiModelProperty(value = "盘点结束时间")
    private String taskend;

    @ApiModelProperty(value = "任务发起人")
    private String username4unit;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getTaskabstract() {
        return taskabstract;
    }

    public void setTaskabstract(String taskabstract) {
        this.taskabstract = taskabstract;
    }

    public String getTaskbegin() {
        return taskbegin;
    }

    public void setTaskbegin(String taskbegin) {
        this.taskbegin = taskbegin;
    }

    public String getTaskend() {
        return taskend;
    }

    public void setTaskend(String taskend) {
        this.taskend = taskend;
    }

    public String getUsername4unit() {
        return username4unit;
    }

    public void setUsername4unit(String username4unit) {
        this.username4unit = username4unit;
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
        sb.append(", taskid=").append(taskid);
        sb.append(", orgid=").append(orgid);
        sb.append(", taskabstract=").append(taskabstract);
        sb.append(", taskbegin=").append(taskbegin);
        sb.append(", taskend=").append(taskend);
        sb.append(", username4unit=").append(username4unit);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}