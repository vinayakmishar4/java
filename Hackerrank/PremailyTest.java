package Hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PremailyTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int temp=0;
        int n=scanner.nextInt();
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
