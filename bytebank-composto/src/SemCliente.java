
public class SemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcala = new Conta();
		
		contaDaMarcala.titular = new Cliente();
		
		contaDaMarcala.titular.nome = "Marcela";
		contaDaMarcala.deposita(1000);
		
		System.out.println(contaDaMarcala.titular.nome);
		System.out.println(contaDaMarcala.getSaldo());
		
		contaDaMarcala.saca(50);
		System.out.println(contaDaMarcala.getSaldo());
		
	}

}
