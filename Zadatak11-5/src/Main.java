import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Bafer b = null;
		try {
			b = new Bafer(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//vracamo izuzetak
			e.printStackTrace();
			System.out.print("Unesite neki broj veci od 0: ");
			int p = scan.nextInt();
			try {
				b = new Bafer(p);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
