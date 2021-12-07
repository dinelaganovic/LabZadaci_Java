public class Tape {
	private String [] contents ;
	public Tape(String [] n) {
		for(int i=0; i<n.length; i++) {
		this.contents[i]=n[i];
		}
	}
	public String[] getContents() {
	 return contents;
	}
	}	
