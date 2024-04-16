public class try_cat_finally {

    
    public static void main(String [] args)
    {
        try{
            System.out.println(3/0);
        }
        catch(Exception e)
        {
            System.out.println("Caught the exception");
        }
        finally{
            System.out.println("Bye bye");
        }
    }
}
