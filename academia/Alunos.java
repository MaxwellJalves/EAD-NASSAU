/**
 * @author Maxwell.costa
 * @description Infome o nome , cpf,idade,altura,peso e status do aluno (Boolean)
 */
public class Alunos{

    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private double peso;
    private String status; //true ativo  :false Inativo


    public Alunos(String n, String c, int i,double a, double p, boolean s){
        this.nome = n;
        this.cpf = c;
        this.idade = i;
        this.altura = a;
        this.peso = p;
        this.status = (!s)? "Inativo" : "Ativo" ;
    }
    public Alunos() {
	}
	public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String c){
        this.cpf = c;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int i){
        if(i != 0){
            this.idade = i;
        }else{
            System.out.println("Valor informado não é um número inteiro");
        }
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double p){
        this.peso = p;
    }

    public String getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = (!s)? "Ativo" : "Inativo" ;
    }

    public String listar_dados(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome : \t").append(getNome())
          .append("\nCPF  : \t").append(getCpf())
          .append("\nIdade : \t").append(getIdade())
          .append("\nAltura: \t").append(getAltura())
          .append("\nPeso :  \t").append(getPeso())
          .append("\nStatus: \t").append(getStatus());
        return sb.toString();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome : \t").append(getNome())
          .append("\nCPF  : \t").append(getCpf())
          .append("\nIdade : \t").append(getIdade())
          .append("\nAltura: \t").append(getAltura())
          .append("\nPeso :  \t").append(getPeso())
          .append("\nStatus: \t").append(getStatus());
        return sb.toString();
    }
}