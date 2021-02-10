import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile
{
	static String[] name = new String[1000];
	static int[] number = new int[1000];
	static int n = 0;
	
	public static void main(String[] args)
	{
		try 
		{
			Scanner sc = new Scanner(new File("input.txt"));
			while(sc.hasNext())
			{
				name[n] = sc.next();
				number[n] = sc.nextInt();
				n++;
			}
			sc.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("No File");
			System.exit(1);
		}
