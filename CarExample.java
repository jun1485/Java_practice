public class Car 
{
	int speed;

	int getSpeed()
	{
		return speed;
	}

	void keyTurnOn() 
	{
		System.out.println("키를 돌립니다.");
	}

	void run()
	{
		for (int i = 10; i <= 50; i += 10) 
		{
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}
} // ---------------------------------------------------

public class java 
{
	public static void main(String[] args)
	{
		Car myCar = new Car();

		myCar.keyTurnOn();
		myCar.run();

		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}
