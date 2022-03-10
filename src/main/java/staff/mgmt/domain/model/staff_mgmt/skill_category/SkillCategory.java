package staff.mgmt.domain.model.staff_mgmt.skill_category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SkillCategory {
    private String id;
    private String name;
    private List<String> skillDefinitionIdList;

}
