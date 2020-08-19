public class MemberService 
{
	private String id;
	private String password;
	
	MemberService(String id, String password)
	{
		this.id = id;
		this.password = password;
	}
	
	public boolean login(String id, String password)
	{
		if(id == "hong" && password == "12345")
		{
			System.out.println("로그인 성공 !");
			return true;
		}
		
		else 
		{
			System.out.println("로그아웃 실패 !");
			return false;
		}
			
	}
	public void logout()
	{
		System.out.println("로그아웃 되었습니다.");
	}
}
//---------------------------------------------------

public class java
{
	public static void main(String[] args)
	{
		MemberService ms1 = new MemberService("hong", "12345");
		
		ms1.login("hong", "12345");
		
		ms1.logout();
	}
}
