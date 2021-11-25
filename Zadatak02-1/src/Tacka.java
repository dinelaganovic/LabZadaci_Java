import java.lang.Math;
public class Tacka {

	private int x;
	private int y;
	public Tacka(int x, int y, int naziv)
	{
		this.x=x;
		this.y=y;
		//this.naziv=naziv;
	}
	
	public double Izracunaj()
	{
		double z;
		z=Math.sqrt((x*x) + (y*y));
		return z;
	}
}
