package Uses_of_this;
public class Uses1
{
    int i;
    void SetValue(int i)
    {
       this.i = i;
    }
    public void getValue()
    {
       System.out.println(i);
    }
    public static void main(String[] args) 
    {
        Uses1 ob1=new Uses1();
        ob1.SetValue(10);
        ob1.getValue();
    }
}