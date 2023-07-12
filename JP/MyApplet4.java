import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
//<applet code="MyApplet4" width="600"height="500"></applet>
public class MyApplet4 extends Applet implements ActionListener
{ 
    Label l1;
    Label l2;
    Label l3;
    TextField t1;
    TextField t2;
    Button b1;
    public void init()
    {
        l1= new Label("First number");
        l2=new Label("Second number");
        l3=new Label();
        t1=new TextField();
        t2=new TextField();
        b1=new Button("ADD");
        setLayout(null);
        l1.setBounds(10,100,200,40);
        l2.setBounds(10,200,200,40);
        l3.setBounds(100,350,100,40);
        t1.setBounds(350,100,200,40);
        t2.setBounds(350,200,200,40);
        b1.setBounds(350,360,100,40);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l3);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {     
        int a,b,s;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t1.getText());
        s=a+b;
        l3.setText("sum is "+s);
    }
}
