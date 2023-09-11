import java.util.Scanner;

public class PaildromStr 
{
   public static void main(String[] args) 
   {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the String");
     String word=scanner.next();
     String re="";
     int len=word.length();
     for(int i=len-1; i>=0; i--)
     {
       re=re+word.charAt(i);
     }
     if(word.equals(re))
     {
        System.out.println("GivenString is  paildrome");
     }
     else
     {
        System.out.println("GivenString is not paildrome mam" + re);
     }
   }    
}
