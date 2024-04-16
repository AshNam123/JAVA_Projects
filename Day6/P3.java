class P3 
{
	static int a=20;
	int b=30;
	public void sheela()
	{
		int b = 10;
		System.out.println("The number of b "+b);
		System.out.println("The number b of non-static is "+this.b);
		System.out.println("The number of static var a is"+a);
	}
	public static void savita()
	{
		int b=40;
		P3 ref = new P3();
		System.out.println("The local var is "+b);
		System.out.println("The static var "+a);
		System.out.println("The nonstatic var"+ref.b);

	}
	public static void main(String[] args) 
	{
		P3 ref = new P3();
		System.out.println("The address var:"+ref);
		ref.sheela();
		savita();
	}
}
