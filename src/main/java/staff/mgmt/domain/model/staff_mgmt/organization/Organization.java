package staff.mgmt.domain.model.staff_mgmt.organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    private String id;
    private Organization superior;
    private List<Organization> subordinate;
    private List<String> employeeRoleIdList;
}
