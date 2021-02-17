

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		System.out.println();
		
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 400;
		segundaConta.agencia = 10;
		segundaConta.numero = 1;
		segundaConta.titular = "Benedito";
		
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		System.out.print(segundaConta.titular);
		
	}

}
