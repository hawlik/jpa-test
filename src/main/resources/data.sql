insert into company(id, name)
values (1, 'IBM');
insert into company(id, name)
values (2, 'Oracle');

insert into company_attribute(id, name)
values (1, 'Category');
insert into company_attribute(id, name)
values (2, 'Public');


insert into company_attribute_value(id, company_id, company_attribute_id, val)
values (1, 1, 1, 'Software');
insert into company_attribute_value(id, company_id, company_attribute_id, val)
values (2, 1, 2, 'true');