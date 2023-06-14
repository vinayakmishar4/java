// reverse the number 
public class Rev 
{
    public static void main(String[] args) 
    {
        int num=235;
        int sum=0;
        int remider;
        while(num>0)
        {
           remider=num%10;
           sum=sum*10+remider;
           num=num/10;
        }
        System.out.println("Revese of Number = " + sum);    
    }
}
