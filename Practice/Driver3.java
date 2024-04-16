class shape
{
	public void display()
	{
		System.out.println("The shape");
	}
}
class rectangle extends shape
{
	public void area()
	{
		System.out.println("The area of rect");
	}
}
class cude extends shape
{
	public void area_2()
	{
		System.out.println("The cude of rect");
	}
}
class  Driver3
{
	public static void main(String[] args) 
	{
		cude ref = new cude();
		ref.area_2();
		//ref.area();
		ref.display();
		System.out.println("Hello World!");
	}
}
