public class Buffer extends Array {
	private int pocetak;
	public Buffer(int brElem) {
		super(brElem);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void izbaci(){
        if(pocetak>=trenutni)
            System.out.println("Nema elemenata za izabaciti");
        else{
            System.out.println("Red:Izbacen je element:"+niz[pocetak]);
            pocetak++;
        }
    }

}
