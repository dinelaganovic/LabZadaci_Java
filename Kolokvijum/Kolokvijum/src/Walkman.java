public class Walkman implements PortablePlayer {
	private String [] songs;
	private int current;
	String tekst;

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return tekst;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
	if(current ==songs.length) {
		current=songs.length;
	}else {
		current++;
	}
	}

	@Override
	public void prev() {
		// TODO Auto-generated method stub
		if(current ==1) {
			current=1;
		}else {
			current--;
		}

	}
	
	public void ffwd(int br) {
		for(int i=0;i<br;i++) {
			next();
		}
	}
    public void rew(int br) {
    	for(int i=0;i<br;i--) {
			prev();
		}
	}
    public void rec(String s) {
		if(current==songs.length) {
			int i=current+1;
			songs[i]=s;
			current=songs.length;
		}
	}
    public void load(Tape t) {
		t.getContents();
		current=1;
	}
    public void eject(Tape t) {
    	t.getContents().length=0;
		current=0;
		System.out.println("Kaseta je izbacena!");
	}

}
