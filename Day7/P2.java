class P2 
{
	int id;
	String name;
	float percentage;
    P2(int id,String name,float percentage)
	{
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		
	}
	public static void main(String[] args) 
	{
		P2 ref = new P2(12,"Ashwin",96.0f);
		P2 ref1 = new P2(13,"Neo",95.0f**);
		System.out.println("Tha name is:"+ref.name);
		System.out.println("Tha name is:"+ref.id);
		System.out.println("Tha name is:"+ref.percentage);
		System.out.println("===============================");
		System.out.println("Tha name is:"+ref1.name);
		System.out.println("Tha name is:"+ref1.id);
		System.out.println("Tha name is:"+ref1.percentage);
	}
}
