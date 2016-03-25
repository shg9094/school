SELECT * from TEST;
CREATE TABLE Member(
	id VARCHAR2(30) PRIMARY KEY,
	name VARCHAR2(30) NOT NULL,
	password VARCHAR2(30) NOT NULL,
	addr VARCHAR2(100),
	birth NUMBER
	
);

select * from MEMBER;

UPDATE MEMBER
SET password = '2' , addr='도쿄'
WHERE id = 'you';

DELETE from MEMBER WHERE id = 'you';

