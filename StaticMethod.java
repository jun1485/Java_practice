public class Television
{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static
	{
		info = company + "-" + model;
	}
}
//---------------------------------------------------

public class java
{
	public static void main(String[] args)
	{
		System.out.println(Television.info);
	}
}
