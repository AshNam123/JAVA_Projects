class P1
{
	static
	{
		System.out.println("SIB super-class");
	}
}
class P2 extends P1
{
	static int i=25;
	static
	{
		System.out.println("SIB sub-class");
	}

}
class Driver4
{
	public static void main(String [] args)
	{
	         P2 ref =new P2();
			 System.out.println(ref.i);
	}
}
