public class HankookTire implements Tire 
{

	@Override
	public void roll() 
	{
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
//---------------------------------------------------

public class KumhoTire implements Tire
{
	@Override
	public void roll() 
	{
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}

//---------------------------------------------------

public interface Tire 
{
	public void roll();
}
//---------------------------------------------------
