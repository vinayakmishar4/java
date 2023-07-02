package Sorting;

import java.util.Scanner;

// Sort an array using Bubble Sorting algorithm
public class BubleeSort 
{ 
    public static void main(String[] args) 
    {
       int temp;
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
           int flag=0;
          for(int j=0;j<arr.length-1;j++)
          {
              if(arr[j]>arr[j+1])
              {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  flag=1;
              } 
          }
          if(flag==0)
          {
             break;
          }
       }
       for(int i=0;i<arr.length;i++)
       {
            5 System.out.println(arr[i]+" ");
       } 
    }
}
