public class Trougao {
    private int a;
    private int b;
    private int c;
    Trougao(int a,int b,int c) throws StranicaNulaException,NijeTrougaoException{
        if(a==0 || b==0 || c==0)
            throw (new StranicaNulaException());
        if(!cineTrougao(a,b,c))
            throw (new NijeTrougaoException());
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private boolean cineTrougao(int a,int b,int c){
        return a+b>c && a+c>b && b+c>a;
    }
    public int obim(){
        return a+b+c;
    }
    
}
