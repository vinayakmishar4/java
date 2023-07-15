import java.util.Scanner;

public class EvenOddArr
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
       System.out.println("Even numbers in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2==0)
          {
              System.out.println(arr[i]);
          }
       }
      System.out.println("Odd numbers in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2!=0)
          {
              System.out.println(arr[i]);
          }
       }
       int count=0;
       System.out.println("How many  numbers are even in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2==0)
          {
              count=count+1;
              //System.out.println(arr[i]);
          }
       }
       System.out.println(count);
       int count1=0;
       System.out.println("How many Odd numbers  are  in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2!=0)
          {
              count1=count1+1;
              //System.out.println(arr[i]);
          }
       }
       System.out.println(count1);
       int sum=0;
       System.out.println("Sum of Even  numbers in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2==0)
          {
             sum=sum+arr[i];
          }
       }
       System.out.println(sum);
       int sum1=0;
       System.out.println("Sum of  Odd numbers  in arr :-");
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]%2!=0)
          {
              sum1=sum1+arr[i];
          }
       }
       System.out.println(sum1);
    }
}