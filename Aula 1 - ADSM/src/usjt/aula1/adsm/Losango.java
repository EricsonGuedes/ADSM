package usjt.aula1.adsm;

public class Losango extends Poligono {
	
	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}

	@Override
	public String toString() {
		return "Losango [Area =" + area() + "]";
	}

}
