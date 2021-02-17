// n�o pode instanciar criar objetos dessa classe, pois ela � abstrata
public abstract class Funcionario {

	private String nome;
	private String CPF;
	private double salario;
	
	
	//metodo sem corpo, n�o h� implementa��o
	public 	abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
