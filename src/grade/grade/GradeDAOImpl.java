package grade.grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import global.Constants;
import member.MemberBean;

public class GradeDAOImpl implements GradeDAO {

	private Connection conn; // 오라클 연결 객체
	private Statement stmt;// 쿼리 전송 객체
	private PreparedStatement pstmt;// 쿼리 전송객체2
	private ResultSet rs;//

	public Map<String, Object> selectGradeByHak(int hak) {
		MemberBean member = new MemberBean();
		GradeBean grade = new GradeBean();
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from MEMBER WHERE id ='" + hak + "'");
			while (rs.next()) {
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setAddr(rs.getString("addr"));
				member.setBirth(rs.getInt("birth"));
				grade.setHak(rs.getInt("hak"));
				grade.setHak(rs.getInt("java"));
				grade.setHak(rs.getInt("jsp"));
				grade.setHak(rs.getInt("sql"));
				grade.setHak(rs.getInt("spring"));

			}

		} catch (Exception e) {

			System.out.println("selectMember()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		// System.out.println("쿼리 조회 결과" +Collection.getAddr());
		map.put("member", member);
		map.put("grade", grade);
		return map;

	}

	
	
	@Override
	public void input(GradeBean grade) {
		
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM GradeMember");
			
			
			
			//for (int i=0; rs.next(); i++) {
				//gmb[i]	= new GradeMemberBean();
				//this.setGMB(gmb[i], rs);
			//}

			
			
		} catch (Exception e) {

			System.out.println("selectMember()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		// System.out.println("쿼리 조회 결과" +Collection.getAddr());
		
		
	}

	

	@Override
	public GradeMemberBean[] getList() {
		
		GradeMemberBean[] gmb  = new GradeMemberBean[this.getCount()];

		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM GradeMember");
			
			
			
			for (int i=0; rs.next(); i++) {
				gmb[i]	= new GradeMemberBean();
				this.setGMB(gmb[i], rs);
			}

			
			
		} catch (Exception e) {

			System.out.println("selectMember()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		// System.out.println("쿼리 조회 결과" +Collection.getAddr());
		
		return gmb;
	}

	@Override
	public GradeMemberBean getGradeByHak(int hak) {
		try {

			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM GradeMember WHERE hak = " + hak);
			
			
			rs.next();
			
			GradeMemberBean gmb = new GradeMemberBean();
			
			this.setGMB(gmb, rs);
		
			return gmb;
			
		} catch (Exception e) {

			System.out.println("selectMember()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		
		return null;
	}

	
	@Override
	public GradeMemberBean[] getGradeByName(String name) {
		GradeMemberBean[] gmb = new GradeMemberBean[this.getCountByName(name)];
		try {

			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM GradeMember WHERE name = '" + name + "'");
			
			
			for (int i=0; rs.next(); i++) {
				gmb[i]	= new GradeMemberBean();
				this.setGMB(gmb[i], rs);
			}

			
			
		} catch (Exception e) {

			System.out.println("selectMember()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		
	
		return gmb;
	}
		

	
	@Override
	public int getCount() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT COUNT(*) FROM GradeMember");

			rs.next();
			
			
			//	rs.getInt("COUNT(*)");			
			return rs.getInt(1);
			
		} catch (Exception e) {
			System.err.println("getCount()에서 에러 발생함 ||");
			e.printStackTrace();
		}
		
		return -1;
	}

	@Override
	public int getCountByName(String name) {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PASSWORD);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT COUNT(*) FROM GradeMember WHERE name = '" + name +"'");

			rs.next();
			
			return rs.getInt(1);
			
		} catch (Exception e) {
			System.err.println("getCount()에서 에러 발생함 ||");
			e.printStackTrace();
		}

		
		return -1;
		
	}

	@Override
	public String update(GradeBean grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int hak) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	private GradeMemberBean setGMB(GradeMemberBean gmb, ResultSet rs) {

		try {
			gmb.setId( rs.getString("id") );
			gmb.setHak(rs.getInt("hak"));
			gmb.setAddr(rs.getString("addr"));
			gmb.setBirth(rs.getInt("birth"));
			gmb.setJava(rs.getInt("java"));
			gmb.setJsp(rs.getInt("jsp"));
			gmb.setName(rs.getString("name"));
			gmb.setPassword(rs.getString("password"));
			gmb.setSpring(rs.getInt("spring"));
			gmb.setSql(rs.getInt("sql"));	

		} catch (SQLException e) {
			System.err.println("setGMB()에러!");
			e.printStackTrace();
		}				

		return gmb;
	}
	
}