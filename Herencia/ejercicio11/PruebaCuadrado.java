package ejercicio11;

public class PruebaCuadrado {

	public static void main(String[] args) {
		// Crear puntos
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 5);
		// Crear cuadrado
		Cuadrado c1 = new Cuadrado("cuadrado1", p1, p2);
		// Imprimir datos
		System.out.println(c1.toString());
		System.out.println("Área: " + c1.calcularArea());

	}

}
