class Emp_1
{
	int Id;
	String name;
	private double sal;

	public Emp_1(int Id,String name,double sal)
	{
		this.Id = Id;
		this.name = name;
		this.sal = sal;
	}
	public int getId()
	{
		return Id;
	}
	public String getName()
	{
		return name;
	}
	public double getSal()
	{
		return sal;
	}

}
class Company_1 
{
	public static void display(Emp_1 emp)
	{
		    System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSal());
	}
	public static void main(String[] args) 
	{
		Emp_1 ref1 = new Emp_1(20,"Ashwin",40000);
		Emp_1 ref2 = new Emp_1(30,"Arjun",50000);
		Emp_1 ref3 = new Emp_1(40,"Akhil",60000);
		display(ref1);
		display(ref2);
		display(ref3);
	}
}
