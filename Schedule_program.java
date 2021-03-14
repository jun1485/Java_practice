// MyDate(class)
public class MyDate 	// 이 프로그램의 핵심은 하나의 공통상위클래스인 Event클래스 타입의 배열 하나로 여러가지 객체들을 묶을 수 있음.
{	
	public int year;
	public int month;
	public int day;
	
	public MyDate(int y, int m, int d)
	{
		year = y;
		month = m;
		day = d;
	}

	public String toString()
	{
		return year + "/" + month + "/" + day;
	}
}

--------------------------------------

	// Event(class)
public class Event 
{
	public String title;

	public Event(String title)
	{
		this.title = title;
	}
}

--------------------------------------

	// DeadlineEvent(class)
public class DeadlineEvent extends Event
{
	//public String title;	Event에서 상속받음
	public MyDate deadline;
	
	public DeadlineEvent(String title, MyDate date)
	{
		super(title);
		this.deadline = date;
	}

	public String toString()
	{ 
		return title + ", " + deadline.toString();
	}
}