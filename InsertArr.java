public class InsertArr
{
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5};
        int pos=3;
        int element=100;
        for(int i=arr.length-1;i>pos-1;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos-1]=element;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
