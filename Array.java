//import java.util.Scanner;

public class Array 
{
   public static void main(String[] args) 
   {
       //Scanner sc=new Scanner(System.in);
       //int size;
       // Declare array
       int a[];
       String b[];
       //System.out.println("Size of array");
       //size=sc.nextInt();
       a=new int[3];
       a[0]=10;
       a[1]=20;
       a[2]=30;
       //a[3]=40 arrayIndexofbound
       int[] c={1,2,3};
       System.out.println("Array:-");
       for(int i=0;i<a.length;i++)
       {
          System.out.println(a[i] + " ");
       }
       System.out.println("Array:-");
       for(int i:a)
       {
         System.out.println(i + " ");
       }   
   } 
}
