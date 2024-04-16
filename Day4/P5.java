class P5 
{
	static String name;
	static char c;
	public static void Qspider(char a)
	{
		System.out.println("QspB");
		System.out.println(a);
		System.out.println(name);
		System.out.println(c);
		name="Sheela";
		c='a';
		Jspider();
		System.out.println("QspE");
	}
	public static void Jspider()
	{
		System.out.println("JspB");
		int a=10;
		System.out.println(a);
		System.out.println(name);
		System.out.println(c);
		name="a";
		c='c';
		System.out.println("JspE");
	}
	static
	{
		System.out.println("STB-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("MB");
		boolean b=false;
		short a=6;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
		Qspider('d');
		System.out.println("ME");
	}
	static 
	{
		System.out.println("STB-2");
		Jspider();
	}
}
