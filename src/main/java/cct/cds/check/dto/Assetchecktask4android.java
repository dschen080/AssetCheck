package cct.cds.check.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Assetchecktask4android {
    private String taskname; //任务名

    private int unfinished; //待盘点数量 0

    private int finished; //盘点正确数量 1 

    private int loss; //盘亏 3

    private int extra; //盘盈 5

    private String valued;//是否有价值

    private int taskid;
}
