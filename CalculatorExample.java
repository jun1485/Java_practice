public class Carculator
{
	double areaRectangle(double width) 
	{
		return width * width; // 정사각형의 넓이
	}

	double areaRectangle(double width, double height)
	{
		return width * height;
	}
}
// ---------------------------------------------------

public class java 
{
	public static void main(String[] args)
	{
		Carculator myCarc = new Carculator();
		System.out.println(myCarc.areaRectangle(10));

		System.out.println(myCarc.areaRectangle(10, 20));
	}
}
