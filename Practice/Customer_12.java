class Bank
{
	String Accno;
	String AccName;
	private double  Balance;
	public double getBal()
	{
		return Balance;
	}
	public void setBal( double Balance)
	{
		this.Balance = Balance;
	}

}
class Saving extends Bank
{
	Saving(String Accno,String AccName,double Balance)
	{
	      this.Accno = Accno;
		  this.AccName = AccName;
		  //this.Balance = Balance;
	}
}
class Customer_12 
{
	public static void main(String[] args) 
	{
		Saving ref = new Saving("As12345","Ashwin",2354);
		System.out.println(ref.Accno);
		System.out.println(ref.AccName);
		ref.setBal(20000);
		System.out.println(ref.getBal());
	}
}
