import java.util.Scanner;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Polinom p=new Polinom(3);
	        for(int i=0;i<=p.getStepen();i++){
	            p.setKoeficijent(i, new Scanner(System.in).nextInt());
	        }
	        p.stampaj();
	        p=p.izvod();
	        p.stampaj();
	}

}
