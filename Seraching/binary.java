package Seraching;

import java.util.Arrays;
import java.util.Scanner;

public class binary 
{
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
       Arrays.sort(arr);
       System.out.println("Searching Elemnet :-");
       int a=in.nextInt();
       int li=0;
       int hi=arr.length-1;
       int mi=(li+hi)/2;
       while(li<=hi)
       {
        if(arr[mi]==a)
        {
           System.out.println("Element found");
           break;
        }
        else if(arr[mi]<a)
        {
          li=mi+1;
        }
        else
        {
          hi=mi-1;
         }
         mi=(li+hi)/2;
       }
       if(li>hi)
       {
         System.out.println("Element not found");
       }    
   }    
}
