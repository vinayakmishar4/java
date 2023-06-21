public class Frist 
{
  public static void main(String[] args)
  {
    int mul[][]={{0,1},{1,2}};
    double[] x = new double[10];
    System.out.println(x);
     int arr[]={1,2,3,4,5,6,7,8,9};
     System.out.println("Length of arr = " +arr.length);
     System.out.println(arr);  
     System.out.println("Array");
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]);
     }
     System.out.println("array");
     for(int i:arr)
     {
        System.out.println(i);
     }
     System.out.println("arraY");
     for(double d:x) 
     {
        System.out.println(d);
     }
     System.out.println("2d array");
     for(int i=0;i<mul.length;i++)
     {
        for(int j=0;j<mul[i].length;j++)
        {
            System.out.print(mul[i][j] + " ");
        }
     }
     System.out.println("2D array");
     for(int e[]:mul)
     {
        for(int el:e)
        {
            System.out.println(el + " ");
        }
     } 
  }  
}
