// revere the string
public class RevStr 
{
   public static void main(String[] args) 
   {
         String str="vinayak"; 
         String re=" ";
         int len=str.length();
         for(int i=len-1; i>=0; i--)
         {
            re=re+str.charAt(i);
         }
         System.out.println("Revere of String " + re);
   } 
}
