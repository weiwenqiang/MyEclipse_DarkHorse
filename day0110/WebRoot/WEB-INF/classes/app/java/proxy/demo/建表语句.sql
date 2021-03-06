CREATE DATABASE day0110;

CREATE TABLE userinfo(
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(40),
  PASSWORD VARCHAR(40)
);

INSERT INTO userinfo VALUES(NULL,'zhangwuji','123');
INSERT INTO userinfo VALUES(NULL,'zhouzhiruo','123');
INSERT INTO userinfo VALUES(NULL,'zhaomin','123');

CREATE TABLE PRIVILEGES(
   id INT PRIMARY KEY AUTO_INCREMENT,
   NAME VARCHAR(40)
);

INSERT INTO PRIVILEGES VALUES(NULL,'添加图书');
INSERT INTO PRIVILEGES VALUES(NULL,'修改图书');
INSERT INTO PRIVILEGES VALUES(NULL,'查看图书');
INSERT INTO PRIVILEGES VALUES(NULL,'删除图书');

CREATE TABLE userprivilege(
   user_id INT ,
   privilege_id INT,
   FOREIGN KEY(user_id) REFERENCES userinfo(id),
   FOREIGN KEY(privilege_id) REFERENCES PRIVILEGES(id),
   PRIMARY KEY(user_id,privilege_id)
);

INSERT INTO userprivilege VALUES(1,1);
INSERT INTO userprivilege VALUES(1,2);
INSERT INTO userprivilege VALUES(1,3);
