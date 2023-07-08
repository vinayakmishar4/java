package GFG;

public class Paildrome 
{
    static int isPalindrome(String S) 
    {
       if(S.equals(revser(S)))
       {
            return 1;
       } 
       return 0;      
    }
    static String revser(String S)
    {
         if(S.length()==0)
         {
             return "";
         }
         String smalleString=S.substring(1);
         String smallResult=revser(smalleString);
         char fristChar=S.charAt(0);
         return smallResult+fristChar;
    }
    public static void main(String[] args) 
    {
        System.out.println(isPalindrome("abba"));
    }
}
