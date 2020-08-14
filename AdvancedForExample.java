public class java

{
	public static void main(String[] args)
	{
		int[] scores = { 81, 80, 83, 90, 86 };

		int sum = 0;
		for (int score : scores)
		{
			sum += score;
		}
		System.out.println("총 합 = " + sum);

		double avg = (double) sum / scores.length;

		System.out.println("평균 = " + avg);
	}
}
