package ejercicio10;

public class Circulo extends Figura {

	static double areaTotal = 0;

	public Circulo(int r) {
		this.setArea(Math.PI * r * r);
		Circulo.areaTotal += this.getArea();
		Figura.areaTotal += this.getArea();
		this.setArea(2 * Math.PI * r);
	}

}
