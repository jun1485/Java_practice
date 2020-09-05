public interface RemoteControl
{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();		// public abstract 키워드가 생략됨 !(컴파일시 자동으로 붙여줌)
	void turnOff();	
	void setVolme(int volume);
	
	default void setMute(boolean mute)	// default 명시 안할 시 public으로 컴파일시 자동 명시됨 !
	{
		if(mute)
		{
			System.out.println("무음 처리합니다!");
		}
		else
		{
			System.out.println("무음 해제합니다!");
		}
	}
	static void changeBattery()		//접근제한자 생략 시 default로 public으로 자동 명시됨 !
	{
		System.out.println("건전지를 교환합니다!");	
	}
}
