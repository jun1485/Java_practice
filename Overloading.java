public class Car
{
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car()
	{
  
	}

	Car(String company)
	{
		this.company = company;
	}

	Car(String model, String color)
	{
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	Car(String model, int maxSpeed, String color) // 매개변수의 타입 순서만 달라도 오버로딩 허용 !
  {
  this.model = model; this.color = color;
	this.maxSpeed = maxSpeed;

	Car(String maxSpeed, int model, String color) // 하지만 매개변수 이름만 다르면 컴파일 오류 !
  {
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
	}
} 
//---------------------------------------------------

public class java
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);

		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);

		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);

		Car car4 = new Car("자가용", "빨강", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}
