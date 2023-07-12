/*import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class CalCharge
{
    public static void main(String[]args)
    {
        int acc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number");
        acc=sc.nextInt();
        System.out.println("Choose your service type");
        char ch=sc.next().charAt(0);
        if(ch=='r' || ch=='R')
        {
            float charge=10f;
            int minutes;
            System.out.println("How much minutes you talked ");
            minutes=sc.nextInt();
            if(minutes>50)
            {
                int netminutes=minutes-50;
                charge=charge+netminutes*0.2f;
            }
        }
        else if(ch=='p' || ch=='P')
        {
            int m1,m2;
            float charge=25f;
            System.out.println("enter no. of minutes for calls made b/w 6.00am to 6.00pm");
            m1=sc.nextInt();
            System.out.println("enter no. of minutes for calls made b/w 6.00pm to 6.00am");
            m2=sc.nextInt();
            if(m1>75)
            {
               int netm1=m1-75;
                charge=charge+0.10f*netm1;
            }
            if(m2>100)
            {
                int netm2=m2-100;
                charge=charge+ 0.05f*netm2;
            }
            int minutes=m1+m2;
            System.out.println("Account number is "+acc);
            System.out.println("The service type is "+ch);
            System.out.println("Telephone were used "+minutes+" minutes");
            System.out.println("Amount due  is "+charge+" $");
        }
        else 
        {
            System.out.println("Invalid choice");
        }
    }
}
*/