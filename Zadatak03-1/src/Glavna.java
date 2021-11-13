
public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polinom polinom=new Polinom(6); //-3x5+65x2-2,34x
		//x=2.3
		
		polinom.vrednostKoeficijenta(1, -2.34);
		polinom.vrednostKoeficijenta(2, 65);
		polinom.vrednostKoeficijenta(5, -3);
		
		System.out.println("Vrednost naseg polinoma je: " + polinom.vrednostPolinoma(2.3));
	}

}
