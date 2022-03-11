package staff.mgmt.domain.model.staff_mgmt.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private String id;
    private List<String> employeeRoleIdList;
}
