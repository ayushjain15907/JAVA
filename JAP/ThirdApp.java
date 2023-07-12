import java.applet.Applet;
import java.awt.*;
public class ThirdApp extends Applet
{
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    public void init()
    {
        l1=new Label("First number");
        l2=new Label("second number");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("ADD");
        setLayout(null);
        l1.setBounds(10,100,200,40);
        l2.setBounds(10,200,200,40);
        t1.setBounds(350,100,240,40);
        t2.setBounds(350,200,240,40);
        b1.setBounds(250,360,100,40);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
    }
}
