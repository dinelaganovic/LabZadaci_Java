
public class Automobil extends Vozilo {
	boolean stanjeVrata;
    Automobil(boolean s,int mb,int tb,int pot,boolean sv) throws Exception{
        super(s,mb,tb,pot);
        this.stanjeVrata=sv;
    }
    public void otvoriVrata(){
        stanjeVrata=true;
    }
    public void zatvoriVrata(){
        stanjeVrata=false;
    }
    @Override
    public void ubrzaj() throws Exception {
        if(this.getTrenutna_brzina()+10>this.getMax_brzina())
            throw (new Exception("Prekoracena je max brzina"));
        else
            this.setTrenutna_brzina(this.getTrenutna_brzina()+10);
    }

    @Override
    public void uspori() throws Exception {
        if(this.getTrenutna_brzina()-30<0)
            throw (new Exception("Prekoracena je min brzina"));
        else
            this.setTrenutna_brzina(this.getTrenutna_brzina()-10);
    }
}
