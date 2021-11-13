
public abstract class Magacin {
		 
		int kapacitetmagacina;
		int brojelemenata;
		
		Magacin(int kpm){
			this.kapacitetmagacina=kpm;
		}
		
		public boolean DaLiJePun() {
			if(brojelemenata>=kapacitetmagacina)
	        {
	             System.out.println("Pun je!");
	             return true;
	        }else {
	        	 return false;
	        }
	      }
		public boolean DaLiJePrazan() {
			if(brojelemenata==0)
	        {
	             System.out.println("Prazan je!");
	             return true;
	        }else {
	        	 return false;
	        }
	      }
		public abstract void DodajElement(int element);
		public abstract int IzbaciPoslednji();
		
	}