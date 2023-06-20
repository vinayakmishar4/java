package Pattern;

import java.util.Scanner;

public class P19
{
   public static void main(String[] args) 
   {
      int count = 0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
            count=count+1;
            System.out.print(count);
        }
        System.out.println();
      }  
   }    
}
