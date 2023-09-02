package String_Methods;
public class Length
{
   public static void main(String[] args) 
   {
      String name="abc";
      String email="abc@gamil.com";
      String password="abc24";
      System.out.println(name.length());
      System.out.println(email.length());
      System.out.println(password.length());
      int a=name.length();
      int b=email.length();
      int c=password.length();
      if(a==0 && b==0 && c==0)
      {
        System.out.println("Details are Empty");
      }
   }
}