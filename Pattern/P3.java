package Pattern;

import java.util.Scanner;

//WAP
// *
// * *
// * * *
// * * * *
// * * *
// * * 
// *
public class P3
{
    public static void main(String[] args) 
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=scanner.nextInt();
       for(int i=1;i<=n;i++)// 1 2
      {
         for(int j=1;j<i;j++)//1 2
         {
             System.out.print(" * ");
         }
         System.out.println();        
      }
      int n1=n-1;
      for(int i=n1-1; i>0; i--)
       {
         for(int j=1; j<=i; j++)
         {
           System.out.print(" * ");
         }
         System.out.println();
       }    
    }

}