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
	public double perimetro() {
		return 4 * base;
	}
	@Override
	public String toString() {
		return "Losango [Area =" + area() + " Perimetro = " + perimetro() +"]";
	}



}
