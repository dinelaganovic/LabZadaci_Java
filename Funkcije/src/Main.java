
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kreira se niz od 10 funkcija
		Funkcija [] niz = new Funkcija[10];
		for (int i=0; i<10; i++ ){
			// na parnim pozicijama se postavlja kvadratna funckija
			if ( i%2 == 0 ) {
				niz[i] = new KvadratnaFunkcija( Math.random()*100, Math.random()*100, Math.random()*100);
			}else {
				// na neparnim pozicijama se postavlja eksponencijalna funkcija
				niz[i] = new EksponencijalnaFunkcija( Math.random()*100 );
			}
			}
		// maksimalna vrednost povrsine koju neka funkcija zaklapa sa x-osom
				double maxPovrsina; 
				maxPovrsina = niz[0].IzracunajIntegral(-2.0, 2.0, 0.001);				
		//	indeks funkcije u nizu kojoj odgovara ta maksimalna povrsina
				int indeks = 0;
				for(int i = 1; i < 10; i++)
				{
					// vrednost povrsine koju tekuca funkcija zaklapa sa x-osom
					double povrsina = niz[i].IzracunajIntegral(-2.0, 2.0, 0.001);
					if ( povrsina > maxPovrsina )
					{
						maxPovrsina = povrsina;
						indeks = i;
					}
				}
				System.out.println("Funkcija koja zaklapa najvecu povrsinu sa x-osom je:");
				niz[indeks].PrikaziF();
				System.out.println( "Velicina te povrsine je: " + maxPovrsina );

	}

}
