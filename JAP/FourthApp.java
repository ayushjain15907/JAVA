import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
// <applet code="FourthApp" width="600" height="500"> </applet>
public class FourthApp extends Applet
{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1;
    public void init()
    {
        l1=new Label("First number");
        l2=new Label("second number");
        l3=new Label();
        t1=new TextField();
        t2=new TextField();
        b1=new Button("ADD");
        setLayout(null);
        l1.setBounds(10,100,200,40);
        l2.setBounds(10,200,200,40);
        t1.setBounds(350,100,240,40);
        t2.setBounds(350,200,240,40);
        b1.setBounds(250,360,100,40);
        l3.setBounds(250,420,200,40);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
        b1.addActionListener(new MyHandler());  
    }
    class MyHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a,b,s;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            s=a+b;
            l3.setText("sum is "+s);
        }
    }
}
