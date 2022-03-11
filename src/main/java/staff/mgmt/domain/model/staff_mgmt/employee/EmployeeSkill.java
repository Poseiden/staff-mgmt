package staff.mgmt.domain.model.staff_mgmt.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSkill {
    private String id;
    private String skillDefinitionId;
    private int duration; //todo 几年？
    private String level; //todo 枚举
}
