public class Mumbling {
    
    public String accum(String s)
    {
        String result = " ";
        char[] Characters = s.toLowerCase().toCharArray();
        int counter = 1;
        for(int i=0;i<s.length();i++)
        {
            char Character = Characters[i];
            if(i!=0)
            {
                result+="-";
            }
            result += (""+Character).toUpperCase();
            for(int reps = 1; reps<counter ; reps++)
            {
                result+=Character;
            }
            counter++;
        }
        return result;
    }
}
