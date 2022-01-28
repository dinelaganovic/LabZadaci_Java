import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Grids extends Frame {
	  Grids(String title, int w, int h, int rows, int cols) {
	    setTitle(title);
	    GridsCanvas xyz = new GridsCanvas(w, h, rows, cols);
	    add(xyz);

	    addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        setVisible(false);
	        dispose();
	        System.exit(0);
	      }
	    });
	    pack();
	  }

	  public static void main(String[] a) {
	    new Grids("Test", 300, 300, 5, 10).setVisible(true);
	  }
	}
         
    