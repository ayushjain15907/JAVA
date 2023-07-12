/*import java.util.Scanner;
public class Ticket
{
    public static void main(String[]args)
    {
        int arr[]=new int[3];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter the age of the person");
            int a;
            a=sc.nextInt();
            if(a<5)
            {
                arr[0]+=1;
            }
            else if(a>=5 && a<18)
            {
                arr[1]+=1;
            }
            else{
                arr[2]+=1;
            }
        System.out.println("Do you want to enter more\n");
        System.out.println("Press y for yes or n for no\n");
        ch=sc.next().charAt(0);
        }
        while(ch !='n');
        System.out.println("The Data Collected are:\n\n");
        System.out.println("Below 5 age groups persons are "+arr[0]);
        System.out.println("Price collected for this group is 0 \n\n");
        System.out.println("Above 5 and below 18 groups persons are "+arr[1]);
        System.out.println("Price collected from this group is "+arr[1]*3+" Rs.\n\n");
        System.out.println("Above 18 age persons are "+arr[1]);
        System.out.println("Price collected from this group is "+arr[2]*5+" Rs.");

    }        
}
*/