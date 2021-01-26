public class Pacotes extends Alunos {
    
    private String plano;
  

    public Pacotes(String n, String c, int i,double a, double p, boolean s,int plano){
        super(n,c,i,a,p,s);
        this.plano = (plano == 1) ?  "PLANOA" : "PLANO B";
    }




    public String getPlano(){
        return this.plano;
    }
    public void setPlano(String p){
        this.plano= p;
    }
    
}
