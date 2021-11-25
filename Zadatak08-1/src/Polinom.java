
public class Polinom {
    private int stepen;
    private int[] koeficijenti;
    
    public Polinom(int stp){
        stepen=stp;
        koeficijenti=new int[stepen+1];
    }
    
    public void setKoeficijent(int i,int value){
        if(i>stepen)
            System.out.println(stepen+"Ne postoji clan sa datim stepenom"+i);
        else
            koeficijenti[i]=value;
        
    }
    
    public int getKoeficijent(int i){
        if(i>stepen)
            return 0;
        else
            return koeficijenti[i];
    }
    
    public int getStepen(){
        return stepen;
    }
    
    public Polinom izvod(){
        Polinom k=new Polinom(getStepen()-1);
        for(int i=1;i<=getStepen();i++){
            k.setKoeficijent(i-1, i*getKoeficijent(i));
        }
        return k;
    }
    
    public void stampaj(){
        for(int i=0;i<=stepen;i++){
            System.out.print(koeficijenti[i]+"x^"+i+" ");
        }
        System.out.println();
    }
}
