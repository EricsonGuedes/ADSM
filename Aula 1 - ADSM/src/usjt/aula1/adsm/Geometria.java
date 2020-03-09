package usjt.aula1.adsm;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Circulo(10));
		figuras.add(new Triangulo(4,4));
		figuras.add(new Losango(5,2));
		figuras.add(new Retangulo(10,10));
		figuras.add(new Quadrado(4));
		figuras.add(new Trapezio(5,10,4));
		figuras.add(new Cilindro (5,4));
		figuras.add(new Esfera (5));
		figuras.add(new Cubo (5,5));
		figuras.add(new Piramide (5,5));
		
		
		for(Figura fig:figuras){
			System.out.println("--------------------------------------");
			System.out.println(fig);

		}

	}
}