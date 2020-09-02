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
//------------------------------------------

public class AbstractExample
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		
		dog.sound();
		System.out.println("--------------------------------");
		
		Animal animal = null;
		animal = new Dog();
		
		animal.sound();
		System.out.println("--------------------------------");
		
		animalSound(new Dog());
	}
	public static void animalSound(Animal animal) // 어떤 자식객체가 와도 실행 가능 !
	{
		animal.sound();
	}
}
