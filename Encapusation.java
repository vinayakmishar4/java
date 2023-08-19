class Employee
{
    private int id1;
    public void settID(int id)
    {
         id=id1;
    }
    public int getID(int id)
    {
        return id;
    }
}
public class Encapusation
{
    public static void main(String[] args) 
    {
       Employee employee = new Employee();
       employee.settID(10);
       System.out.println(employee.getID(10));
    }
} 