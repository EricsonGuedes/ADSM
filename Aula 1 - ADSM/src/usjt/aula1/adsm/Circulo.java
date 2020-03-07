package usjt.aula1.adsm;

public class Circulo extends Figura {
	
	protected double raio;
	

	public Circulo(double raio) {
		this.raio = raio;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}


	@Override
	public String toString() {
		return "Circulo [Area=" + area() + "]";
	}
	
	

}
