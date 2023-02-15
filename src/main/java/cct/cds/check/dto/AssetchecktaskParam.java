package cct.cds.check.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AssetchecktaskParam {

    @ApiModelProperty(value = "任务发布方式")
    private String option;

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
}
