//create a vehicle class and car
class Vehicle
{
	//vehivle no,brand,color
	int vec_no;
	String vec_brand;
	String vec_color;

}
//then connect them
class car extends Vehicle
{
	car(int vec_no,String vec_brand,String vec_color)
	{
		this.vec_no = vec_no;
		this.vec_brand = vec_brand;
		this.vec_color = vec_color;
	}
}

class Trans 
{
	public static void main(String[] args) 
	{
		//create car class object
		car ref = new car(1298,"HYundai","Yellow");
		car ref2 = new car(1453,"Bugati","Red");
		display(ref);
		display(ref2);
		
	}
	public static void display(car ref)
	{
		System.out.println("The car no:"+ref.vec_no);
		System.out.println("The car brand:"+ref.vec_brand);
		System.out.println("The car color:"+ref.vec_color);
		System.out.println("==================================");
	}
}
