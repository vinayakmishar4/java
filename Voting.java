class UnderAge extends Exception
{
    UnderAge()
    {
        super("You are under age");
    }
    UnderAge(String age)
    {
        super(age);
    }
}
class voting
{
    public static void main(String[] args) throws UnderAge
    {
       int a=17;
       if(a<18)
       {
         throw new UnderAge();
       }    
    }
}