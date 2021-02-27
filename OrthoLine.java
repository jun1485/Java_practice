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
