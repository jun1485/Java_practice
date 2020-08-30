public class Parent
{
	void method1()
	{
	System.out.println("Parent-method1");
	}
	void method2()
	{
		System.out.println("Parent-method2");
	}
}
//---------------------------------------

public class Child extends Parent
{
	void method2()
	{
		System.out.println("Child-method2");
	}
	void method3()
	{
		System.out.println("Child-method3");
	}
}
//---------------------------------------

public class ChildExample 
{
	public static void main(String[] args)
	{
		Child child = new Child();
	
		Parent parent =  child;
		
		parent.method1();
		parent.method2();
		// parent.method3();	// parent타입으로 쓰기 때문에 parent에는 없는
								// method3()은 쓸 수가 없다 !
	}
}
