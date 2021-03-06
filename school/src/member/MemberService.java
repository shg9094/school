package member;

public interface MemberService {
	public String join(MemberBean member);
	public String login(String id, String password);
	public MemberBean detail(String id);
	public void update(MemberBean member);
	public void remove(String id);
}
