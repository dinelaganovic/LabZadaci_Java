import java.awt.*;
import javax.swing.*;
class canvas1 extends JFrame {
 
    // constructor
    canvas1()
    {
        super("canvas");
 
        // create a empty canvas
        Canvas c = new Canvas() {
 
            // paint the canvas
            public void paint(Graphics g)
            {
                // set color to red
                g.setColor(Color.red);
 
                // set Font
                g.setFont(new Font("Bold", 1, 20));
 
                // draw a string
                g.drawString("This is a canvas", 100, 100);
            }
        };
 
        // set background
        c.setBackground(Color.black);
 
        add(c);
        setSize(400, 300);
        show();
    }
 
    // Main Method
    public static void main(String args[])
    {
        canvas c = new canvas();
    }
}