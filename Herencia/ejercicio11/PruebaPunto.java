package ejercicio11;

import java.io.IOException;

public class PruebaPunto {

	public static void main(String[] args) throws IOException {
		double x, y;

		System.out.print("Introduzca un valor para x: ");
		// x = Consola.leeDouble();
		x = 4.76;
		System.out.print("Introduzca un valor para y: ");
		// y = Consola.leeDouble();
		y = -5.7896;
		System.out.println();
		System.out.println("------------------------------");

		Punto p1 = new Punto(x, y);
		System.out.println("P1: " + p1.toString());
		System.out.println("Distancia al origen (0,0): " + p1.distanciaOrigen());
		System.out.println("Coordenada y=" + p1.getY());
		System.out.println("P1 se encuentra en el cuadrante nº " + p1.calcularCuadrante());
		System.out.println();

		// Como aún no hemos visto los arrays creamos los puntos uno a uno
		System.out.println("Creando puntos.....");
		System.out.println();

		Punto p2 = new Punto(1, 1);
		System.out.println("P2: " + p2.toString());
		Punto p3 = new Punto(5, 3);
		System.out.println("P3: " + p3.toString());
		Punto p4 = new Punto(10, 10);
		System.out.println("P4: " + p4.toString());
		Punto p5 = new Punto(-3, 2);
		System.out.println("P5: " + p5.toString());
		Punto p6 = new Punto(-4, -5);
		System.out.println("P6: " + p6.toString());
		System.out.println();

		System.out.println("Las distancias con respecto a los puntos creados son:");
		System.out.println("P2: " + p1.calcularDistancia(p2.getX(), p2.getY()));
		System.out.println("P3: " + p1.calcularDistancia(p3.getX(), p3.getY()));
		System.out.println("P4: " + p1.calcularDistancia(p4.getX(), p4.getY()));
		System.out.println("P5: " + p1.calcularDistancia(p5.getX(), p5.getY()));
		System.out.println("P6: " + p1.calcularDistancia(p6.getX(), p6.getY()));

		System.out.println(
				"El punto más cercano es: " + p1.calcularMasCercano(p1.calcularMasCercano(p2, p3, p4), p5, p6));
	}

}
