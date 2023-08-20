public class Finall
{
   public static void main(String[] args)
   {
      try
      {
         int i = 10/0;
         System.out.println(i);
         int a=10+20;
         System.out.println(a);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      finally
      {
         System.out.println("I am exuted");
      } 
   }    
}
