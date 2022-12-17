package cct.cds.check.dto;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AssetcheckhisParam {
    private Integer assetchkid;

    private Integer assetid;

    private String orgid;

    private Integer taskid;

    private Byte checkresult; 

    private Byte checkmode;

    private String username4unit;

    private Date updatetime;

    private String assetname;

    private String assetcode;
}
