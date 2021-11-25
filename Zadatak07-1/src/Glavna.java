import java.util.Scanner;
public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scin=new Scanner(System.in);
        System.out.println("Unesite red prvog polinoma");
        Polinom p1=new Polinom(scin.nextInt());
        System.out.println("Unesite red drugog polinoma");
        Polinom p2=new Polinom(scin.nextInt());
          for(int i=0;i<=p1.getStepen();i++){
            System.out.println("Unesite koeficijent uz "+i+"-ti stepen prvog polinoma.");
            p1.setKoeficijent(i, scin.nextInt());
        }
        for(int i=0;i<=p2.getStepen();i++){   
            System.out.println("Unesite koeficijent uz "+i+"-ti stepen drugog polinom.");
            p2.setKoeficijent(i, scin.nextInt());
        }
        Polinom rezultat=p1.mnozi(p2);
        System.out.println("Koeficijenti proizvoda su:");
        rezultat.stampajKoeficijente();
    
	}

}
