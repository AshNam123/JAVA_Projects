clas
s AT
{
	double money=100000;//state
	public void withdraw()//behaviour
	{
		System.out.println("Machha you can withdraw");
	}

}






//Driver class
class  Axis
{
	public static void main(String[] args) 
	{
		ATM ref = new ATM();
		//System.out.println("Hello World!");
		System.out.println("Total amount in ATM:"+ref.money);
		ref.withdraw();
	}
}
