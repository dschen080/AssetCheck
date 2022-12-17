package cct.cds.check.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoParam {
    @ApiModelProperty(value = "登录用户名，唯一，可能来自资产云")
    private String staffid;

    @ApiModelProperty(value = "资产单位代码")
    private String orgid;

    @ApiModelProperty(value = "本单位的员工ID")
    private String username4unit;

    @ApiModelProperty(value = "orgId+username4unit")
    private String username;

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

    @ApiModelProperty(value = "状态")
    private Byte state;
}
