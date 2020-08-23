public class Person
{
	final String nation = "Korea";
	final String ssn;		// final 필드에는 '딱 한번의' 초기값 지정 후에는
	String name;			// 더 이상 값을 수정할 수 없음.
	
	public Person(String ssn, String name)
	{
		this.ssn = ssn;
		this.name = name;		
	}
}	
//---------------------------------------------------

public class java
{
	public static void main(String[] args)
	{
		Person p1 = new Person("123456-1234567", "Joo");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// this.nation = "America";	// 컴파일 오류 ! 
		// this.name = "ㅎㅎㅎ";		// 컴파일 오류 !
	}
}
