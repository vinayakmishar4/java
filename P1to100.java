public class P1to100 
{
    public static void main(String[] args) 
    {
        int temmp=0;
         for(int i=1;i<=100;i++)
         {
            for(int j=2;j<i-1;j++)
            {
                if(i%j==0)
                {
                    temmp=temmp+1;
                }
            }
            if(temmp==0)
            {
                System.out.println("Prime Number " + i);
            }
            else
            {
                System.out.println("Not a Prime Number " + i);
                // it will reset the temp value to the zero value
                temmp=0;
            }
         }
    
    } 
}
