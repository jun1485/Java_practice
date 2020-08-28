public class Account
{
	private int balance;
	public static int MIN_BALANCE = 0;
	public static int MAX_BALANCE = 1000000;
	
	int getBalance()
	{
		return balance;
	}
	
	void setBalance(int balance)
	{
		if(balance < MIN_BALANCE) return;
		else if(balance > MAX_BALANCE) return;
		else this.balance = balance;
	}
}
//---------------------------------------

public class BankExample
{
	public static void main(String[] args)
	{
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(1100000);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(111111);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}
