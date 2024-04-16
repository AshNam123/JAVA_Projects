class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("I can bark");
	}
	public void run()
	{
		System.out.println("I can run");
	}
}
class  Driver1
{
	public static void main(String[] args) 
	{
		Dog ref=new Dog();
		ref.eat();
		ref.bark();
		ref.run();
		System.out.println("Hello World!");
	}
}
