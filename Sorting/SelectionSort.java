package Sorting;

import java.util.Scanner;

public class SelectionSort 
{
   public static void main(String[] args)
   {
       int min,temp=0;   
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the size of the array");
     int size=scanner.nextInt();
     int []arr=new int[size];
     System.out.println("Enter the Element");
     for(int i=0;i<size;i++)
     {
        arr[i]=scanner.nextInt();
     }
     System.out.println("Array:- ");
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     }
     System.out.println("Sorrted Array: ");
     for(int i=0;i<arr.length;i++)
     {
         min=i;
        for(int j=i+1;j<arr.length;j++)
        {
           if(arr[j]<arr[min])
           {
             min=j;
           } 
        }
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
     }
     for(int i=0;i<arr.length;i++)
     {
       System.out.println(arr[i]);
     }
   }  
}
