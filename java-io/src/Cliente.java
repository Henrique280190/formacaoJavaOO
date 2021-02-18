import java.io.Serializable;

/**
 * Classe que representa um cliente Bytebank
 * 
 * @author henri
 * version 0.1
 */

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 9205117266306915548L;
	
	private String nome;
	private String CPF;
	private String profissao;
	
	
	public String getNomeCpf(){
		return nome + "," + CPF;
	}
	
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
