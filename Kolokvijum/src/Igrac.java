
public class Igrac {
	private int [] vektor = new int[5];
	
	public void Igra() {
		int  brbacanja=0;
		if(brbacanja==0) {
			System.out.println("Mora da se izvrsi bacanje");
		}else if(brbacanja==1) {
			PrvoBacanje();
		}else if() {
			
		}
	}
	private void PrvoBacanje() {
		//vektor= new int [] {0,0,0,0,0};
		Kockica kockica=new Kockica();
		for(int j=0;j<5;j++)
		{
			vektor[j]=kockica.postavivrrek();
			 System.out.println(this.vektor[j]);
		}
	}
	private void dodatnoBacanje() {
		
	}
	public int VratiRezultat() {
		int r=10;
		return r;
	}
	public void PrikaziRez() {
		
	}

}
