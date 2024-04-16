class Animal
{
	String name;
	void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal
{
	Dog(String name)
	{
		this.name = name;
	}
}
class  Driver2
{
	public static void main(String[] args) 
	{
		Dog ref = new Dog("Neo");
		System.out.println(ref.name);
		ref.eat();
	}
}
