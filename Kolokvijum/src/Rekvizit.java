
public abstract class Rekvizit {
	private int vrednostrekvizita;
	
	public void set_vrednostrekvizita(int vr) {
		this.vrednostrekvizita=vr;
	}
	public int  get_vrednostrekvizita() {
		return vrednostrekvizita;
	}
	public void prikazivredostrek() {
		System.out.println("Vrednost je : "+this.vrednostrekvizita);
	}
	protected void vrednostrekvizita(int vr) {
		this.vrednostrekvizita=vr;
	}
	public abstract int postavivrrek();
}
