package GFG;
public class PowerOf2 
{
    public static boolean isPowerofTwo(long n)
    {
       if(n==0)
       {
          return false;
       }
       if(n==1)
       {
          return true;
       }
       if(n%2==0)
       {
         return isPowerofTwo(n/2);
       }
       return false;
    }
   public static void main(String[] args) 
   {
        
   }   
}
