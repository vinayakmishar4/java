import java.util.Scanner;

public class CommanElementsArr
{

    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of the Array One");
       int size = in.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the elements of the Array One");
       for(int i=0;i<size;i++)
       {
          arr[i] = in.nextInt();
       }
       System.out.println("Arrays One:-");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       System.out.println("Enter the size of the Array Second");
       int size1 = in.nextInt();
       int arr1[] = new int[size];
       System.out.println("Enter the elements of the Array Second");
       for(int i=0;i<size1;i++)
       {
          arr1[i] = in.nextInt();
       }
       System.out.println("Arrays Second :-");
       for(int i=0;i<arr1.length;i++)
       {
           System.out.println(arr[i]);
       }
       System.out.println("Comman Elements :-");
       for(int i=0;i<arr.length;i++)
       {
          for(int j=0;j<arr1.length;j++)
          {
              if(arr[i]==arr1[j])
              {
                 System.out.println("The elements are same :- " + arr[i]);
              }
          }
       }  
    }
}