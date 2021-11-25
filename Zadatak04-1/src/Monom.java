import java.math.*;
public class Monom {
	double koef;
	int stepen;

public Monom(double k, int s)
	{
		koef = k;
		stepen = s;
	}
public double izracunaj(int x)
	{
		return (double) (koef* Math.pow(x,stepen));
	}
public int uporedi(Monom m1)
	{
		if (this.stepen > m1.stepen)
			return 1;
		else
			return 0;

	}
public void stampaj()
	{
		System.out.print(this.koef+"*x^"+this.stepen+ " ");
	}
	
}
