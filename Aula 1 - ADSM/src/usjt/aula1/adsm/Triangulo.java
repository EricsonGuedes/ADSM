package usjt.aula1.adsm;

public class Triangulo extends Poligono {
	
	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (getBase()*getAltura())/2;
	}

	@Override
	public String toString() {
		return "Triangulo [Area =" + area() + "]";
	}



	

}
