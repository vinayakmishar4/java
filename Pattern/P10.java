package Pattern;

import java.util.Scanner;

public class P10 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter The Number");
         int number=sc.nextInt();
         for(int i=1;i<=number;i++)// 1 2
         {
           for(int j=1;j<=i;j++)//1 2
           {
             if(i>=2 && j<=i-1)
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
