package aula5.adsm.ex81;

public class Teste {
	
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		new Consumidor("Carlos Eduardo", noticiario);
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milh�es de c�pias vendidas em 5 dias", 13, 04, "Games");
		new Consumidor("Erika Guedes", noticiario);
		noticiario.notificaNoticia("Assassin's Creed 2 est� gratuito para PC", 14, 04, "Games");
		new Consumidor("Ericson Guedes", noticiario);
		noticiario.notificaNoticia("M�dicos preveem que Brasil n�o volta ao normal antes de agosto", 14, 04, "Sa�de");
		noticiario.notificaNoticia("Xiaomi lan�a purificador de ar capaz de eliminar o v�rus H1N1.", 15, 04, "T�cnologia");

	}

}
