package usjt.aula1.adsm;

public class Piramide extends Quadrado implements Volume {

	public Piramide(double lado,double altura) {
		super(lado);
		this.altura = altura;
	}

	@Override
	public double volume() {
		return (area() * altura) * 1/3;
	}

	@Override
	public String toString() {
		return "Piramide [volume()=" + volume() + "]";
	}
	

}
