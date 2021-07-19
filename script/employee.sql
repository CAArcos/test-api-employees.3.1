use test_db;
drop table if exists employee;
create table employee (
    id int(11) not null AUTO_INCREMENT,
    fullname varchar(50),
    id_boss int(11),
	primary key (id),
    constraint boss_fk foreign key (id_boss) references employee (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;