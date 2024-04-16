import java.util.HashSet;

public class Longest_substring {
    public static void main(String[] args){
        String str = "abcdab";
        System.out.println(longest(str));

    }
    public static String longest(String str){
            HashSet<Character> set = new HashSet<>();
            String longestOverall="";
            String longesttillnow="";
            for (int i = 0;i<str.length();i++){
                char c = str.charAt(i);
                if(set.contains(c))
                {
                   longesttillnow="";
                   set.clear();
                }
                set.add(c);
                longesttillnow+=c;
                if(longesttillnow.length()>longestOverall.length()){
                    longestOverall = longesttillnow;
                }
            }

            return longestOverall;

    }
}
