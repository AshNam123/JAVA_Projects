class Largest7 
{
	public static void large(int a ,int b,int c,int d,int e,int f,int g)
	{
		if(a>b && a>c && a>d && a>e && a>f && a>g)
		{
			System.out.println("Largest:"+a);
		}
		else if (b>c && b>d && b>e && b>f && b>g)
		{
			System.out.println("Largest:"+b);
		}
		else if (c>d && c>e && c>f && c>g )
		{
			System.out.println("Largest:"+c);
		}
		else if (d>e && d>f && d>g)
		{
			System.out.println("Largest:"+d);
		}
		else if (e>f && e>g)
		{
			System.out.println("LArgest:"+e);
		}
		else if (f>g)
		{
			System.out.println("LArgest:"+f);
		}
		else{
			System.out.println("Largest:"+g);
		}
	}
	public static void main(String[] args) 
	{
		large(10,20,30,40,50,60,70);
	}
}
