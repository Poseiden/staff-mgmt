package staff.mgmt.domain.model.staff_mgmt.staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffSkill {
    private String id;

    private int duration; //todo 几年？
    private String level; //todo 枚举
}
