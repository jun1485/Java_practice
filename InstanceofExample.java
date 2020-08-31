public class Parent
{
	
}
//------------------------------------------


public class Child extends Parent
{
	
}
//------------------------------------------

public class InstanceofExample
{
	public static void method1(Parent parent)
	{
		if(parent instanceof Child)	// parent변수가 참조하는 객체가
		{							// Child라는 클래스로부터 만들어진 객체인지 검사
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공 !");
		}
		else
		{
			System.out.println("method1 - Child로 변환되지 않음 !");
		}
	}
	
	public static void main(String[] args)
	{
		Parent parent = new Child();	// Child객체가 Parent타입으로 자동변환
		method1(parent);
	}
}
