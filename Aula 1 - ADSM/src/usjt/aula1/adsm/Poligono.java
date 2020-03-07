package usjt.aula1.adsm;

public abstract class Poligono extends Figura {
	
	
	protected double base;
	protected double altura;

	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Poligono [Base=" + base + ", Altura=" + altura + "]";
	}


}
