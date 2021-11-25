
public class Polinom {
    private int stepen;
    private int[] koeficijenti;
    
    public Polinom(int stp){
        stepen=stp;
        koeficijenti=new int[stepen+1];
    }
    
    public void setKoeficijent(int i,int value){
        // Proverava da li je dati INDEX validan, ako jeste, postavlja vrednost koeficijenta na toj poziciji na zeljenu vrednost
        if(i>stepen)
            System.out.println(stepen+"Ne postoji clan sa datim stepenom"+i);
        else
            koeficijenti[i]=value;
        
    }
    
    public int getKoeficijent(int i){
        // Proverava da li je dati INDEX validan, ako jeste vraca koeficijent uz dati stepen
        if(i>stepen)
            return 0;
        else
            return koeficijenti[i];
    }
    
    public int getStepen(){
        return stepen;
    }
    
    public Polinom mnozi(Polinom p){
        int stepenProizvoda=p.getStepen()+this.getStepen();
        Polinom proizvod=new Polinom(stepenProizvoda);
        for(int i=0;i<=this.getStepen();i++)
            for(int j=0;j<=p.getStepen();j++)
                proizvod.setKoeficijent(i+j, proizvod.getKoeficijent(i+j)+this.getKoeficijent(i)*p.getKoeficijent(j));
            
        return proizvod;
    }
    public void stampajKoeficijente(){
        for(int i=0;i<=stepen;i++){
            System.out.println("Koeficijent uz "+i+"-ti stepen "+koeficijenti[i]);
        }
    }
}
