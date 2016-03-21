CREATE OR REPLACE VIEW GradeMember
AS
SELECT 
	g.id AS id,
	g.hak AS hak,
	g.java AS java,
	g.jsp AS jsp,
	g.sql AS sql,
	g.spring AS spring,
	m.name AS name,
	m.password AS password,
	m.addr AS addr,
	m.birth AS birth
FROM Member m, Grade g
WHERE m.id = g.id;
-- sql 2개 가져와 합치기
					


select * from GradeMember;

select * from GradeMember
WHERE name = '김유신';