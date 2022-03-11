package staff.mgmt.domain.model.staff_mgmt.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String id;
    private List<EmployeeSkill> employeeSkillList;
    private List<WorkExperience> workExperienceList;
    private List<EmployeeRole> employeeRoleList;
}
