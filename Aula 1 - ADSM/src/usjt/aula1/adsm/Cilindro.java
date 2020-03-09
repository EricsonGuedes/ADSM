package usjt.aula1.adsm;

public class Cilindro extends Circulo implements Volume{

	protected double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}

	
	@Override
	public double volume() {
		return Math.PI * Math.pow(raio, 3) * altura;
	}
	
	@Override
	public String toString() {
		return "Cilindro [volume()=" + volume() + "]";
	}

}
