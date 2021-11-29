public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobil a=null;
        int max_brzina=350;
        try{
            a=new Automobil(false,max_brzina,10,8,false);
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
            if(max_brzina<80)
                max_brzina=80;
            else if(max_brzina>300)
                max_brzina=300;
            try {
                a=new Automobil(false,max_brzina,10,8,false);
            } catch (Exception ex) {
                System.out.println("Exception"+e);
            }
        }
        finally{
            System.out.println("Trenutna max brzina je="+a.getMax_brzina());
        }
        
        a.otvoriVrata();
        a.zatvoriVrata();
        a.ukljuci();
        try {
            a.ubrzaj();
        } catch (Exception ex) {
            System.out.println("Exception"+ex);
            a.setTrenutna_brzina(a.getMax_brzina());
        }finally{
            System.out.println(a.getTrenutna_brzina());
        }

        try {
            a.uspori();
        } catch (Exception ex) {
            System.out.println("Exception"+ex);
            a.setTrenutna_brzina(0);
        }finally{
            System.out.println(a.getTrenutna_brzina());
        }

	}

}
