
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection stek=new Stack(10);
        Collection red=new Buffer(10);
        
        for(int i=0;i<10;i++)
            stek.dodaj(i);
        for(int i=0;i<10;i++)
            stek.izbaci();
        for(int i=0;i<10;i++)
            red.dodaj(i);
        for(int i=0;i<10;i++)
            red.izbaci();

	}

}
