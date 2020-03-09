package usjt.aula1.adsm;

public class Esfera extends Circulo implements Volume{

	public Esfera(double raio) {
		super(raio);

	}

	@Override
	public double volume() {
		return (4/3) * Math.PI * Math.pow(raio, 3);
	}
	
	@Override
	public String toString() {
		return "Esfera [volume()=" + volume() + "]";
	}

}
