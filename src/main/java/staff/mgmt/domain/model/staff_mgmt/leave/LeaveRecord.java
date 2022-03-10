package staff.mgmt.domain.model.staff_mgmt.leave;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRecord {
    private String id;
    private String staffId;
}
