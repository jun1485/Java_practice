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
