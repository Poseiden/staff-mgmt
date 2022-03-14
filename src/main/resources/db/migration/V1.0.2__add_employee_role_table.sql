create table staff_mgmt.employee_role
(
    id varchar(255) not null primary key,
    employee_id varchar(255) not null,
    FOREIGN KEY (employee_id) REFERENCES staff_mgmt.employee(id)
);
