package aula5.adsm.ex81;

public class Teste {
	
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		new Consumidor("Carlos Eduardo", noticiario);
		noticiario.notificaNoticia("Resident Evil 3 chega a mais de 2 milhões de cópias vendidas em 5 dias", 13, 04, "Games");
		new Consumidor("Erika Guedes", noticiario);
		noticiario.notificaNoticia("Assassin's Creed 2 está gratuito para PC", 14, 04, "Games");
		new Consumidor("Ericson Guedes", noticiario);
		noticiario.notificaNoticia("Médicos preveem que Brasil não volta ao normal antes de agosto", 14, 04, "Saúde");
		noticiario.notificaNoticia("Xiaomi lança purificador de ar capaz de eliminar o vírus H1N1.", 15, 04, "Técnologia");

	}

}
