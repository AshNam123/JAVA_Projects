class Emp_3
{
	int id;
	String name;
	private double sal;

	public void setMethod(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public double getMethod()
	{
		return sal;
	}
	//to use set
	public void setSal(double sal)
	{
		this.sal =sal;
	}
}
class Company_3 
{
	public static void main(String[] args) 
	{
		Emp_3 ref = new Emp_3();
		ref.setMethod(12,"Ashwin",35000);
		System.out.println(ref.id);
		System.out.println(ref.name);
		ref.setSal(200000);
		System.out.println(ref.getMethod());
	}
}
