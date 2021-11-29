
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objekat klase MatricniDisplej
		MatricniDisplej md = new MatricniDisplej(0);
		//resetujemo vrednost
		md.reset();
		//4 puta inkrementiramo sadrzaj
		for(int i=0;i<4;i++)
		{
			System.out.println("inkrement " + i);
			md.increment();
			md.show();
			System.out.println("");
		}
	}

}
