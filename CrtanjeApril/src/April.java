import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class April extends Canvas {

	public static void main(String [] args)
	{
		JFrame frame=new JFrame("Aprilski rok");
		Canvas canvas=new April();
		frame.add(canvas);
		frame.setResizable(false);
		frame.pack();
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	public void paint(Graphics page) {
		// page.drawRect(0, 0, 40, 40); // crta kvadrat //ako je levi cosak
		//page.setColor(Color.red); ako zelimo da nam oboji samo liniju oko oblika
		page.drawLine(0, 0, 380, 360); // crta liniju
		page.setColor(Color.red);
		page.fillRect(340, 0, 50, 50);
		page.setColor(Color.blue);
		page.fillOval(0, 313, 50, 50);

	}

}
