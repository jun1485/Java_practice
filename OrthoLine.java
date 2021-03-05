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
		u = p;
		v = q;
		if(p.x > q.x || p.x == q.x && p.y > q.y)
			swap();		// 수직선의 경우 u가 y좌표가 더 작은 쪽, 수평선의 경우 u가 x좌표가 더 작은 점이 될 수 있도록
	}

	public void swap()
	{
		MyPoint temp = u;
		u = v;
		v = temp;
	}

	
	public OrthoLine(int x1, int y1, int x2, int y2)
	{
		u = new MyPoint(x1, y1);
		v = new MyPoint(x2, y2);
	}
	
	public boolean isVertical()
	{
		return u.x == v.x;
	}
		
	public boolean intersects(OrthoLine other)
	{
		if(isVertical() && !other.isVertical())
			return (other.u.x < u.x && other.v.x > u.x && u.y < other.u.y && v.y > other.u.y);
		else if(!isVertical() && other.isVertical())
			return (other.u.y < u.y && other.v.y > u.y && u.x < other.u.x && v.x > other.u.x);
		else return false;
	}
