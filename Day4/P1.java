class P1 
{
	public static void Add_No(int num)
	{
		if (num<=1500)
		{
			System.out.println(num);
			Add_No(num+1);
		}
	}
	public static void main(String[] args) 
	{
	       Add_No(1);
	}
}
