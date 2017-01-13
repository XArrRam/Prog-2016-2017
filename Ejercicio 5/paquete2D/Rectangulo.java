package paquete2D;

public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo(double b, double a) {
		base = b;
		altura = a;
	}

	public double area() {
		return (this.base * this.altura);
	}

}
