package ulazizlaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class TypeReader extends BufferedReader {

	int max;		// broj podataka u ucitanom redu
	int current;	// redni broj podatka u ucitanom redu koji
					// ce sledeci biti isporucen
	String line[];
	
     public TypeReader(Reader s)
	{
		super(s);
	}
	
// ----- funkcija koja ucitava liniju iz ulaznog toka -----
	private void nextLine() throws IOException
	{
		String s;
		s = readLine();		//readLine je metod klase BufferedReader
		line = s.split(" ");	
		max = line.length;
		current = 0;
	}

	public float readFloat() throws IOException
	{
		if (current==max)
			nextLine();
		return new Float (line[current++]).floatValue();
	}
	
	public double readDouble() throws IOException
	{
		if (current==max)
			nextLine();
		return new Double (line[current++]).doubleValue();
	}

	
	public int readInt() throws IOException
	{
		if (current==max)
			nextLine();
		return new Integer(line[current++]).intValue();
	}
	
}
