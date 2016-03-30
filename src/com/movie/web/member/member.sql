SELECT * from Member;
CREATE TABLE Member(
	id VARCHAR2(30) PRIMARY KEY,
	name VARCHAR2(30) NOT NULL,
	password VARCHAR2(30) NOT NULL,
	addr VARCHAR2(100),
	birth NUMBER
update Member set subject='java/jsp/sql/spring' ,major='computer' where  id='hong';
update Member set subject='java/jsp/sql/spring' ,major='computer' where  id='pjava/jsp/sql/spring';
update Member set subject='java/jsp/sql/spring' ,major='computer' where 	id='lee';
update Member set subject='java/jsp/sql/spring' ,major='info' where id='song';
update Member set subject='java/jsp/sql/spring' ,major='info' where id='yoon';
update Member set subject='java/jsp/sql/spring' ,major='info' where id='pack';
update Member set subject='java/jsp/sql/spring' ,major='security' where id='sul';
update Member set subject='java/jsp/sql/spring' ,major='security' where id='55';
update Member set subject='java/jsp/sql/spring' ,major='security' where id='p1';
update Member set subject='java/jsp/sql/spring' ,major='security' where id='p';
	
);
INSERT INTO Grade(id,name,password,addr,birth)
VALUES('1','song','50','40','30','60');
INSERT INTO Grade(id,name,password,addr,birth)
VALUES('1','song','50','40','30','60');
INSERT INTO Grade(id,name,password,addr,birth)
VALUES('1','song','50','40','30','60');
INSERT INTO Grade(id,name,password,addr,birth)
VALUES('1','song','50','40','30','60');
INSERT INTO Grade(id,name,password,addr,birth)
VALUES('1','song','50','40','30','60');


--DDL 테이블 수정
--1. 컬럼추가
alter table Member ADD subject varchar2(100);
alter table Member ADD major varchar2(20);--JAVA SQL SPRING
--2. 컬럼 수정 (이름)
alter table Member RENAME COLUMN password to pass;
--3. 컬럼 수정 (타입)
alter table Member MODIFY birth DATE;


