import static java.lang.Math.sqrt;
public class Tacka {
	if(x < 0 || y<0)
			throw (new Exception("Kordinata mora biti pozitivan broj!"));
		else
			this.x=x;
		    this.y=y;
		    this.name=name;
	    }
	public double Rastojanje(Tacka P1){
	    return sqrt((this.x-P1.x)*(this.x-P1.x)+(this.y-P1.y)*(this.y-P1.y));
	    }

}
