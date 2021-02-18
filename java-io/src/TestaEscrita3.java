import java.io.IOException;
import java.io.PrintStream;

public class TestaEscrita3 {

	public static void main(String[] args) throws IOException {

		// //Fluxo de entrada com arquivo
		// OutputStream fos = new FileOutputStream("lorem2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);

		// BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		// FileWriter fw = new FileWriter("lorem2.txt");
		// BufferedWriter bw = new BufferedWriter(fw);

		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("Testando inser��o de texto!");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Testando o pula linha...");
		ps.print("e tambem tentando inserir texto na mesma linha!");

		ps.close();
	}

}
