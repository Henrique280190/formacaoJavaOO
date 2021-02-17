package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObjeto {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
//		
		ContaCorrente cc = new ContaCorrente(2222, 3333);
		ContaPoupanca cp = new ContaPoupanca(4444, 5555);
		
		System.out.println(cc);
        System.out.println(cp);

	}

}
