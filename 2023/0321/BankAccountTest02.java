class BankAccount
{
	private double balance;					//잔액 표시하는 변수
	public BankAccount(int balance){
		this.balance = balance;
	}
	public void deposit(double amount){		//저금하는 메소드
		balance += amount;
	}
	public void withdraw(double amount){		//인출하는 메소드
		balance -= amount;
		if (balance <0)
		{
			System.out.println("잔액이 부족합니다.");
			balance +=amount;
		}
	}
	public double getBalance(){				//현재 잔액을 반환하는 메소드
		return balance;
	}
	public void printBalance(){
		System.out.println("잔액 : "+balance);
	}
	public void addInterest(){
		balance += balance*0.075;
	}

}
class BankAccountTest02
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount(100);
		BankAccount a2 = new BankAccount(50);
		a1.withdraw(60);
		a2.withdraw(30);
		System.out.println("a1 = "+a1.getBalance());
		System.out.println("a2 = "+a2.getBalance());
	}
}
