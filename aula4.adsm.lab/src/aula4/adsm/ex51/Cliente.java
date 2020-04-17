package aula4.adsm.ex51;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	long id;
	String nome;
	int idade;
	
	public Cliente(long id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
	}
	
	

}
