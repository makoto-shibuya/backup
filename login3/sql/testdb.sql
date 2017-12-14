drop database if exists logindb;
create database logindb;
use logindb;

create table users(
use_id int primary key auto increment,
use_name varchar(255),
password varchar(255)
);

insert into users value(1,"taro","123");
insert into users value(2,"jiro","456");
insert into users value(3,"hanako"789");
