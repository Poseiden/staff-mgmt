package staff.mgmt.domain.model.staff_mgmt.staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private String id;
    private List<StaffSkill> staffSkillList;
    private List<WorkExperience> workExperienceList;
    private List<StaffRole> staffRoleList;
}
