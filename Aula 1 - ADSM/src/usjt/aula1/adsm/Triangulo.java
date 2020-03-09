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
	/*Como estamos utilizando um triangulo cujo a base e altura são conhecidos,
	podemos utilzar a formula de pitagoras*/
	public double perimetro() {
		return (2 * Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2))) + 2 * base;
	}

	@Override
	public String toString() {
		return "Triangulo [Area =" + area() + " Perimetro = " + perimetro() +  "]";
	}





	

}
