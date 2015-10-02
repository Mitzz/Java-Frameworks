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

update authorities
set authority = 'admin'
where username = 'Administrator';

Select * from authorities where binary username = 'administrator';
Select * from users where binary username = 'Administrator';

UPDATE `springtutorial`.`authorities` SET `authority`='ROLE_ADMIN' WHERE `username`='Administrator';
UPDATE `springtutorial`.`authorities` SET `authority`='ROLE_ADMIN' WHERE `username`='Mike';
UPDATE `springtutorial`.`authorities` SET `authority`='ROLE_USER' WHERE `username`='GangaMytes';
UPDATE `springtutorial`.`authorities` SET `authority`='ROLE_USER' WHERE `username`='mithulbhansali';


Delete from users where enabled = 1;
delete from authorities where authoritY in ('ROLE_ADMIN', 'ROLE_USER');