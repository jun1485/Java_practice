public class Sorting 
{
	public static void main(String[] args)
	{
		int[] array = {1, 3, 2, 8, 6, 5, 7};

		sort(array);
		
		for(int k=0; k<array.length; k++)
		{
			System.out.print(array[k] + " ");
		}
	}
	public static void sort(int[] arr)
	{
		for(int i=0; i<arr.length-2; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
