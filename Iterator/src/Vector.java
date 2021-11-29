public class Vector {
	private int n;
	private int niz[];
	
	public Vector( int dim )
	{
		n = dim;
		niz = new int[n];
		for ( int i=0; i<n; i++ )
			niz[i] = i;
	}
	
	public int getElement( int k )
	{
		return niz[k];
	}
	
	public int getDimension()
	{
		return n;
	}
}
