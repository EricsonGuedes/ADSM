package usjt.aula1.adsm;

public class Cubo extends Quadrado implements Volume{

	protected double altura;
	
	public Cubo(double lado, double altura) {
		super(lado);
		this.altura = altura;

	}

	@Override
	public double volume() {
		return area() * altura;
	}

	@Override
	public String toString() {
		return "Cubo [volume()=" + volume() + "]";
	}
	

}
