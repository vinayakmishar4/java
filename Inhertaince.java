//single level inhertance
class Animnal// parnet class
{
    void eat()
    {
       System.out.println("I am eating");
    }
}
class Dog  extends Animnal// child class
{

}
public class Inhertaince 
{
   public static void main(String[] args)
   {
      Dog dog = new Dog();
      dog.eat();
   }  
}
