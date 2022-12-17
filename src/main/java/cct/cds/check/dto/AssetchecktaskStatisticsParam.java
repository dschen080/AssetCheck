package cct.cds.check.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AssetchecktaskStatisticsParam {

    @ApiModelProperty(value = "资产记录号列表")
    private List<Integer> assetid;

    @ApiModelProperty(value = "任务id")
    private String taskid;

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

    @ApiModelProperty(value = "盘点总数")
    private int checksum;

    @ApiModelProperty(value = "盘点正确数量")
    private int checked;

    @ApiModelProperty(value = "盘亏数量")
    private int loss;

    @ApiModelProperty(value = "待盘点数量")
    private int tobechecked;

    
}
