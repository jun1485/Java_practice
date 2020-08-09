public class java
{
	public static void main(String[] args)
	{
		int num1 = 123456780;
		int num2 = 123456780;
		
		float floatValue = num2;
		num2 = (int)floatValue;
		
		int res = num1 - num2;
		System.out.println(res);	// 값이 손실됨.
		
		System.out.println("-------------------");
		num1 = 123456780;
		num2 = 123456780;
		
		double doubleValue = num2;
		num2 = (int)doubleValue;
		
		res = num1 - num2;
		System.out.println(res);	// 값 제대로 출력.
	}
}
