--시퀀스 생성
CREATE SEQUENCE score_seq
START WITH 1
INCREMENT BY 1;


DROP TABLE Grade CASCADE CONSTRAINT;

CREATE TABLE Grade(
	hak NUMBER PRIMARY KEY,
	id  VARCHAR2(30) UNIQUE,
	java NUMBER	NOT NULL,
	jsp NUMBER	NOT NULL,
	sql NUMBER	NOT NULL,
	spring NUMBER NOT NULL
);
alter table Grade RENAME hak to examsep;

INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES('1','song','50','40','30','60');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES('2','kim','90','80','80','90');
INSERT INTO Grade(score_seq,java,jsp,sql,spring)
VALUES('3','kim2','20','20','40','30');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES('4','yoon','90','70','80','80');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES('5','lee','100','100','100','90');
INSERT INTO Grade(score_seq,id,java,jsp,sql,spring)
VALUES('6','jin','90','70','80','90');


SELECT* FROM Member;

SELECT * FROM Grade;

WHERE id = 'song';