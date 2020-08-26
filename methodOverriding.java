public class Calculator
{
	double areaCircle(double r)
	{
		System.out.println("Carculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}
//------------------------------------------

public class Computer extends Calculator
{
	@Override	// 작성한 메소드가 정확하게 부모가 가지고 있는지를 검사하는 어노테이션 !
	double areaCircle(double r)		// 메소드 재정의(overriding)
	{
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
//------------------------------------------

public class ComputerExample
{
	public static void main(String[] args)
	{	
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println("원의 면적 : " + calc.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원의 면적 : " + computer.areaCircle(r));
	}
}
