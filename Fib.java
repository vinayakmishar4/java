import java.util.Scanner;
// WAP to Fibconnes Series 
public class Fib 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
         int a=0;
         int b=1;
         int c;
         System.out.println("Enter The Number ");
         int n=scanner.nextInt();
         System.out.println("Fibnnoci Sequces");
         for (int i=0;i<n;i++)
         {
            c=a+b;// 0 +1 =1, 1 +2 =3
            System.out.println(c);
            a=b;// 1 2
            b=c;// 1 3
         }    
    }    
}
