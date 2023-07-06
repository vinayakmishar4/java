package Sorting;
import java.util.Scanner;
public class QuickSort
{
    static int partation(int arr[],int low,int high)
    {
        int povit=arr[low+high]/2;
        while(low<=high)
        {
          while(arr[low]<povit)
          {
            low++;
          }
          while(arr[low]>povit)
          {
            high--;
          }
          if(low<=high)
          {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
          }
          return low;
        }
    }
    static void Recursive(int arr[], int low, int high)
    {
        int pi=partation(arr, low, high);
        if(low<pi-1)
        {
            Recursive(arr, low, pi-1);
        }
        if(pi<high)
        {
            Recursive(arr, pi, high);
        }
    }
    void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
       
    }
}