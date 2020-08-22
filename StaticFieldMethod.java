public class Car
{
	int speed;
	
	void run()
	{
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args)
	{
		// speed = 60; 	// static으로 되어있는 메소드에서
		// run(); 		// instance field와 메소드 사용 불가 !
		
		Car myCar = new Car();
		myCar.speed = 60;
		
		myCar.run();
	}
}
