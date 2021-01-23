scan.java
import java.util.Scanner;

public class scan {

	public static void main(String[] args)
	{
		int number = 123;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");

		int input = sc.nextInt();

		if(number == input)
		{
			System.out.println("숫자가 정확함 !");
		}
		else
		{
			System.out.println("숫자가 정확하지 않음 !");
		}
		sc.close();
	}
}
