public class Uses4
{
   void m1(Uses4 td)
   {
      System.out.println("1");
   }
   void m2()
   {
       m1(this);
   }
   public static void main(String[] args)
   {
      Uses4 td = new Uses4();
      td.m2();
   }   
}
