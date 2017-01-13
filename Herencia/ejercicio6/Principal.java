package ejercicio6;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		/*
		 * Las llamadas a los métodos van vacías porque se piden los datos por
		 * teclado
		 */
		BiblioString.concatenar();
		System.out.println("--------------------------");
		System.out.println("Se han cambiado " + BiblioString.sustituir(null, ' ', ' ') + " caracteres");
		System.out.println("--------------------------");
		BiblioString.eliminarCar(null, ' ');
		System.out.println("--------------------------");
		System.out.println(BiblioString.completar$(null, 0));
		System.out.println("--------------------------");
		BiblioString.verPalabras(null);
		System.out.println("--------------------------");
		BiblioString.verPalabrasAlReves(null);
		System.out.println("--------------------------");
		System.out.println("FIN DEL PROGRAMA");

	}

}
