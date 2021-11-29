
public abstract class Displej {
      protected int cifra;
      public Displej(int c) {
    	  this.cifra=c;
      }
      public void reset() {
    	  cifra=0;
      }
      public void increment() {
    	  if(this.cifra<3)
  		{
  		this.cifra++;
  		}
  		else
  		{
  			this.reset();
  		}
      }
      public abstract void show();
}
