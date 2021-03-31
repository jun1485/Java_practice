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

--------------------------------------

	// DurationEvent(class)
public class DurationEvent extends Event 
{
	//public String title;	Event에서 상속받음
	public MyDate begin;
	public MyDate date;

	public DurationEvent(String title, MyDate begin, MyDate e)
	{
		super(title);
		this.begin = begin;
		date = e;
	}
}

--------------------------------------

	// OneDayEvent(class)
public class OneDayEvent extends Event
{
	//public String title;	Event에서 상속받음
	public MyDate date;
	
	public OneDayEvent(String title, MyDate date)
	{
		super(title);
		this.date = date;
	}

	public String toString()
	{ 
		return title + ", " + date.toString();
	}
}

--------------------------------------

	// Scheduler(class(main))
import java.util.Scanner;

public class Scheduler
{
	private int capacity = 10;
	public Event[] events = new Event[capacity];
	public int n = 0;	//n은 현재 배열에 저장되어 있는 객체의 수
	private Scanner kb;
	
	public void processCommand()
	{
		kb = new Scanner(System.in);
		while(true)
		{
			System.out.print("$ :");
			String command = kb.next();
			if(command.equals("addEvent")) 
			{
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday"))
					handAddOneDayEvent();
				else if(type.equalsIgnoreCase("duration"))
					handAddDurationEvent();
				else if(type.equalsIgnoreCase("deadline"))
					handAddDeadlineEvent();
			}
			else if(command.equals("list"))
			{
				
			}
			else if(command.equals("exit"))
			{
				break;
			}
		}
		kb.close();
	}
	private void handAddDeadlineEvent() 
	{
		
	}

	private void handAddDurationEvent()
	{
		
	}
	private void handAddOneDayEvent() 
	{
		System.out.print("  when : ");
		String dateString = kb.next();
		System.out.print("  title : ");
		String titleString = kb.next();

		MyDate date = parseDateString(dateString);
		
		OneDayEvent ODev = new OneDayEvent(titleString, date);
		addEvent(ODev);
	}

	private void addEvent(OneDayEvent ev)
	{
		if(n >= capacity)
			reallocate();
			events[n++] = ev;
	}
