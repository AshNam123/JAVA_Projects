class Dhiru_bhai
{
	String company="Relliance" ;
	public void Think_st()
	{
		System.out.println("Thinking is Unique");
	}
}
class Mukesh_ambani extends Dhiru_bhai
{
   
}
class  India
{
	
	public static void main(String[] args) 
	{
		Dhiru_bhai ref = new Dhiru_bhai();
        Mukesh_ambani ref1 = new Mukesh_ambani();
		System.out.println("Compaany:"+ref1.company);
		ref1.Think_st();
	}
}
