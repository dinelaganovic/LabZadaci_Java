public abstract class Vozilo {
	private boolean stanje;
    private int max_brzina;
    private int trenutna_brzina;
    private int potrosnja;

    public void setStanje(boolean stanje) {
        this.stanje = stanje;
    }

    public void setMax_brzina(int max_brzina) {
        this.max_brzina = max_brzina;
    }

    public void setTrenutna_brzina(int trenutna_brzina) {
        this.trenutna_brzina = trenutna_brzina;
    }

    public void setPotrosnja(int potrosnja) {
        this.potrosnja = potrosnja;
    }

    public boolean isStanje() {
        return stanje;
    }

    public int getMax_brzina() {
        return max_brzina;
    }

    public int getTrenutna_brzina() {
        return trenutna_brzina;
    }

    public int getPotrosnja() {
        return potrosnja;
    }
    Vozilo(boolean s,int mb,int tb,int pot) throws Exception{
        this.stanje=s;
        if(mb>= 80 && mb<=300)
            this.max_brzina=mb;
        else
            throw (new Exception("Maksimalna brzina nije u datom opsegu"));
        this.trenutna_brzina=tb;
        this.potrosnja=pot;
    }
    public void ukljuci(){
        stanje=true;
    }
    public void iskljuci(){
        stanje=false;
    }
    public abstract void ubrzaj() throws Exception;
    public abstract void uspori() throws Exception;
}
