public class java
{
	public static void main(String[] args)
	{
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue); 
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue = 1000000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);		// 부동소수점 표기로 출력
	}
}
