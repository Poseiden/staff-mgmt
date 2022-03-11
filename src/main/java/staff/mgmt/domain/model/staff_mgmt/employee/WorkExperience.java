package staff.mgmt.domain.model.staff_mgmt.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {
    private String id;
    private Period period;
    private String company;
}
