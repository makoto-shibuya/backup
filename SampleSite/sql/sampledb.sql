drop database if exists sampledb;

create database if not exists sampledb;

use sampledb;

create table login_user(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(16),
insert_date datetime,
updated_date datetime
);

INSERT INTO login_user(login_id, login_pass, user_name)VALUES("aaa","aaa","aaa");