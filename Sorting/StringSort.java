package Sorting;

import java.util.Scanner;

public class StringSort 
{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int size = in.nextInt();
       String arr[] = new String[size];
       System.out.println("Enter the string of the array");
       for(int i=0;i<size;i++)
       {
          arr[i] = in.next();
       }
       System.out.println("Arrays :-");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       System.out.println("Sorting the array of String");
       String temp;
       for(int i=0;i<arr.length-1;i++)
       {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j].compareTo(arr[j+1])>0)
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
         }
       }
       for(int i=0; i<arr.length; i++)
       {
        System.out.println(arr[i]);
       }
    }
}    

