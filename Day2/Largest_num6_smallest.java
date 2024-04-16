class Largest_num6_smallest 
{
	public static void main(String[] args) 
	{
		int a=6,b=5,c=4,d=3,e=2,f=1;
		if (a<b && a<c && a<d && a<e && a<f)
		{
			System.out.println("Smallest: "+a);
		}else if (b<c && b<d && b<e && b<f)
		{
				System.out.println("Smallest: "+b);
		}
		else if (c<d && c<e && c<f)
		{
			System.out.println("Smallest:"+c);
		}
		else if (d<e && d<f)
		{
			System.out.println("Smallest:"+d);
		}
		else if(e<f)
		{
			System.out.println("Smallest:"+e);
		}
		else
		{
			System.out.println("Smallest:"+f);
		}
	}
}
