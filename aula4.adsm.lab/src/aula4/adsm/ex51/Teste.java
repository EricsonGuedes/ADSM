package aula4.adsm.ex51;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Teste {
	public static void main(String[] args) {
		escreverObjeto();
		IOFacade ioFacade = new IOFacade();
		System.out.println(ioFacade.abrirTexto("teste.txt"));
		System.out.print("Arquivo binário (bytes lidos): ");
		for (byte b : ioFacade.abrirBinario("teste.txt")) {
			System.out.print(b + " ");
		};
		System.out.println("\nArquivo com objeto: " + ioFacade.abrirObjeto("cliente.obj"));

	}
	
	private static void escreverObjeto() {
		Cliente cliente = new Cliente(1, "Lili", 9);
		try {
			FileOutputStream fileOut = new FileOutputStream("cliente.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(cliente);
			objectOut.close();
		} catch (Exception ex) {
			System.out.println("NÃo foi possível escrever o objeto.");
			ex.printStackTrace();
		}
	}
}
