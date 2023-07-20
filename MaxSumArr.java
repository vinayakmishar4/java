public class MaxSumArr 
{
    public static void main(String[] args)
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxS=Integer.MIN_VALUE;
        int maxE=0;
        int s=0,start=0,end=0;
        for(int i=0;i<arr.length;i++)
        {
            maxE=maxE+arr[i];
            if(maxS<maxE)
            {
                maxS=maxE;
                start=s;
                end=i;
            }
            if(maxE<0)
            {
                 maxE=0;
                 s=s+1;
            }
        }
    }
}
