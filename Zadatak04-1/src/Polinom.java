
public class Polinom  {
public int dimenzija;
public Monom m[];
public Monom pom;
		
		public 	Polinom(int d)
		{
			this.dimenzija = d;
			m = new Monom [dimenzija];
		}
		public void napraviMonom(int a,int b, int k)
		{
			m[k] = new Monom(a,b);					
		}
		public void sortiraj()
		{	
			for (int i = 0;i<dimenzija ;i++)
				for (int j =0;j<dimenzija;j++)
			if (m[i].uporedi(m[j])==1 )
			{
				pom = m[i];
				m[i]=m[j];
				m[j]=pom;
			}
			
		}
		public void stampaj()
		{
			for (int i = 0;i<=dimenzija -1;i++)
			m[i].stampaj();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polinom p = new Polinom(4);
		p.m[0] = new Monom (6,2);
		p.m[1] = new Monom (-2,3);
		p.m[2] = new Monom (7.4,0);
		p.m[3] = new Monom (-2.5,6);
		p.sortiraj();
		p.stampaj();
	}

}