{
	public static void main(String[] args)
	{
		int i = 128;
		
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
		{
			System.out.println("byte 타입으로 변환 불가 !");
			System.out.println("값을 다시 확인해 주세요 !");
		}
		else
		{
		byte b = (byte)i;
		System.out.println(b);
		}
	}
}