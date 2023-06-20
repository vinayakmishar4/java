package Pattern;

import java.util.Scanner;

public class P23 
{
   public static void main(String[] args) 
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number");
      int number = scanner.nextInt();
      for(int i=1;i<=number;i++)
      {
        int count =i;
        for(int j=1;j<=i;j++)
        {
            count=count+number-j;
            System.out.print(count+" ");
        }
        System.out.println();
      }
   } 
}
