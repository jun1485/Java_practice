import java.util.Scanner;

public class scan {

	public static void main(String[] args)
	{
		String str = "hi";

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");

		String input = sc.next();

		if(str.equals(input))  //문자열 비교는 if문으로 불가 !
		{
			System.out.println("문자열이 정확함 !");
		}
