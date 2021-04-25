create table user (
user_Id int not null auto_increment,
name varchar(255),
address varchar(255) ,
email varchar(255),
primary key (user_Id)
);

select * from user;

create table employee (
user_Id int not null,
name varchar(255),
address varchar(255) ,
email varchar(255),
telephone varchar(255),
salary varchar(255),
primary key (user_Id)
);
