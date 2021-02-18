import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// //Fluxo de entrada com arquivo
		// OutputStream fos = new FileOutputStream("lorem2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipsing elit, sed do eiusmond");
		bw.newLine();
		bw.newLine();
		bw.write("Est� sendo bastante corrido, por�m muito produtivo!");

		fw.close();
	}

}
