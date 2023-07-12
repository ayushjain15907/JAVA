import java.applet.Applet;
import java.awt.*;
/* <applet code="FifthApplet" width="300" height="220">
   <param name="site" value="www.mysirg.com" />
</applet */
public class FifthApplet extends Applet
{
    private String defaultMessage="Hello";
    public void paint(Graphics g)
    {
        String s1=this.getParameter("");
        if(s1==null)
            s1=defaultMessage;
        g.drawString(s1,50,25);
    }    
}
