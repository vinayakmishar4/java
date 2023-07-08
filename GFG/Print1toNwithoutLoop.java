package GFG;

public class Print1toNwithoutLoop 
{
    public static void printNos(int N)
    {
      if(N>=1)
      {
        printNos(N-1);
        System.out.print(N + " ");
      }
    }
   public static void main(String[] args) 
   {
      printNos(6);
   }  
}
