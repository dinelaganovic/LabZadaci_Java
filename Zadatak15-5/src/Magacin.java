public abstract class Magacin {
	private int kapacitet;
    private int trenutniBroj;
    
    Magacin(int kap) throws Exception{
        if(kap<=0)
            throw (new Exception("Nemoguce je imati manje od jednog elementa u magacinu"));
        kapacitet=kap;
    }
    protected boolean isFull(){
        return trenutniBroj==kapacitet;
}
    protected boolean isEmpty(){
        return trenutniBroj==0;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    public void setTrenutniBroj(int trenutniBroj) {
        this.trenutniBroj = trenutniBroj;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public int getTrenutniBroj() {
        return trenutniBroj;
    }
    public abstract void dodaj(int value) throws Exception;
    public abstract void izbaci() throws Exception;

}
