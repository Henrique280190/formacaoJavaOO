
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		
		int idade = 16;
		int quantidadePessoas = 2;
		
		 if (idade >=18){
			 System.out.println("Voc� tem mais de 18 anos!");
		 }else{
			 if (quantidadePessoas >= 2){
				 System.out.println("Voc� ainda � menor de idade, mas por estar acompanhado, pode entrar!");
			 }else{
				 System.out.println("Voc� � menor e esta desacompanhado, n�o pode entrar!");
			 }
			 
		 }
	}

}
