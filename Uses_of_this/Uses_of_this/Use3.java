package Uses_of_this;

public class Use3
{
   Use3()
   {
      System.out.println("Use3");
   }
   Use3(String s)
   {
      this();
      System.out.println("Use31");
   }
   public static void main(String[] args)
   {
       Use3 u = new Use3("s");
   }  
}
