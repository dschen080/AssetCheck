package cct.cds.check.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Assetcheck implements Serializable {
    @ApiModelProperty(value = "记录号")
    private Integer assetid;

    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "标签打印次数")
    private Byte printcount;

    @ApiModelProperty(value = "标签类型")
    private Byte labletype;

    @ApiModelProperty(value = "标签打印人")
    private String username4unit;

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

    public Byte getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Byte printcount) {
        this.printcount = printcount;
    }

    public Byte getLabletype() {
        return labletype;
    }

    public void setLabletype(Byte labletype) {
        this.labletype = labletype;
    }

    public String getUsername4unit() {
        return username4unit;
    }

    public void setUsername4unit(String username4unit) {
        this.username4unit = username4unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", assetid=").append(assetid);
        sb.append(", orgid=").append(orgid);
        sb.append(", printcount=").append(printcount);
        sb.append(", labletype=").append(labletype);
        sb.append(", username4unit=").append(username4unit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}