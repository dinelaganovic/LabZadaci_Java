package arrays;
import java.io.*;       
public class Vector {
	private int n;
    private float [] niz;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public float [] getNiz() {
		return niz;
	}
	public void setNiz(float [] niz) {
		this.niz = niz;
	}
	
	// ------------- CITANJE IZ TEKSTUALNE DATOTEKE ----------------
		public void readText (String fileName) throws IOException
		{
			FileReader dat;		// datoteku za upis reprezentuje objekat FileReader
			
			dat = new FileReader(fileName);	// string sa imenom
			BufferedReader bDat;			// fajla mu je argument
			bDat = new BufferedReader (dat);
				
			String pom;
			pom = bDat.readLine();	// ucitava jednu liniju
				
			n = Integer.parseInt(pom, 10);
			niz = new float[n];
			for (int i=0; i<n; i++)
			{
				pom = bDat.readLine();
				niz[i]=Float.valueOf(pom).floatValue();
			}
			bDat.close();
		}
		
	// ------------ UPIS U TEKSTUALNU DATOTEKU ------------------
		public void writeText(String fileName) throws IOException
		{
			FileWriter dat;		//datoteku za citanje reprezentuje objekat klase FileWriter
			
			dat = new FileWriter(fileName);	// pravi novi objekat tipa FileWriter
			BufferedWriter bDat;			// taj novi objekat dodaje objektu
			bDat = new BufferedWriter(dat);	// BufferedWriter kao inic. argument...
												
				
			bDat.write(String.valueOf(n));	// upisuje prvo dimenziju vektora
			bDat.newLine();						// i udara nov red
				
			for (int i=0; i<n; i++)	// Petlja u trajanju vektora
			{
				bDat.write(String.valueOf(niz[i]));	// upisuje element vektora pretvoren u string
				bDat.newLine();			// nov red
			}
			bDat.close();
		}

	//----------- CITANJE IZ BINARNE DATOTEKE ---------------
		public void read (String fileName) throws IOException
		{
			FileInputStream dat;
			
			dat = new FileInputStream (fileName);
			BufferedInputStream bDat;
			bDat = new BufferedInputStream(dat);
				
			DataInputStream dataDat;
			dataDat = new DataInputStream(bDat);
				
			n = dataDat.readInt();
			niz = new float[n];
			
			for (int i=0; i<n; i++)
				niz[i] = dataDat.readFloat();
				
			dataDat.close();
		}
		
	// ---------------- UPIS U BINARNU DATOTEKU --------------------
		public void write (String fileName) throws IOException
		{
			FileOutputStream dat;
			
			dat = new FileOutputStream(fileName);
				
			BufferedOutputStream bDat;
			bDat = new BufferedOutputStream(dat);
				
			DataOutputStream dataDat;
			dataDat = new DataOutputStream(bDat);
				
			dataDat.writeInt(n);	// upisuje prvo dimenziju vektora
				
			for (int i=0; i<n; i++)
			{
				dataDat.writeFloat(niz[i]);	// upis u faj, broj po broj
			}
				
			dataDat.close();
		}

		public void sort()
		{
			for (int i=0; i<n-1; i++)
			{
				int imin = i;
				
				for (int j=i+1; j<n; j++)
				{
					if (niz[j]<niz[imin])
						imin = j;
					float pom = niz[imin];
					niz [imin] = niz [i];
					niz[i] = pom;
				}
			}
		}
		
		public void printVector()
		{
			for (int i=0; i<n; i++)
				System.out.println(niz[i]);
		}
    
}
