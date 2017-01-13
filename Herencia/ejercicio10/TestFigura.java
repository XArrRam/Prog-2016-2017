package ejercicio10;

public class TestFigura {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		System.out.println("El área del círculo es " + c1.getArea());
		Cuadrado cu1 = new Cuadrado(3);
		System.out.println("El área del cuadrado es " + cu1.getArea());
		Rectangulo r1 = new Rectangulo(4, 5);
		System.out.println("El área del rectángulo es " + r1.getArea());
		System.out.println("---------------------------------");
		System.out.println("ÁREAS TOTALES:");
		System.out.println("CÍRCULOS: " + Circulo.areaTotal);
		System.out.println("CUADRADOS: " + Cuadrado.areaTotal);
		System.out.println("RECTÁNGULOS: " + Rectangulo.areaTotal);
		System.out.println("TOTAL: " + Figura.areaTotal);
		System.out.println("---------------------------------");
		System.out.println("CREAR CÍRCULOS...");
		Circulo c2 = new Circulo(3);
		Circulo c3 = new Circulo(1);
		System.out.println("ÁREAS DE LOS CÍRCULOS: " + Circulo.areaTotal);
	}

}
