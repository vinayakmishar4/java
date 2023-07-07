package Hackerrank;

import java.util.Scanner;

public class Array2d
{
    public static void main(String[] args)
    {
        int sum;
        Scanner scanner = new Scanner(System.in);
        int arr[][]=new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=0;j<arr[i].length-2;j++)
            {
                            sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2])+(arr[i+1][j+1])+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+1]+arr[i+1][j+2]);
                            max=Math.max(max,sum);    
            }
        }
        System.out.println(max);
    }
}