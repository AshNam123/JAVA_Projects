class Employee
{
	public int id;
	public String name;
	private double amount;
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount =amount;
	}
	public void set_disp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public String name()
	{
		return name;
	}
	public int  id()
	{
		return id;
	}

}
class Company
{
	public static void main(String[] args)
	{
	Employee ref = new Employee();
	Employee ref1 = new Employee();
	Employee ref2 = new Employee();
	ref.setAmount(20000);
	ref.set_disp(20,"Ashwin");
	display(ref);
	ref1.setAmount(30000);
	ref1.set_disp(30,"Akhil");
	display(ref1);
	ref2.setAmount(40000);
	ref2.set_disp(40,"Arjun");
	display(ref2);
	}
	public static void display(Employee emp)
	{
		System.out.println("The id is"+emp.id());
	    System.out.println("The name is :"+emp.name());
	    System.out.println("The sal is"+emp.getAmount());
	}
}