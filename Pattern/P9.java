package Pattern;

import java.util.Scanner;

public class P9 
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number");
      int number=scanner.nextInt();// 5
      for(int i=1; i<=number; i++)// 1 // 2 // 3 // 4 // 5 //
      {
        for(int j=1; j<=i; j++)// 0 // 1 // 1 2 // 1 2 3 // 1 2 3 4 //
        {
            System.out.print(" ");
        }
        for(int k=number; k>=i;k--)// 5 4 3 2 1 // 5 4 3 2 // 5 4 3 // 5 4 // 5
        {
           System.out.print("*");
        }
        for(int l=number-1; l>=i; l--) // 4 3 2 1 //  4 3 2 // 4 3 // 4 // 0
        {
            System.out.print("*");
        }
        System.out.println();
      } 
   }    
}
