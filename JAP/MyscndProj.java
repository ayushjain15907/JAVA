import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="MyscndProj" width="500" height="800"></applet> */
public class MyscndProj extends  Applet
{
   Label l1,l2,l3,l4;
   Button b1,b2,b3,b4;
   TextField t1,t2;
   Checkbox cb1;
   Choice ch1;
   TextArea ta1;
   List lt1;
   public void init()
   {
      l1=new Label("First name");
      t1=new TextField();
      l2=new Label("First name");
      t2=new TextField();
      l3=new Label("Select gender:");
      l4=new Label("List of colours");
      ch1=new Choice();
      ch1.add("Male");
      ch1.add("Female");
      ch1.add("Other");
      ta1=new TextArea("Comment your thoughts");
      lt1=new List(9);
      lt1.add("Green");
      lt1.add("Red");
      lt1.add("Blue");
      lt1.add("Black");
      lt1.add("White");
      lt1.add("Brown");
      lt1.add("Pink");
      lt1.add("Violet");
      lt1.add("Sky");
      lt1.add("Yellow");
      lt1.add("Grey");
      lt1.add("navy blue");
      lt1.add("Orange");
      cb1=new Checkbox("Accept terms and conditions");
      b1=new Button("Sign Up");
      setLayout(null);
      l1.setBounds(50,50,150,25);
      t1.setBounds(250,50,200,25);
      l2.setBounds(50,85,150,25);
      t2.setBounds(250,85,200,25);
      l3.setBounds(50,110,200,50);
      ch1.setBounds(70,165,100,40);
      ta1.setBounds(50,215,350,100);
      l4.setBounds(50,360,100,30);
      lt1.setBounds(50,400,100,100);
      cb1.setBounds(50,650,400,40);
      b1.setBounds(200,720,100,50);
      add(l1);
      add(l2);
      add(t1);
      add(t2);
      add(l3);
      add(ch1);
      add(ta1);
      add(l4);
      add(lt1);
      add(cb1);
      add(b1);
   }
}
