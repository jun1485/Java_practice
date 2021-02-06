import java.util.Scanner;

public class IntPair
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 개수 입력 : ");
		int n = sc.nextInt();
		int[] data = new int[n];
		int count = 0;
		
		for(int i=0; i<n; i++)
			data[i] = sc.nextInt();
		
		sc.close();
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
				if(data[i] == data[j])
