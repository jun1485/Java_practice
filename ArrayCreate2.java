public class java
{
	public static void main(String[] args)
	{
		int[] scores = {};
		scores = new int[] {83, 90, 86};
		
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		System.out.println("총 합 : " + sum);
		
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
	}
}
