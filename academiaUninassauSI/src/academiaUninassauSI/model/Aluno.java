package academiaUninassauSI.model;

/**
 * @author Maxwell.Costa
 * @description Para instanciar essa classe é necessario informar os seguintes dados
 * String nome, String cpf, int idade, double altura, double peso, boolean status , int p
 * @since 2021-02-04*/
public class Aluno extends Pacote{

	private String nome;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	private boolean status = false;

	public Aluno(String nome, String cpf, int idade, double altura, double peso, boolean status , int p) {
		super(p);
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Nome   :\t").append(getNome())
		  .append("\n CPF    :\t").append(getCpf())
		  .append("\n Idade  :\t").append(getIdade())
		  .append("\n Altura :\t").append(getAltura())
		  .append("\n Peso   :\t").append(getPeso())
		  .append("\n Status :\t").append((isStatus()!= false)? "ATIVO" : "INATIVO");	
				
		 sb.append("\n Plano  :\t").append(getPlano());
		                  
		return sb.toString();
	}
	
	
}
