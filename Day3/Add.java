class Add 
{
	public static int add_1(int a ,int b)
	{
	   int res = a+b;
	   return res;
	}
	public static int add_2(int a ,int b,int c)
	{
	   int res = a+b+c;
	   return res;
	}
	public static int add_3(int a ,int b,int c,int d)
	{
	   int res = a+b+c+d;
	   return res;
	}
	public static int add_4(int a ,int b,int c,int d,int e)
	{
	   int res = a+b+c+d+e;
	   return res;
	}
	public static int add_5(int a ,int b,int c,int d,int e,int f)
	{
	   int res = a+b+c+d+e+f;
	   return res;
	}
	public static int add_6(int a ,int b,int c,int d,int e,int f,int g)
	{
	   int res = a+b+c+d+e+f+g;
	   return res;
	}
	public static void main(String[] args) 
	{
		int res_1 = add_1(1,2);
		int res_2 = add_2(1,2,3);
		int res_3 = add_3(1,2,3,4);
		int res_4 = add_4(1,2,3,4,5);
		int res_5 = add_5(1,2,3,4,5,6);
		int res_6 = add_6(1,2,3,4,5,6,7);
		System.out.println("Addition_1:" +res_1);
		System.out.println("Addition_2:" +res_2);
		System.out.println("Addition_3:" +res_3);
		System.out.println("Addition_4:" +res_4);
		System.out.println("Addition_5:" +res_5);
		System.out.println("Addition_6:" +res_6);
	}
}
