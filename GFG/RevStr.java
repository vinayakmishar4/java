package GFG;

public class RevStr 
{
    public static String reverseWord(String str)
    {
         // terminal case
         if(str.length()==0)
         {
             return "";
         }
         String smalleString=str.substring(1);
         String smallResult=reverseWord(smalleString);
         char fristChar=str.charAt(0);
         return smallResult+fristChar;
    }
    public static void main(String[] args) 
    {
       reverseWord("rtr"); 
    } 
}
