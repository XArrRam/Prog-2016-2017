package ejercicio11;

public class Triangulo extends Figura {
	private Punto v1, v2, v3;

	public Triangulo(String nombre, Punto v1, Punto v2, Punto v3) {
		super(nombre);
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public String calcularLongitudLados() {
		return "1ª posicion: " + v1.calcularDistancia(v2.getX(), v2.getY()) + "2ª posicion: "
				+ v2.calcularDistancia(v3.getX(), v3.getY()) + "3ª posicion: "
				+ v3.calcularDistancia(v1.getX(), v1.getY());
	}

	public double calcularArea() {
		double area, base, altura;
		base = v1.calcularDistancia(v2.getX(), v2.getY());
		altura = Math.sqrt(Math.pow(v1.calcularDistancia(v3.getX(), v3.getY()), 2)
				- Math.pow(v1.calcularDistancia(v2.getX(), v2.getY()) / 2, 2));
		area = base * altura / 2;
		return area;

	}

	public String esRegular() {
		boolean regular = false;
		if (v1.calcularDistancia(v2.getX(), v2.getY()) == v2.calcularDistancia(v3.getX(), v3.getY())
				&& v2.calcularDistancia(v3.getX(), v3.getY()) == v3.calcularDistancia(v1.getX(), v1.getY())) {
			regular = true;
		}
		if (regular == true) {
			return "REGULAR";
		} else {
			return "NO REGULAR";
		}
	}

	public String toString() {
		return "TRIANGULO [NOMBRE= " + this.getNombre() + "] [" + this.esRegular() + "] : VÉRTICES " + v1.toString()
				+ "," + v2.toString() + "," + v3.toString();
	}
}
