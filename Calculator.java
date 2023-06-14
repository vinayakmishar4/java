import java.util.Scanner;

public class Calculator 
{
   public static void main(String[] args) 
   {
     int num1;
     int num2;
     Scanner scanner=new Scanner(System.in);
     System.out.println("<---------------- Claculator ---------------->");
     System.out.println("Enter the Frist Number");
     num1=scanner.nextInt();
     System.out.println("Enter the Second Number");
     num2=scanner.nextInt();
     System.out.println("<----------------Operatortions ---------------->");
     System.out.println("1.Additon");
     System.out.println("2.Subtract");
     System.out.println("3.Multiply");
     System.out.println("4.Divide");
     System.out.println("Select Operation");
     int a=scanner.nextInt();
     switch(a)
    {
           case 1:System.out.println("Addition");
                  int sum=num1 + num2;
                  System.out.println("Sum: " + sum);
                  break;
           case 2:System.out.println("Subtraction");
                  int diff=num1 - num2;
                  System.out.println("Diffrence: " + diff);
           case 3:System.out.println("Mulitpaction");
                  int mulitply=num1*num2;
                  System.out.println("Mulitply: " + mulitply);
           case 4:System.out.println("Divide");
                  try 
                  {
                     int Divide = num1/num2;
                     System.out.println("Divide: " + Divide);
                  } 
                  catch (Exception e) 
                  {
                    System.out.println(e);
                  }
                  break;
        }       
   } 
}
