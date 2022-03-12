create table staff_mgmt.employee
(
    id varchar(255) not null
        primary key
);

create table staff_mgmt.organization
(
    id varchar(255) not null
        primary key
);

create table staff_mgmt.role
(
    id varchar(255) not null
        primary key
);

create table staff_mgmt.skill_category
(
    id varchar(255) not null
        primary key,
    name varchar(255) null
);

create table staff_mgmt.skill_definition
(
    id varchar(255) not null
        primary key
);

create table staff_mgmt.work_experience
(
    id varchar(255) not null
        primary key,
    company varchar(255) null,
    end datetime(6) null,
    start datetime(6) null
);

