package aula3.adsm.ex21;

public class Programa {

	public static void main(String[] args) {
		String[] lista = {"McNealy, Scott", "James Gosling", "Naughton, Patrick"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
	}

}
