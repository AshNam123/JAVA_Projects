import java.util.Scanner;
class Calculator 
{
	public  void Add(int a ,int b)
	{
		System.out.println("The Answer is "+(a+b));
	}
	public int sub(int a,int b)
	{
		//int res = a-b;
		return a-b
			;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		Calculator  cal = new Calculator();
		System.out.println("Enter num1:");
			int a = s1.nextInt();
		System.out.println("Enter num2:");
			int b = s1.nextInt();
		cal.Add(a,b);
		int res = cal.sub(a,b);
		System.out.println("The substraction is:"+res);
	}
}