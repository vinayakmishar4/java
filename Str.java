public class Str
{
    public static void main(String[] args) 
    {
        byte[] bytes ={101,101,103};
        StringBuilder builder=new StringBuilder("hello world");
       String s=new String(bytes);
       System.out.println(s);   
    }
}