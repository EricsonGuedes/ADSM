package usjt.aula1.adsm;

public class Trapezio extends Poligono {
	protected double baseMaior;
	
	public Trapezio (double baseMenor, double baseMaior, double altura) {
		super(baseMenor,altura);
		this.baseMaior = baseMaior;
	}
	
	@Override
	public double area() {
		return ((baseMaior + base) * altura) / 2;
	}


	@Override
	public double perimetro() {
		return 2 * Math.sqrt(Math.pow(baseMaior - base,2)+Math.pow(altura, 2)) + base + baseMaior;
	}
	
	@Override
	public String toString() {
		return "Trapezio [area()=" + area() + ", perimetro()=" + perimetro() + "]";
	}


}
