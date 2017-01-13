package ejercicio10;

public class Rectangulo extends Figura {

	static double areaTotal = 0;

	public Rectangulo(int l1, int l2) {
		this.setArea(l1 * l2);
		Rectangulo.areaTotal += this.getArea();
		Figura.areaTotal += this.getArea();
		this.setPerimetro(2 * l1 + 2 * l2);
	}

}
