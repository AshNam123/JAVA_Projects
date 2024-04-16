import java.util.Scanner;

public class occurence_string {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= sc.nextLine();
        int initialLength=str.length();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Character to find the occurence");
        String str1 = sc1.next();
        str = str.replace(str1,"");
        int finallength = str.length();
        System.out.println("Total Number of Occurence of Character:"+str1+" "+(initialLength-finallength));
     }
    
}
