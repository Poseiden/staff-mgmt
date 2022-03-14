ALTER TABLE staff_mgmt.employee_role add column role_id varchar(255);

ALTER TABLE staff_mgmt.employee_role
ADD FOREIGN KEY (role_id) REFERENCES role(id);