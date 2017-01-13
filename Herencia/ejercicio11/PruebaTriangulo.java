package ejercicio11;

public class PruebaTriangulo {

	public static void main(String[] args) {
		// Crear puntos
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 5);
		Punto p3 = new Punto(3, 8);
		// Crear tri�ngulo
		Triangulo t1 = new Triangulo("triangulo1", p1, p2, p3);
		// Imprimir datos
		System.out.println(t1.toString());
		System.out.println("�rea: " + t1.calcularArea());
	}

}
