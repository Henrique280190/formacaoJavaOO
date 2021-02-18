import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {

    public static void main(String[] args) throws IOException {
    	
    	//Fluxo de entrada com arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Estou cursando Formação Java na plataforma Alura!");
        bw.newLine();
        bw.write("Está sendo bastante corrido, porém muito produtivo!");
        

        bw.close(); 
    }

}
