public class java
{
	public static void main(String[] args)
	{
		String strVar1 = "Joo";
		String strVar2 = "Joo";
		
		if(strVar1 == strVar2)
		{
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		}
		else
		{
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		String strVar3 = new String ("Joo");
		String strVar4 = new String ("Joo");
		
		if(strVar3 == strVar4)
		{
			System.out.println("strVar3과 strVar4는 참조가 같음.");
		}
		else
		{
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3과 strVar4는 문자열이 같음.");
		}
	}
}
