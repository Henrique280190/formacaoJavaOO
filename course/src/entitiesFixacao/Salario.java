package entitiesFixacao;

public class Salario {
	
	public String nome;
	public double salarioBruto;
	public double taxaImposto;
	
	
	public double salarioLiquido() {
		return salarioBruto - taxaImposto ;
	}
	
	public void impostoSalario (double porcentagem){
		salarioBruto += salarioBruto * taxaImposto / 100;
	}
	
	public String toString(){
		return nome + ", $" + String.format("%.2f", salarioLiquido());
	}
}
