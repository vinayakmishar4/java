package Pattern;

import java.util.Scanner;

public class P5 
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a Number");
      int number=scanner.nextInt();
      for (int i=1; i<=number; i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print(" ");
          }
          for(int k=number; k>=i;k--)
          {
             System.out.print("*");
          }
          System.out.println();
       } 
   }   
}
