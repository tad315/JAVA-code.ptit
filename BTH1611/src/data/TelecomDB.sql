-- create database TelecomDB;
use TelecomDB;

-- DROP TABLE IF EXISTS Service;
-- DROP TABLE IF EXISTS Employee;
-- DROP TABLE IF EXISTS Sale;

create table Service(
	service_id int primary key auto_increment,
    name varchar(100),
    gr_name varchar(50),
    cost double,
    fee double
);

create table Employee(
	employee_id int primary key auto_increment,
    full_name varchar(100),
    address varchar(100),
    phone varchar(20)
);

create table Sale(
	employee_id int,
    service_id int,
    quantity int,
    primary key (employee_id, service_id),
    foreign key (employee_id) references Employee(employee_id),
    foreign key (service_id) references Service(service_id)
);

select * from Service;
select * from Employee;
select * from Sale;