 import java.util.Random;
public class Glavna {
	public static void main(String[] args) {
		Random rand= new Random();

		// TODO Auto-generated method stub
		MagacinKaoVektor m= new MagacinKaoVektor(10);
		if(m.DaLiJePun()==true) {
	        for(int i=0;i<10;i++){
	            m.DodajElement(rand.nextInt(101));
	            }
	        m.DaLiJePun();
		}else {
             for(int i=0;i<10;i++){
                 m.IzbaciPoslednji();
                  }
	}		
	}
	}
