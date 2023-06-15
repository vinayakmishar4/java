package Pattern;

import java.util.Scanner;

public class P8 
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number");
      int number=scanner.nextInt();
      for(int i=0; i<=number; i++)
      {
        for(int j=number; j>=i; j--)
        {
            System.out.print(" ");
        }
        for(int k=1; k<=i;k++)
        {
           System.out.print("*");
        }
        for(int l=2; l<=i; l++)
        {
            System.out.print("*");
        }
        System.out.println();
      } 
   }    
}
