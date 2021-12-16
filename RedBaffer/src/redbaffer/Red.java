/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbaffer;

/**
 *
 * @author Minela
 */
public class Red {
    private int maxBr;
	private int trBr;
	private int niz[];
	
	Red(int maxBr) throws Exception
	{
		if(maxBr <= 0 || maxBr>=100)
		throw (new Exception("Kapacitet mora biti veci od 0 i manji od 100"));
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
