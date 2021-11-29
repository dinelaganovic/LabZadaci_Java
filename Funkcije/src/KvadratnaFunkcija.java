
public class KvadratnaFunkcija extends Funkcija {

	//koeficijenti koji idu uz clanove
	private double a;
	private double b;
	private double c;
	//konstruktor za inicijalizaciju koeficijenata
	public KvadratnaFunkcija(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	@Override
	public void PrikaziF() {
		// TODO Auto-generated method stub
		System.out.print("Kvadratna funkcija: " + a + "x" + "^2" );
		if ( b>0 )
			System.out.print( "+" );
		if ( c>0 )
			System.out.print( "+" );
		System.out.println( c );
	}

	@Override
	protected double VrednostUTacki(double x) {
		// TODO Auto-generated method stub
		return a * x * x + b * x + c;
	}

}
