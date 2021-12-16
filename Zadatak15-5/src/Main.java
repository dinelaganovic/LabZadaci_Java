import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        MagacinKaoVektor mniz=null;
        try {
            mniz=new MagacinKaoVektor(5);
            
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }
        
        Scanner s=new Scanner(System.in);
        try {
            while(true){
                    mniz.dodaj(s.nextInt());
            }
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }

        try {
            while(true){
                mniz.izbaci();
            }
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }
        
    }

}
