public class Prnt
{
    void fun1()
    {
        System.out.println("fncn 1 of parents class");
    }
    void fun2()
    {
        System.out.println("Fncn 2 of parent class");
    }

}
class Chld extends Prnt
{
    void fun2()
    {
        System.out.println("Funcn 2 of child class");
    }
    void fun3()
    {
        System.out.println("Fncn 3 of Child class");
    }
}
class Example
{
    public static void main(String[]args)
    {
        Prnt p1=new Chld();
        p1.fun1();
        p1.fun2();
    }
}