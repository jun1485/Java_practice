package quadrangle;

public class MyPoint
{
	public int x;
	public int y;
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

----------------------------------------

package quadrangle;

public class OrthoLine
{
	public MyPoint u;
	public MyPoint v;
	
	public OrthoLine(MyPoint p, MyPoint q) 
	{
