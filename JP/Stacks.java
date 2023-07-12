/*public class Stacks
{
    private int arr[]=new int[10];
    private int tos;
    Stacks()
    {
        tos=-1;
    }
    void pushu(int a)
    {
        if(tos==9)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            tos+=1;
            arr[tos]=a;
        }
    }
    void pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            tos--;
        }
    }
    void printstack()
    {
        for(int i=tos;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
class Example
{
    public static void main(String[]args)
    {
        Stacks s1=new Stacks();
        s1.pushu(1);
        s1.pushu(2);
        s1.pushu(3);
        s1.pushu(4);
        s1.pushu(10);
        s1.pop();
        s1.pushu(5);
        s1.pushu(6);
        s1.pushu(7);
        s1.printstack();
    }
}*/