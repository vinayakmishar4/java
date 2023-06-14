// WAP to print wether it is prime or not

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();//9
        int temp=0;
        for(int i=2;i<n-1;i++)
        {
            if(n%i==0)
            {
                // when temp is 0 it means that is a prime number
                // otherwise it is a not a prime number
                temp=temp+1;
            }
        }
        if(temp>0)
        {
            System.out.println("Number is not  Prime Number :- " + n);
        }
        else
        {
            System.out.println("Number is Prime Number :-" + n);
        }

    }
}