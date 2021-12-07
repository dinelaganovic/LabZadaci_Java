import java.util.Random;
public class Kockica extends Rekvizit {
	public Kockica() {
		super();
	}

	@Override
	public int postavivrrek() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int vrednost= rd.nextInt(6)+1;
		set_vrednostrekvizita(vrednost);
		return vrednost;
	}

}
