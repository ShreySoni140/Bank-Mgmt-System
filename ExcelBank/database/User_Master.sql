create table User_Master(LoginId varchar(20) primary key,
Password varchar(100) not null,
FirstName varchar(20) not null,
LastName varchar(20) not null,
Address varchar(100),
City varchar(20) not null,
Designation varchar(20) not null,
BasicSalary int(10) not null,
PhoneNo varchar(14) not null)