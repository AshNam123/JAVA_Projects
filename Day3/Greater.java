class Greater 
{
	public static int large_2(int a,int b)
	{
		if(a>b){
			return a;
		}
		else {
			return b;
		}
	}
	public static int large_3(int a, int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static int large_4(int a,int b,int c,int d)
	{
		if(a>b && a>c && a>d)
		{
			return a;
		}
		else if(b>c && b>d)
		{
			return b;
		}
		else if (c>d)
		{
			return c;
		}
		else
		{
			return d;
		}
	}
	public static int large_5(int a,int b,int c,int d,int e)
	{
		if(a>b && a>c && a>d && a>e)
		{
			return a;
		}
		else if(b>c && b>d && b>e)
		{
			return b;
		}
		else if (c>d && c>e)
		{
			return c;
		}
		else if (d>e)
		{
			return d;
		}
		else
		{
			return e;
		}
	}
	public static int large_6(int a,int b,int c,int d,int e,int f)
	{
		if(a>b && a>c && a>d && a>e && a>f)
		{
			return a;
		}
		else if(b>c && b>d && b>e && b>f)
		{
			return b;
		}
		else if (c>d && c>e && c>f)
		{
			return c;
		}
		else if (d>e && d>f)
		{
			return d;
		}
		else if (e>f)
		{
			return e;
		}
		else
		{
			return f;
		}
	}
	public static void main(String[] args) 
	{
		int res_1 = large_2(1,2);
		int res_2 = large_3(1,2,3);
		int res_3 = large_4(1,2,3,4);
		int res_4 = large_5(1,2,3,4,5);
		System.out.println("Largest NUMber:"+res_1);
		System.out.println("Largest NUMber:"+res_2);
		System.out.println("Largest NUMber:"+res_3);
		System.out.println("Largest NUMber:"+res_4);
	}
}
