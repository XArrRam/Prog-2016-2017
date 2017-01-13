package paquete2D;

public class Circulo {
	private double radio;

	public Circulo(double r) {
		radio = r;
	}

	public double area() {
		return ((this.radio * this.radio) * Math.PI);
	}

}
