package exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;
import entitiesFixacao.Retangulo;

public class exercicio1_aula70 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();	
		
		
		System.out.println("Entre com a altura e largura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("AREA = %.2f%n", retangulo.perimetro());
		System.out.printf("AREA = %.2f%n", retangulo.diagonal());
	}

}
