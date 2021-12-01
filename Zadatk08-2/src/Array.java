
public class Array implements Collection {
    protected int maxBrElemenata;
    protected int trenutni;
    protected int[] niz;
    //klasa preko koga kreiramo max br el u nizu
    public Array(int brElem){
        maxBrElemenata=brElem;
        niz=new int[maxBrElemenata];
    }
	@Override
	public void dodaj(int a) {
		// TODO Auto-generated method stub
		if(trenutni>=maxBrElemenata)
            System.out.println("Nema mesta");
        else{
            niz[trenutni]=a;
            trenutni++;
        }
	}

	@Override
	public void izbaci() {
		// TODO Auto-generated method stub
		if(trenutni<=0)
            System.out.println("Nema elemenata za izbacivanje");
        else{
            trenutni--;
            System.out.println("Izbacen je element:"+niz[trenutni]);
        }
	}

}
