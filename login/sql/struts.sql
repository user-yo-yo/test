set names utf8;
set foreign_key_checks = 0;
drop database if exists logindb_john;
create database logindb_john;
use logindb_john;

create table user(
	id int,
	user_name varchar(255),
	password varchar(255)
);

insert into user values
(1,"a","123"),
(2,"b","234"),
(3,"c","345"),
(4,"d","456");
