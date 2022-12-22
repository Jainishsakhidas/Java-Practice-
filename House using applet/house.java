import java.applet.*;
import java.awt.*;
public class house extends Applet
{
	public void paint(Graphics g)
	{
		//rectangle with cicular window
		g.setColor(Color.magenta);
		g.fillRect(150,100,150,100);

		//rectangle with door
		g.setColor(Color.blue);
		g.fillRect(100,100,50,100);
		
		//triangle on roof
		int x_triangle[]={125,100,150};
		int y_triangle[]={50,100,100};
		g.setColor(Color.pink);
		g.fillPolygon(x_triangle,y_triangle,3);

		//roof
		int x_roof[]={125,265,300,150};
		int y_roof[]={50,50,100,100};
		g.setColor(Color.cyan);
		g.fillPolygon(x_roof,y_roof,4);

		//door
		g.setColor(Color.lightGray);
		g.fillRect(115,140,20,60);

		//circular windoow
		g.setColor(Color.white);
		g.fillOval(200,125,50,50);

		//Printing name on the house
		String name=this.getParameter("name");
		g.setColor(Color.black);
		g.drawString(name,160,75);

	}
}