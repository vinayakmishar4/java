public class Abstracts
{
    public static void main(String[] args)
    {

    }
}
abstract class Vechile
{
    int no_of_tyers;
    abstract void start();
}

class Car extends Vechile
{
    @Override
    void start()
    {
        System.out.println("start with a key");
    }
}
class Soocter extends Vechile
{
    @Override
    void start()
    {
        System.out.println("start with kick");
    }
}