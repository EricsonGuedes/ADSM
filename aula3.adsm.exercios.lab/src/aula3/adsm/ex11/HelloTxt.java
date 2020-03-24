package aula3.adsm.ex11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloTxt implements HelloWorld {

	private BufferedReader reader;

	@Override
	public String helloworld() {
		  try {
			  String content = "Hello World";
			  File file = new File("output.txt");
			  
			  if (!file.exists()) {
	                file.createNewFile();
	            }
			  
	            FileWriter fw = new FileWriter(file.getAbsoluteFile());
	            BufferedWriter bw = new BufferedWriter(fw);
	            
	            // Escreve e fecha arquivo
	            bw.write(content);
	            bw.close();
	            
	            FileReader ler = new FileReader("output.txt");
	            reader = new BufferedReader(ler);  
	            String linha;
	            while( (linha = reader.readLine()) != null ){
	                System.out.println(linha);
	            }

	            // Imprime confirmacao
	            System.out.println("Feito =D");
			  
		  }  catch (IOException e) {
	            e.printStackTrace();
	           
		  } return null;
 
		}
	}
