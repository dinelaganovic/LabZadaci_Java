public class IzuzeciTrougao {

    public static void main(String[] args) {
        Trougao t=null;
        try {
            t=new Trougao(2,3,6);
            System.out.println(t.obim());
        } catch (Exception ex) {
            System.out.println("Exception: "+ex);
        }
    }
    
}
