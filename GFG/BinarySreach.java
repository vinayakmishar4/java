package GFG;
public class BinarySreach
{
    int binarysearch(int arr[], int n, int k) 
    {
        if(arr.length==n)
        {
            return -1;
        }
        if(arr[n]==k)
        {
            return n;
        }
        return binarysearch(arr, n+1, k);
    }
    public static void main(String[] args) 
    {

    }
}