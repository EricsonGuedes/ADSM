package usjt.aula1.adsm;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado ,lado);
	}
	
	@Override
	public double area() {
		return getBase()*getAltura();
	}

	@Override
	public double diagonal() {
		return getAltura()* Math.sqrt(2);
	}

	@Override
	public double perimetro() {
		return 4 * base;
	}
	
	@Override
	public String toString() {
		return "Quadrado [Area =" + area() + ", Diagonal =" + diagonal() + " Perimetro =" + perimetro() + "]";
	}


}
