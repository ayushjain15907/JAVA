/* 
public class PrintArrayUsingRecursion
{
     int arr[];
    PrintArrayUsingRecursion(int n)
    {
        arr=new int[n];
    }
    void disp(int i)
    {
        if(i==-1)
        return;
        disp(i-1);
        System.out.println(arr[i]);
    }
}
class A{
   public static void main(String []args)
   {
    PrintArrayUsingRecursion p1=new PrintArrayUsingRecursion(10);
    p1.arr[0]=10;
    p1.arr[1]=20;
    p1.arr[2]=30;
    p1.arr[3]=40;
    p1.arr[4]=50;
    p1.arr[5]=60;
    p1.arr[6]=70;
    p1.disp(6);
   }
}
*/