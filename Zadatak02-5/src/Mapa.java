public class Mapa {
	public int brojtacaka;
	Tacka [] nizTacaka;
	public Mapa(int br){
		brojtacaka=br;
		nizTacaka= new Tacka[brojtacaka];
	}
	//metoda koja postavlja k-tu tacku u mapi
    public void setNiz(int k,Tacka P) {
    	this.nizTacaka[k]=P;
	}
    //ukupno rastojanje izmeðu prve i zadnje taèke u nizu
	public int UkupnoRastojanje(){
		int u = 0;
		for(int i=0;i<brojtacaka-1;i++){
			u=(int)(u+nizTacaka[i].Rastojanje(nizTacaka[i+1]));
	    }
	    return u;
	    }
	public void IzracunajVreme(int brzina)throws Exception{
		try 
		{
	            int distanca=UkupnoRastojanje();
	            int vreme = distanca/brzina; 
	            System.out.println(vreme);
	      }catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0");
	     }
	}
		
}
