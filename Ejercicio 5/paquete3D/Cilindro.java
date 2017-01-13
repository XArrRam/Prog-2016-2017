package paquete3D;

import paquete2D.Circulo;

public class Cilindro {
	private double radio;
	private double altura;

	public Cilindro(double r, double a) {
		radio = r;
		altura = a;
	}

	public double volumen() {
		Circulo c1 = new Circulo(this.radio);
		return (this.altura * c1.area());
	}

}
