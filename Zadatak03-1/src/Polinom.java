
public class Polinom {
      int dimenzija;
      double [] vektorkoeficijenata;
      
      Polinom(int n){
    	  this.dimenzija=n;
    	  vektorkoeficijenata=new double[n];
      }
      public double vrednostPolinoma(double x) {
    	double v = 0;
  		for (int i = 0 ; i < dimenzija; i++)
  		{
  			v += vektorkoeficijenata[i] * Math.pow(x, i);
  		}
  		return v;
      }
      
      public void vrednostKoeficijenta(int index, double vrednostkoef) {
    	  vektorkoeficijenata[index]=vrednostkoef;
      }

}
