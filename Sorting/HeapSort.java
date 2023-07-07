package Sorting;

import java.util.Scanner;

public class HeapSort 
{
    static void sort(int arr[])
    {
         int len = arr.length;
         for(int i=len/2-1;i>=0;i--)
         {
            heapify(arr,len,i);
         }
         for(int i=len-1;i>=0;i--)
         {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
         }
    }
    static void heapify(int arr[],int n,int i)
    {
         int largest = i;
         int l = 2*i+1;
         int r = 2*i+2;
         if(l<n && arr[l]>arr[largest])
         {
             largest = l;
         }
         if(r<n && arr[r]>arr[largest])
         {
             largest = r;
         }
         if(largest!=i)
         {
             int temp = arr[i];
             arr[i] = arr[largest];
             arr[largest] = temp;
             heapify(arr,n,largest);
         }
    }
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size = in.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the elements of the array");
       for(int i=0;i<size;i++)
       {
          arr[i] = in.nextInt();
       }
       System.out.println("Arrays :-");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       printArray(arr);
    }
}
