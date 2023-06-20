package Pattern;

import java.util.Scanner;

public class P11 
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number");
      int number=scanner.nextInt();
      for (int i=1; i<=number; i++)
       {
          for(int j=number-1;j>=i;j--)
          {
             System.out.print(" ");
          }
          for(int k=1; k<=i;k++)
          {
             if(i>=2 && k>1)
             {
                System.out.print(" ");
             }
             else
             {
                System.out.print("*");
             }
          }
          System.out.println();  
   }    
 }
}
