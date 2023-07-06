package Sorting;

import java.util.Scanner;

public class Insertion 
{
   public static void main(String[] args) 
   {
       int temp,j; 
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter The Size of Array ");
       int size=scanner.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter The Elements of Array ");
       for(int i=0;i<size;i++)
       {
           arr[i]=scanner.nextInt();
       } 
       System.out.println("The Array is ");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]+" ");
       }
       System.out.println("The Sorted Array is ");
       for(int i=0;i<arr.length;i++)
       {
          temp=arr[i];
          j=i;
          while(j>0 && arr[j-1]>temp)
          {
              arr[j]=arr[j-1];
              j=j-1;
          }
          arr[j]=temp; 
       }
       for(int i=0;i<arr.length;i++)
       {
         System.out.println(arr[i]);
       }  
   }    
}
