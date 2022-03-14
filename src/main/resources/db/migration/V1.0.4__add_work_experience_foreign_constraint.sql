ALTER TABLE staff_mgmt.work_experience add column employee_id varchar(255);

ALTER TABLE staff_mgmt.work_experience
ADD FOREIGN KEY (employee_id) REFERENCES employee(id);