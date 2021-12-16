
public class Datum {
	private int dan;
    private int mesec;
    private int godina;
    
    Datum(int d,int m,int g) throws Exception{
        if(d>30 || d<1)
        	//napravljene posebne klase da nam bacaju izuzetak za dati uslov : Mesec, Dan i Godina
            throw (new Dan());
        else
            this.dan=d;
        if(m>12 || m<1)
            throw (new Mesec());
        else
            this.mesec=m;
        if(g<0)
            throw (new Godina());
        else
            this.godina=g;
    }
    public void prikaz(){
        System.out.println(dan+"."+mesec+"."+godina+".");
    }
    public int danPoRedu(){
        return dan+(mesec-1)*30;
    }
    //metoda za proveravanja dana unazad i da baca izuzetak za p.n.e.
    public void danNazad() throws Exception{
        if(mesec==1 && godina==0 && dan==1)
            throw (new Exception("Prelazimo u doba pre nove ere"));
        else{
            if(dan!=1)
                dan--;
            else{
                dan=30;
                if(mesec!=1)
                    mesec--;
                else{
                    mesec=12;
                    godina--;
                }
            }
        }  
    }
}
