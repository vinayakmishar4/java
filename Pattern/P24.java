package Pattern;

import java.util.Scanner;

public class P24
{
   public static void main(String[] args) 
   {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The number");
      int n=sc.nextInt();
      for(int i=1; i<=n; i++)
      {
        if(i%2!=0)
        {
          for(int j=1; j<=n-3; j++)
          {
            count=count+1;
            System.out.print(count+" ");
          }
        }
        else
        {
          int temp=count+1;
          for(int j=count+5;j>=temp;j--)
          {
            count=count+1;
            System.out.print(count+" ");
          }
        }
        System.out.println();
      }       
   }    
}
