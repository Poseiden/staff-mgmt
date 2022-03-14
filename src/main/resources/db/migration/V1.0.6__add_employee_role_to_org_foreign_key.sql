ALTER TABLE staff_mgmt.employee_role add column organization_id varchar(255);

ALTER TABLE staff_mgmt.employee_role
ADD FOREIGN KEY (organization_id) REFERENCES organization(id);