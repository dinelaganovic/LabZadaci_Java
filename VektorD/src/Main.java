
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays.Vector v1;
		arrays.Vector v2;
		v1 = new arrays.Vector();
		v2 = new arrays.Vector();
		try
		{
			v1.readText("Neuredjen.txt");
			System.out.println("Polazni vektor:");
			v1.printVector();
			v1.sort();
			System.out.println("Uredjeni vektor:");
			v1.printVector();
			v1.write("Uredjen.dat");
			v2.read("Uredjen.dat");
			System.out.println("Vektor ucitan iz binarne datoteke:");
			v2.printVector();
			v2.writeText("Uredjen.txt");
		}
		catch( IOException e )
		{
			System.out.println( "Greska: " + e.toString() );
		}
	}

}
