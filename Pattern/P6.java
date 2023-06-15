package Pattern;

import java.util.Scanner;

public class P6 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        for (int i=1; i<=number; i++)
       {
          for(int j=number-1;j>=i;j--)
          {
             System.out.print(" ");
          }
          for(int k=1; k<=i;k++)
          {
             System.out.print("*");
          }
          System.out.println();
       }
       int number1=number-1;
       for (int i=1; i<=number; i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print(" ");
          }
          for(int k=number1; k>=i;k--)
          {
             System.out.print("*");
          }
          System.out.println();
       }  
    }
}
