package Hackerrank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class javaAragams
{
    static boolean isAnagram(String a, String b) 
    {
        a=a.replace(" ", "").toLowerCase(null);
        b=b.replace(" ", "").toLowerCase(null);
        char[] achar=a.toCharArray();
        char[] bchar=b.toCharArray();
        Arrays.sort(achar);
        Arrays.sort(bchar);
        if(Arrays.equals(achar,bchar))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}