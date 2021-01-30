import java.util.Scanner;

public class scan {

	public static void main(String[] args)
	{
		System.out.print("입력할 정수의 개수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++)
		{
			data[i] = sc.nextInt();
			sum += data[i];			
		}
		
		int max = data[0];
		for(int i=0; i<n; i++)
		{
			if(max < data[i])
				max = data[i];
		}
		
		System.out.println("입력받은 정수의 합은 " + sum + " ,"
				+ "최대값은 " + max + " 입니다.");
		
		sc.close();
	}
}
