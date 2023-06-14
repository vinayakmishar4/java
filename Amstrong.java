// WAP to Amstrong in java

import java.util.Scanner;

public class Amstrong 
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scanner.nextInt();
        int t1=num;
        // to find the length of number
        int len=0;
        while(t1!=0)
        {
            t1=t1/10;
            len=len+t1;
        }
        // to find the amstrong number
        int t2=num,re;
        int mul=1;
        int sum=0;
        while(t2!=0)
        {
            re=t2%10;
            for(int i=1;i<len;i++)
            {
                mul=mul*re;
            }
            sum=sum+mul;
            t2=t2/10;

        }
        if(sum==num)
        {
            System.out.println(num+" is an Amstrong Number");
        }
        else
        {
            System.out.println(num+" is not an Amstrong Number");
        }
    }
}
