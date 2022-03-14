ALTER TABLE staff_mgmt.organization add column superior varchar(255);

ALTER TABLE staff_mgmt.organization
    ADD
    FOREIGN KEY (superior)
    REFERENCES organization(id);

