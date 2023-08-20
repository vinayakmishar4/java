public class try_Catch
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}