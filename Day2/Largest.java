class Largest 
{
	public static void largest(int a,int b,int c)
	{
		System.out.println(a>b?a>c?a:c:b>c?b:c);
	}
	public static void main(String[] args) 
	{
		largest(20,60,-250);
	}
}
