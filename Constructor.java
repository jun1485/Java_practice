public class Mypoint
{
	public int x;
	public int y;
	
	public Mypoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
}
----------------------------------------

public class MyRectangle
{
	public Mypoint lu;
	public int width;
	public int height;
	
	public MyRectangle(int x, int y, int w, int h)
	{
		lu = new Mypoint(x, y);
		width = w;
		height = h;
	}
	
	public MyRectangle(Mypoint p, int y, int w, int h)
	{
		lu = new Mypoint(x, y);
		width = w;
		height = h;
	}
	
	public int calcArea()
	{
		return width * height;
	}
	
	public String toString()
	{
		return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;
	}
	
}

----------------------------------------

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Constructor
{
	
	static MyRectangle[] rects = new MyRectangle [100];
	static int n = 0;
	
	public static void main(String[] args)
	{
		try 
		{
			Scanner sc = new Scanner(new File("data.txt"));
			while(sc.hasNext())
				rects[n++] = new MyRectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		} 

		catch (FileNotFoundException e) 
		{
			System.out.println("No data file");
			System.exit(1);
		}
	}
	
	private static void bubblesSort()
	{
		for(int i=n-1; i>n; i--)
		{
			for(int j=0; j<i; j++)
			{
