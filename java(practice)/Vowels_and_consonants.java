public class Vowels_and_consonants {
     public static void main(String[] args){
        String str = "Sandeep";
        countVowels(str);
     }
     public static void countVowels(String str){
        int vowels = 0;
        int consants = 0;
        for (int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                   ++vowels;
            }else{
                ++consants;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consants:"+consants);
    }
    public static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ;

     }
    }
