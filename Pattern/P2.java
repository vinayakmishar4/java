package Pattern;
import java.util.Scanner;
// WAP pattern
// * * * *
// * * *
// * * 
// * 
public class P2 
{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number ");
       int n=sc.nextInt();
       for(int i=n-1; i>0; i--)
       {
         for(int j=1; j<=i; j++)
         {
           System.out.print("*");
         }
         System.out.println();
       }
   }    
}
