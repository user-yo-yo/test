set names utf8;
set foreign_key_checks = 0;

drop database if exists logindb_o;
create database logindb_o;
use logindb_o;

create table user(
	id int,
	user_name varchar(255),
	password varchar(255)
);

insert into user values
(1,"a","567"),
(2,"dsg","763"),
(3,"5gd","46");