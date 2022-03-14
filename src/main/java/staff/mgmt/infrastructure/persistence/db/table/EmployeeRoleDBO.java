package staff.mgmt.infrastructure.persistence.db.table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;
import staff.mgmt.domain.model.staff_mgmt.employee.Employee;
import staff.mgmt.domain.model.staff_mgmt.role.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_role")
public class EmployeeRoleDBO {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Generated(GenerationTime.INSERT)
    private String id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeDBO employeeDBO;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleDBO roleDBO;
}
