public class Account
{
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance)
	{
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno()
  {
		return ano;
	}
	
	public String getOwner()
  {
		return owner;
	}	

	public void setOwner(String owner) 
	{
		this.owner = owner;
	}

	
	public int getBalance()
  {
		return balance;
	}

	public void setBalance(int balance) 
	{
		if(balance < 0)
		{
			System.out.println("잔고 부족 !");
			return;
		}
		this.balance = balance;
	}
}
//-------------------------------------------

import java.util.Scanner;

import pp.Account;

public class BankApplication
{
	private static Account[] accountArray = new Account[100];
			// main에서 객체생성 없이 바로 사용 가능하도록 static으로 선언 !
	 
	private static Scanner scanner = new Scanner(System.in);	
	
	public static void main(String[] args)
	{
		boolean run = true;
		while(run)
		{
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 -> ");
			
			int selectNum = scanner.nextInt();
			
			if(selectNum == 1)
			{
				createAccount();
			}
			else if(selectNum == 2)
			{
				accountList();
			}
			else if(selectNum == 3)
			{
				deposit();
			}
			else if(selectNum == 4)
			{
				withdraw();
			}
			else if(selectNum == 5)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료 !");
	}


	private static void createAccount() 
	{
		System.out.println("-----------------");
		System.out.println("계좌생성");
		System.out.println("-----------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++)
		{
			if(accountArray[i] == null)
			{
				accountArray[i] = newAccount;
				System.out.println(i+1 + "번째 계좌 생성 완료 !");
				break;
			}
		}
	}
	
	private static void accountList() 
	{
		System.out.println("-----------------");
		System.out.println("계좌목록");
		System.out.println("-----------------");
		
		for(int i=0; i<accountArray.length; i++)
		{
			Account account = accountArray[i];
			if(account != null) 
			{
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.print(account.getBalance());
				System.out.println("    ");
			}			
		}
	}
	
	private static void deposit() 
	{
		System.out.println("-----------------");
		System.out.println("예금");
		System.out.println("-----------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null)
		{
			System.out.println("해당 계좌가 없습니다 !");
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("입금 완료 !");
	}
	
	private static Account findAccount(String ano)
	{
		Account account = null;
		for(int i=0; i<accountArray.length; i++)
		{
			if(accountArray[i] != null)
			{
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano))
				{
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	private static void withdraw() 
	{
		System.out.println("-----------------");
		System.out.println("출금");
		System.out.println("-----------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account == null)
		{
			System.out.println("해당 계좌가 없습니다 !");
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금 완료 !");
	}
}
