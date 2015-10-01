create table users(
	username varchar(60) not null primary key,
	password varchar(80),
	enabled tinyint default 1
);

create table authorities(
	username varchar(60) primary key,
	authority varchar(45)
);

insert into users(username, password) values ("Mike", "hello");
select * from users;
insert into authorities(username, authority ) values ("Mike", "admin");
select * from authorities;

ALTER TABLE users
ADD email varchar(60) not null;