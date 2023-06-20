package Pattern;

import java.util.Scanner;

public class P13
{
   public static void main(String[] args) 
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number");
      int number=scanner.nextInt();
      for(int i=number; i>=1; i--)
      {
        for(int j=number; j>=i; j--)
        {
            System.out.print(" ");
        }
        for(int k=1; k<(i*2);k++)
        {
           if(k>1 && k<(i*2)-1)
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
