import static java.lang.Math.sqrt;
public class Tacka {
	private int  x;
	private int y;
	private String name;
	public Tacka(int x,int y, String name) throws Exception{
		try {
			this.x=x;
		    this.y=y;
		    this.name=name;
		}catch(Exception e) {
			System.out.println ("Kordinata mora biti pozitivan broj!");
		}
	    }
	public double Rastojanje(Tacka P1){
	    return sqrt((this.x-P1.x)*(this.x-P1.x)+(this.y-P1.y)*(this.y-P1.y));
	    }

}
