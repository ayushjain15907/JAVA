public class Prac1
{
    Prac1() 
    {
        System.out.println("Prac1");
    }
    
}
class Prac2 extends Prac1 
{
    Prac2()
    {
        System.out.println(" default constructor of Prac2");
    }
    Prac2(int a)
    {
        System.out.println("Parametrized const of Prac2");
    }
}
class Example 
{
    public static void main(String[]args)
    {
        Prac2 obj=new Prac2();
        
    }
}