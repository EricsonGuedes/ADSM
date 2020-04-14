package aula5.adsm.ex81;

public class Consumidor {
	private NoticiarioAssina noticiario;
	private String nome;
	
	public Consumidor(String nome, NoticiarioAssina noticiario) {
		this.noticiario = noticiario;
		this.nome = nome;
		this.noticiario.inscrever(this);
	}
	
	public void update() {
		System.out.println(nome + " recebeu a noticia: " + noticiario.getNoticia().toString());
	}
	
	public String getNome() {
		return this.nome;
	}
	

}
