public class Car

{
	String color;
	int cc;

	Car(String color, int cc) // 매개변수가 있는 생성자
	{
		this.color = color;
		this.cc = cc;
	}
}
// ---------------------------------------------------

public class java
{
	public static void main(String[] args)
	{
		// Car myCar = new myCar();		// 매개변수가 있는 생성자가 존재하기 때문에
		Car myCar = new Car("Red", 3000);  // 기본생성자가 생성되지 않음 !
		
		System.out.println("차 색상 : " + myCar.color);
		System.out.println("cc : " + myCar.cc);
	}									
}
