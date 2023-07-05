package GFG;

import java.util.Scanner;

public class Pattern 
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a Number");
      int number=scanner.nextInt();
      int temp=number;
      int count=number;
      while(number>0)
      {
         count=temp;
         while(count>0)
         {
            for(int i=0; i<number; i++)
            {
               System.out.print(count+" ");
            }
            count--;
         }
         System.out.print("$");
         number--;
      }
   }   
}
