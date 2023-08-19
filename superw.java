class A
{
    int a=10;
}
public class superw extends A 
{
    int a=20;
    void show(int a)
    {
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        superw obj=new superw();
        obj.show(obj.a);
    }
}
