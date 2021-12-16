public class Main {

	public static void main(String[] args) throws Exception {
	        Mapa M1=new Mapa(4);
		int ukupnorastojanje = 0;
		try {
			M1.setNiz(0,new Tacka(261,350,"Nis"));
	        M1.setNiz(1,new Tacka(144,175,"Beograd"));
	        M1.setNiz(2,new Tacka(90,120,"Novi Sad"));
	        M1.setNiz(3,new Tacka(77,20,"Subotica"));
	        ukupnorastojanje = M1.UkupnoRastojanje();
	        M1.IzracunajVreme(100);
		}catch(Exception e) {
			System.out.println("Izuzetak:"+e);
		}
	}

}
