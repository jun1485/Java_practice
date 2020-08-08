public class java
{
	public static void main(String[] args)
	{
		int var1 = 10;		// 10진수
		System.out.println(var1);
		
		int var2 = 010;		// 8진수
		System .out.println(var2);
		
		int var3 = 0x20;	// 16진수
		System.out.println(var3);
		
		double var4 = 0.24;
		System.out.println(var4);
		
		double var5 = 2E5;	// 2 곱하기 10의5승
		System.out.println(var5);
		
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '주';
		System.out.println(var7);
		
		System.out.println("\t들여쓰기");
		
		System.out.println("대한\n민국");
		
		System.out.println("This" + '\'' + "s Java");
		
		System.out.println("이것은" + '\"' + "중요" + '\"' + "하다.");
		
		char var8 = '\u0041';	// 유니코드(16진수로 계산해 출력)
		System.out.println(var8);
		
		String var9 = "자바";		// 문자열 저장
		System.out.println(var9);
		
		boolean var10 = true; 	// 논리 리터럴 저장
		boolean var11 = false;
		System.out.println(var10);
		
	}
}
