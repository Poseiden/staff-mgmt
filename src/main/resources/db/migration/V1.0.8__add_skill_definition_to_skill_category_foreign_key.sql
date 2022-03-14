ALTER TABLE staff_mgmt.skill_definition add column skill_category_id varchar(255);

ALTER TABLE staff_mgmt.skill_definition
ADD FOREIGN KEY (skill_category_id) REFERENCES skill_category(id);