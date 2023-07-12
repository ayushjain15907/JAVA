import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="MyFrstProj" width="600" height="700"></applet> */
public class MyFrstProj extends Applet
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2;
    Button b1,b2,b3,b4;
    public void init()
    {
        l1=new Label("First number");
        l2=new Label("Second number");
        l3=new Label();
        l4=new Label();
        l5=new Label();
        l6=new Label();
        t1=new TextField();
        t2=new TextField();
        b1=new Button("ADD");
        b2=new Button("SUBSTRACT");
        b3=new Button("MULTPLY");
        b4=new Button("DIVIDE");
        setLayout(null);
        l1.setBounds(100,100,200,40);
        l2.setBounds(100,200,200,40);
        b1.setBounds(100,300,150,40);
        b2.setBounds(100,400,150,40);
        b3.setBounds(100,500,150,40);
        b4.setBounds(100,600,150,40);
        t1.setBounds(400,100,150,40);
        t2.setBounds(400,200,150,40);
        l3.setBounds(350,300,150,40);
        l4.setBounds(350,400,150,40);
        l5.setBounds(350,500,150,40);
        l6.setBounds(350,600,150,40);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        b1.addActionListener(new MyHandler());
        b2.addActionListener(new MyHandler1());
        b3.addActionListener(new MyHandler2());
        b4.addActionListener(new MyHandler3());
    }
    public class MyHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a,b,res1;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            res1=a+b;
            l3.setText("sum is"+ res1);
        }
    }
    class MyHandler1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int c,d,res2;
            c=Integer.parseInt(t1.getText());
            d=Integer.parseInt(t2.getText());
            res2=c-d;
            l4.setText("Difference is "+res2);
        }
    }
    class MyHandler2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int m,n,res3;
            m=Integer.parseInt(t1.getText());
            n=Integer.parseInt(t2.getText());
            res3=m*n;
            l5.setText("Multiplication is "+res3);
        }
    }
    class MyHandler3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            float x,y,res4;
            x=Float.parseFloat(t1.getText());
            y=Float.parseFloat(t2.getText());
            res4=x/y;
            l6.setText("Division is "+res4);
        }
    }
}
