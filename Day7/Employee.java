class Employee 
{
	int Id;
	String name;
	double sal;
	Employee()
	{
	}
	Employee(int Id)
	{
		this.Id = Id;
	}
	Employee(int Id,String name)
	{
		this.Id = Id;
		this.name = name;
			
	}
	Employee(int Id,String name,double sal)
	{
		this.Id = Id;
		this.name = name;
		this.sal = sal;
			
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(10,"Ashwin");
		Employee emp3 = new Employee(10,"Neo",8600);
		System.out.println("Id:"+emp.Id);
		System.out.println("Name:"+emp.name);
		System.out.println("Salary:"+emp.sal);
		System.out.println("==================================");
		System.out.println("Id:"+emp1.Id);
		System.out.println("Name:"+emp1.name);
		System.out.println("Salary:"+emp1.sal);
		System.out.println("==================================");
        System.out.println("Id:"+emp2.Id);
		System.out.println("Name:"+emp2.name);
		System.out.println("Salary:"+emp2.sal);
		System.out.println("==================================");
		System.out.println("Id:"+emp3.Id);
		System.out.println("Name:"+emp3.name);
		System.out.println("Salary:"+emp3.sal);
		System.out.println("==================================");


	}
}
