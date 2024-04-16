public class try_Throws {
    int i;
    double sal;
    try_Throws(int i,double sal)
    {
         this.i = i;
         this.sal = sal;
    }
    public String toString()
    {
         return i+" "+sal;    
    }
    public static void main(String[] args)
    {
        try
        {
             demo();
        }
        catch(CloneNotSupportedException ae)
        {
           System.out.println();
        }
    }
    
    public static void demo() throws CloneNotSupportedException
    {
        try_Throws t1 = new try_Throws(23, 45678);
        Object t2 = t1.clone();
        System.out.println(t2);
    }
    
}

