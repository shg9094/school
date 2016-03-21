--시퀀스 생성
CREATE SEQUENCE hak
	START WITH 20160001,
	INCREMENT BY 1;


	DROP TABLE Grade CAS;

CREATE TABLE Grade(
	hak NUMBER PRIMARY KEY,
	id  VARCHAR2(30) UNIQUE,
	java NUMBER	NOT NULL,
	jsp NUMBER	NOT NULL,
	sql NUMBER	NOT NULL,
	spring NUMBER NOT NULL
);


INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160001','song','50','40','30','60');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160002','kim','90','80','80','90');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160003','kim2','20','20','40','30');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160004','yoon','90','70','80','80');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160005','lee','100','100','100','90');
INSERT INTO Grade(hak,id,java,jsp,sql,spring)
VALUES('200160006','jin','90','70','80','90');


SELECT* FROM Member;

SELECT * FROM Grade;

WHERE id = 'song';