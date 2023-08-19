 class Test
{
    int i;
    void setValues(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}
public class Thies 
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.setValues(10);
        t.show();
    }
}