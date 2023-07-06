public class RomanToInteger 
{
    public int romanToInt(String s) 
    {
        int sum=0;
        if(s.length()==0)
        {
            return 0;
        }
        return sum;
    }
    public int value(char r)
    {
        if(r=='I')
        {
            return 1;
        }
        if(r=='V')
        {
            return 5;
        }
        if(r=='X')
        {
            return 10;
        }
        if(r=='L')
        {
            return 50;
        }
        if(r=='C')
        {
            return 100;
        }
        if(r=='D')
        {
            return 500;
        }
        if(r=='M')
        {
            return 1000;
        }
        return -1;
    }
   public static void main(String[] args)
   {
      
   }   
}
