package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

public class MemberDAOImple implements MemberDAO{
	
	private Connection conn; //오라클 연결 객체
	private Statement stmt;//쿼리 전송 객체
	private PreparedStatement pstmt;//쿼리 전송객체2
	private ResultSet rs;//
	
	
	@Override
	public void insert(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectById(String id, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean selectMember(String id) {
		MemberBean temp = new MemberBean();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL,
				  Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt  = conn.createStatement();
			rs = stmt.executeQuery("select * from MEMBER WHERE id ='"+id+"'");
			while ( rs.next()) {
				temp.setId(rs.getString("id"));
				temp.setName(rs.getString("name"));
				temp.setPassword(rs.getString("password"));
				temp.setAddr(rs.getString("addr"));
				temp.setBirth(rs.getInt("birth"));
				}
			
			} catch (Exception e) {
			
				System.out.println("selectMember()에서 에러 발생함 ||");
				e.printStackTrace();
		}
		System.out.println("쿼리 조회 결과" +temp.getAddr());
		return temp;
		
	}

	@Override
	public void update(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}


}
