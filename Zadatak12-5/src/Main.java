
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum d=null;
        int dan=5;
        int mesec=1;
        int godina=0;
        try {
            d=new Datum(dan,mesec,godina);
        } catch (Exception ex) {
            System.out.println("Exception:"+ex);
        }
        d.prikaz();
        System.out.println(d.danPoRedu());
        for(int i=0;i<87;i++){
            try {
                d.danNazad();
            } catch (Exception ex) {
                System.out.println("Exception"+ex);
                break;
            }
        }
        d.prikaz();
        System.out.println(d.danPoRedu());

	}

}
