package staff.mgmt.domain.model.staff_mgmt.skill_definition;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillDefinition {
    private String id;
    private String skillCategoryId;
    private List<String> employeeSkillIdList;
}
