public class EksponencijalnaFunkcija extends Funkcija {
	//koef
	private double a;
	public EksponencijalnaFunkcija(double a) {
		this.a=a;
	}
	@Override
	public void PrikaziF() {
		// TODO Auto-generated method stub
		System.out.println("Eksponencijalna funkcija: (" + a + ")^x");
	}

	@Override
	protected double VrednostUTacki(double x) {
		// TODO Auto-generated method stub
		return Math.pow(a, x);
	}

}
