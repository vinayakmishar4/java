import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Duplicate 
{
    // Brute force method
//    static void Brute(int arr[])
//    {
//       for(int i=0; i<arr.length-1;i++)
//       {
//          for(int j=i+1; j<arr.length; j++)
//          {
//             if((arr[i]==arr[j]) && (i!=j))
//             {
//                 System.out.print(arr[j] + " ");
//                 break;
//             }
//          }
//       }
//    }
   // set interface
//    static void set(int arr[])
//    {
//       Set<Integer> s = new HashSet<Integer>();
//       for(int no: arr)
//       {
//         if(s.add(no)==false)
//         {
//             System.out.print(no + " ");
//         }
//       }
//    }
   // hash table
   static void table(int arr[])
   {
     Map<Integer,Integer> h = new HashMap<Integer,Integer>();
     for(int no: arr)
     {
        Integer count=h.get(no);
        if(count==null)
        {
            h.put(no,1);
        }
        else
        {
            h.put(no,count+1);
        }
     }
     Set<Map.Entry<Integer, Integer>> hm=h.entrySet();
     for(Map.Entry<Integer, Integer> entry: hm)
     {
        if(entry.getValue()>1)
        {
           System.out.println(entry.getKey());
        }
     }
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
        System.out.println("Dupilcate Elements");
        //Brute(arr);
        //set(arr);5
        table(arr);
   }
}

