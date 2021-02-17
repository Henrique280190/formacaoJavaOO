
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaHenrique = new Conta();
		System.out.println(contaHenrique.saldo);

		contaHenrique.deposita(100);
		System.out.println(contaHenrique.saldo);

		contaHenrique.saca(10);
		System.out.println(contaHenrique.saldo);

		Conta contaAlessandra = new Conta();
		contaAlessandra.saldo = 3000;

		contaAlessandra.transferi(1000, contaHenrique);
		System.out.println(contaAlessandra.saldo);
		System.out.println(contaHenrique.saldo);

	}

}
