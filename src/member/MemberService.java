package member;

public interface MemberService {
	public	int join(MemberBean member);
	public MemberBean login(String id, String password);
	public MemberBean detail(String id);
	public int update(MemberBean member);
	public int remove(String id);
	public boolean isMember(String id);
}
