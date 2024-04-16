class Reverse_String
{

	public static void main(String[] args) 
	{
		String str = "Hey there how are you";
		String Splitarray[] = str.split(" ");
		for (int i=Splitarray.length-1;i>=0 ;i-- )
		{
			System.out.println(Splitarray[i]);
		}
	}
}
