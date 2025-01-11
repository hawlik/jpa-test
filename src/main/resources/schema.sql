drop table if exists company_attribute_value;
drop table if exists company_attribute;
drop table if exists company;
create table company
(
    id   integer primary key,
    name varchar(50)
);

create table company_attribute
(
    id   integer primary key,
    name varchar(50)
);
create table company_attribute_value
(
    id   integer primary key,
    val varchar(50),
    company_id integer references company,
    company_attribute_id integer references company_attribute
);