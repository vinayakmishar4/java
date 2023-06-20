package Pattern;

import java.util.Scanner;

public class P20
{
   public static void main(String[] args) 
   {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the number");
      int num=scanner.nextInt();
      System.out.println("Pattern");
      for(int i=1;i<=num;i++)// 1 2
      {
         for(int j=i;j>=1;j--)//1 2
         {
             System.out.print(j + " ");
         }
         System.out.println();        
      } 
   }    
}
