public class Bafer {
	private int maxBr;
	private int trBr;
	private int niz[];
	
	Bafer(int maxBr) throws Exception
	{
		if(maxBr <= 0)
			throw (new Exception("Kapacitet mora biti veci od 0"));
		else 
			this.maxBr = maxBr;
		niz = new int[this.maxBr];
	}
	
	protected boolean isFull()
	{
		if(this.trBr + 1 == this.maxBr)
			return true;
		return false;
	}
	
	protected boolean isEmpty()
	{
		if(this.trBr == 0)
			return true;
		return false;
	}
	
	public void addElement(int e) throws Exception
	{
		if(isFull()) 
			throw (new Exception("Bafer je pun"));
		else 
		{
		niz[this.trBr] = e;
		this.trBr++;
		}	
	}
	
	public int removeElement() throws Exception
	{
		if(isEmpty())
			throw (new Exception("Bafer je prazan"));
		else 
		{
			this.trBr--;
			return niz[this.trBr];
		}
	}
	
	public int getMaxBr()
	{
		return this.maxBr;
	}
	
	public void setMaxBr(int b)
	{
		this.maxBr = b;
	}
}
