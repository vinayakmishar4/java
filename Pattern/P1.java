// WAP
// *
// * *
// * * *
package Pattern;

import java.util.Scanner;

public class P1 
{
   public static void main(String[] args) 
   {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the number");
      int num=scanner.nextInt();
      System.out.println("Pattern");
      for(int i=1;i<=num;i++)
      {
         for(int j=0;j<i;j++)
         {
             System.out.print(" * ");
         }
         System.out.println();        
      } 
   }    
}
