import java.util.Scanner;

public class Sort_names_array {
    public static void main(String[] args){
    int n;
    String temp;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of names to be sorted");
    n = sc.nextInt(); 
    String names[] = new String[n];
    Scanner sc1 = new Scanner(System.in);
    for (int i=0;i<n;i++){
        names[i] = sc1.nextLine();
    }
    for(int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
            if (names[i].compareTo(names[j])>0){
            temp = names[i];
            names[i] = names[j];
            names[j] = temp;
            } 
        }
    }
    for(String name:names){
        System.out.println("Sorted Arrays");
        System.out.println(name);
    }
}
}
