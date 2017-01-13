package ejercicio11;

public class Cuadrado extends Figura {
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;
	private Punto vertice4;

	public Cuadrado(String nombre, Punto diagonalVertice1, Punto diagonalVertice3) {
		super(nombre);
		vertice1 = diagonalVertice1;
		vertice3 = diagonalVertice3;
		calculaOtraDiagonal(diagonalVertice1, diagonalVertice3);
	}

	private void calculaOtraDiagonal(Punto Vertice1, Punto Vertice3) {
		Punto v2 = new Punto(vertice3.getX(), vertice1.getY());
		vertice2 = v2;
		Punto v4 = new Punto(vertice1.getX(), vertice3.getY());
		vertice4 = v4;
	}

	public double calcularArea() {
		double base, altura;
		base = vertice1.calcularDistancia(vertice2.getX(), vertice2.getY());
		altura = vertice1.calcularDistancia(vertice4.getX(), vertice4.getY());
		return base * altura;
	}

	public String esRegular() {
		return "REGULAR";
	}

	public String toString() {

		return "CUADRADO [NOMBRE= " + this.getNombre() + "]: VERTICES " + vertice1.toString() + ", "
				+ vertice2.toString() + ", " + vertice3.toString() + ", " + vertice4.toString();
	}
}
