package usjt.aula1.adsm;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base ,altura);
	}
	
	@Override
	public double area() {
		return getBase()*getAltura();
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(base, 2)*Math.pow(altura, 2));
	}

	@Override
	public String toString() {
		return "Retangulo [Area =" + area() + ", Diagonal =" + diagonal() + "]";
	}

}
