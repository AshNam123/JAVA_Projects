class Calculator
{
	public static void add(int a,int b,int c,int d)
	{
		int res = a+b+c+d;
		System.out.println(res);
	}
	public static void sub(int a,int b,int c,int d,int e)
	{
		int res = a-b-c-d-e;
		System.out.println(res);
	}
	public static void mul(int a,int b,int c,int d,int e,int f)
	{
		int res = a*b*c*d*e*f;
		System.out.println(res);
	}
    public static void div(int a,int b)
	{
		int res = a/b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		add(1,2,3,4);
		sub(1,2,3,4,5);
		mul(1,2,3,4,5,6);
		div(4,2);
	}
}
