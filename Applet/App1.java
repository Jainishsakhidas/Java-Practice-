import java.applet.Applet;
import java.awt.*;
public class App1 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		g.drawLine(10,10,100,50);
		g.drawRect(100,100,50,50);
		g.drawRect(100,100,70,150);
		g.drawOval(50,50,50,150);
		g.drawOval(20,100,120,150);
	}
}