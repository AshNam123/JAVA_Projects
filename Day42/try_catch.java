import java.util.Scanner;
class ChotahaiAbhiThuException extends ArithmeticException
{
    ChotahaiAbhiThuException(String s)
    {
        super(s);
    }
}
public class try_catch {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age:");
    int age = sc.nextInt();
    if(age<18)
    {
        throw new ChotahaiAbhiThuException("Abhi Nahi ho Payega");
    }
    else{
        System.out.println("You are eligible");
    }


}
}
