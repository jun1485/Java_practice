public class Car 
{
	private int speed;
	private boolean stop;

	public int getSpeed() 
	{
		return speed;
	}

	public boolean isStop()
	{
		return stop;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
	
	public void setStop(boolean stop)
	{
		this.stop = stop;
		if(stop == true)
		{
			speed = 0;
		}
	}
}
//---------------------------------------------------

public class java 
{
	public static void main(String[] args) 
	{
		Car myCar = new Car();
		
		myCar.setSpeed(60);
		myCar.setStop(false);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		myCar.setStop(true);
		
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
	}
}
