public class StatiC
{
    static
    {
        System.out.println("hello word");
    }
    static int a=10;
    void m1()
    {
        //we cant use static inner variables
        //static int a=10;
        System.out.println("1");
    }
    // by using static keyword we dont to ceate object of class
    static void m2()
    {
        System.out.println("2");
    }
   public static void main(String[] args) 
   {
       StatiC obj=new StatiC();
       obj.m1();
       m2();
   }    
}
