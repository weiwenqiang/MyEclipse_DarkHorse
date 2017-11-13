create database day0107;

CREATE TABLE t_user(
	username VARCHAR(50),
    password varchar(50),
    role varchar(50)
);

select * from t_user;

insert into t_user values('zhangwuji','123','user');
insert into t_user values('zhouzhiruo','123','admin');
