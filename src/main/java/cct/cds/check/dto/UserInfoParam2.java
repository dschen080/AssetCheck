package cct.cds.check.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoParam2 {

    String orgid;

    String username4unit;

    String passwd;

    String realname;

    String phone;

    String sectname;

    String notes;
}
