class Vowels_consonants 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u' )
		{
            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
				System.out.println("Capital Vowels");
            }else
			{
			    System.out.println("Small Vowels");
			}
		}
		else
		{
			if ((ch>='b' && ch<='z') || (ch>='B' && ch<='Z'))
			{
				if (ch>='B' && ch<='Z')
				{
					System.out.println("Captial Consonants");
				}
				else
				{
					System.out.println("Small Consonants");
				}
			}
		}
	}
}
