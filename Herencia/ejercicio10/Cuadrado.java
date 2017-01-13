package ejercicio10;

public class Cuadrado extends Figura {

	static double areaTotal = 0;

	public Cuadrado(int l) {
		this.setArea(l * l);
		Cuadrado.areaTotal += this.getArea();
		Figura.areaTotal += this.getArea();
		this.setPerimetro(l * 4);
	}

}
