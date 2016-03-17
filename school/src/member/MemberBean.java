package member;

public class MemberBean {
	
	private String id, password, name, addr;
	private int birth; // 생년 월일은 808001
	
	public MemberBean(){}
	
	public MemberBean(String id,String password,String name,String addr,int birth){
		this.id = id;
		this.password = password;
		this.name = name;
		this.addr = addr;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", password=" + password + ", name=" + name + ", addr=" + addr + ", birth="
				+ birth + "]";
	}
	


	

}
