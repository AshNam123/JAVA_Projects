import java.util.HashSet;
import java.util.Set;
class Remove_duplicates 
{
	public static String duplicates(String str)
	{
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for(int i=0;i<str.length;i++)
		{
			Character c = str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}
	public static void main(String[] args) 
	{
		String str = "Sandeep";
		System.out.println(duplicates(str));
	}
}
