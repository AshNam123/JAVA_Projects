//create bank
class Axis_bank
{
	long acc_no;
	String accholder_name;
	private double balance;
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}

//create saving Account
class SavingAcc extends Axis_bank
{
	SavingAcc(long acc_no,String accholder_name)
	{
		this.acc_no = acc_no;
		this.accholder_name = accholder_name;
	}

}


class  Customer
{
	public static void main(String[] args) 
	{
		//create objects
		SavingAcc ref = new SavingAcc(1234567890,"Ashwin");
		SavingAcc ref1 = new SavingAcc(1234567,"Arjun");
		SavingAcc ref2 = new SavingAcc(12345678,"Akhil");
		display(ref,23456);
		display(ref1,234345);
		display(ref2,345456);
	}
	public static void display(SavingAcc ref,double bal)
	{
		System.out.println("The Account no :+"+ref.acc_no);
		System.out.println("The Account holder name :"+ref.accholder_name);
		ref.setBalance(bal);
		System.out.println("The Account balance :"+ref.getBalance());
	}
}
