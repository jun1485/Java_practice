public interface RemoteControl
{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();		// public abstract 키워드가 생략됨 !(컴파일시 자동으로 붙여줌)
	void turnOff();	
	void setVolme(int volume);
	
	default void setMute(boolean mute)	// default 명시 안할 시 public으로 컴파일시 자동 명시됨 !
	{
  
  }
