public class MagacinKaoVektor extends Magacin {
	private int[] niz;
    MagacinKaoVektor(int max) throws Exception{
        super(max);
        niz=new int[max];
    }
    @Override
    public void dodaj(int value) throws Exception {
        if(this.isFull())
            throw (new Exception("Magacin je pun!"));
        niz[this.getTrenutniBroj()]=value;
        this.setTrenutniBroj(this.getTrenutniBroj()+1);
    }

    @Override
    public void izbaci() throws Exception {
        if(this.isEmpty())
            throw (new Exception("Magacin je prazan!"));
        this.setTrenutniBroj(this.getTrenutniBroj()-1);
        System.out.println("Izbacen je "+this.niz[this.getTrenutniBroj()]);
    }
}
