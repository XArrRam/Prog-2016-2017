package ejercicio10;

public class TestFigura {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		System.out.println("El �rea del c�rculo es " + c1.getArea());
		Cuadrado cu1 = new Cuadrado(3);
		System.out.println("El �rea del cuadrado es " + cu1.getArea());
		Rectangulo r1 = new Rectangulo(4, 5);
		System.out.println("El �rea del rect�ngulo es " + r1.getArea());
		System.out.println("---------------------------------");
		System.out.println("�REAS TOTALES:");
		System.out.println("C�RCULOS: " + Circulo.areaTotal);
		System.out.println("CUADRADOS: " + Cuadrado.areaTotal);
		System.out.println("RECT�NGULOS: " + Rectangulo.areaTotal);
		System.out.println("TOTAL: " + Figura.areaTotal);
		System.out.println("---------------------------------");
		System.out.println("CREAR C�RCULOS...");
		Circulo c2 = new Circulo(3);
		Circulo c3 = new Circulo(1);
		System.out.println("�REAS DE LOS C�RCULOS: " + Circulo.areaTotal);
	}

}
