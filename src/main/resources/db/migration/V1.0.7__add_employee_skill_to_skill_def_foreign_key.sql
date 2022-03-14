ALTER TABLE staff_mgmt.employee_skill add column skill_definition_id varchar(255);

ALTER TABLE staff_mgmt.employee_skill
ADD FOREIGN KEY (skill_definition_id) REFERENCES skill_definition(id);