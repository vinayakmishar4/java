package String_Methods;

public class Isempty
{
   public static void main(String[] args)
   {
    String name="abc";
    String email="abc@gamil.com";
    String password="abc24";
    System.out.println(name.isEmpty());
    System.out.println(email.isEmpty());
    System.out.println(password.isEmpty());
    if(name.isEmpty()==true && email.isEmpty()==true && password.isEmpty()==true)
    {
      System.out.println("Details are Empty");
    }
   }    
}
