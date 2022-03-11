package staff.mgmt.domain.model.staff_mgmt.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRole {
    private String id;
    private String roleId;
    private String organizationId;
}
