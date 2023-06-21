public class ArrayWithfunc
{
    static int[] disp()
    {
        int arr1[] ={1,2,3,4,5,6,7,8,9};
        return arr1;
    }
    static void show(int arr[])
    {
        arr[0]=100;
    }
    public static void main(String[] args) 
    {
       int y[]=disp();
       for(int j:y)
       {
        System.out.println(j);
       }
       int arr[] ={1,2,3,4,5,6,7,8,9}; 
       show(arr);
       for(int i:arr)
       {
        System.out.println(i);
       }
    }
}
