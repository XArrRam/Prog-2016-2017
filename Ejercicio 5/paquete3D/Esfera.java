package paquete3D;

public class Esfera {
	private double radio;
	private double altura;

	public Esfera(double r, double a) {
		radio = r;
		altura = a;
	}

	public double volumen() {
		Cilindro ci1 = new Cilindro(this.radio, this.altura);
		return (2 * ci1.volumen() / 3);
	}

}
