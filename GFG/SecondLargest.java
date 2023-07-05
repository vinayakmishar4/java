package GFG;

import java.util.Scanner;

public class SecondLargest 
{
    static int print2largest(int arr[], int n) 
    {
        int largest=0;
        int Secondlargest=-1;
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]!=arr[largest])
           {
             if(Secondlargest==-1 || arr[i]>arr[Secondlargest])
             {
                Secondlargest=i;
             }
             else if(arr[i]>arr[largest])
             {
                Secondlargest=largest;
                largest=i;
             }
           }
        }

        // for(int i=0; i<arr.length; i++)
        // {
        //     for(int j=i+1; j<arr.length; j++)
        //     {
        //           if(arr[i]<arr[j])
        //           {
        //               int temp=arr[i];
        //               arr[i]=arr[j];
        //               arr[j]=temp;
        //           }
        //     }
        // }
         return Secondlargest;
    }
    public static void main(String[] args)
    {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter The Size of the Array");
         int n=scanner.nextInt();   
         int arr[]=new int[n];
         System.out.println("Enter The Elements");
         for(int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Array:-");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Second Largest elment " +  print2largest(arr, n));
    }
} 
