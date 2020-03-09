package usjt.aula1.adsm;

public class Triangulo extends Poligono {
	
	protected double ladoA;
	protected double ladoB;
	
	public Triangulo(double ladoA, double ladoB, double base, double altura) {
		super(base/2, altura);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		
	}
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}



	@Override
	public double area() {
		return (getBase()*getAltura())/2;
	}
	
	@Override
	public double perimetro() {
		return ladoA + ladoB + base;
	}

	@Override
	public String toString() {
		return "Triangulo [Area =" + area() + " Perimetro = " + perimetro() +  "]";
	}
	

}
