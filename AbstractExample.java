public abstract class Animal
{
	public String kind;
	
	public void breathe()
	{
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
}
//------------------------------------------

public class Dog extends Animal
{
	@Override
	public void sound()		// abstract메소드는 '반드시' 정의해 주어야 함 !
	{
		System.out.println("멍멍");
	}
}
