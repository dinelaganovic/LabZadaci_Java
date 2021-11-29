public abstract class Funkcija {

	//metoda za izracunavanje integrala
	public double IzracunajIntegral(double a, double b , double dx) {
		double rezultat=0;
		for(double x = a; x < b; x += dx)
			rezultat += ( VrednostUTacki( x ) + VrednostUTacki( x + dx) ) / 2 * dx;
		
		return rezultat;
	}
	//javna apstraktna metoda za prikaz funkcije
	public abstract void PrikaziF();
	//zasticena abstraktna metoda za izracunavanje vrednosti funkcije u tacki
	protected abstract double VrednostUTacki(double x);
}
