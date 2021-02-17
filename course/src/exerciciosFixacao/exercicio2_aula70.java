package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;
import entitiesFixacao.Salario;

public class exercicio2_aula70 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		System.out.println("Nome: ");
		salario.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		salario.salarioBruto = sc.nextDouble();
		System.out.println("Taxa Imposto: ");
		salario.taxaImposto = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Resultado: " + salario);

		sc.close();
	}

}
