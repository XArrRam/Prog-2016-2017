package pruebas;

import paquete2D.Circulo;
import paquete2D.Rectangulo;
import paquete3D.Cilindro;
import paquete3D.Esfera;

public class Principal {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(10);
		Rectangulo r1 = new Rectangulo(3, 4);
		Cilindro ci1 = new Cilindro(10, 5);
		Esfera e1 = new Esfera(10, 5);
		System.out.println("El área del círculo es " + c1.area());
		System.out.println("El área del rectángulo es " + r1.area());
		System.out.println("El volumen del cilindro es " + ci1.volumen());
		System.out.println("El volumen de la esfera es " + e1.volumen());
	}

}
