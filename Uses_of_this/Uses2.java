
public class Uses2
{
   void Display()
   {
    System.out.println("Uses2");
   }
   void show()
   {
      this.Display();
   }
   public static void main(String[] args)
   {
       Uses2 obj = new Uses2();
       obj.show();
   }
}