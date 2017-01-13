package ejercicio6;

import java.io.IOException;

public class BiblioString {

	static String concatenar() throws IOException {
		String t, res = "";
		boolean fin = false;
		do {
			System.out.print("Escriba texto ('Fin' para acabar): ");
			t = Consola.leeString();
			if (t.equalsIgnoreCase("fin")) {
				System.out.println("Fin del programa");
				fin = true;
			} else {
				res = res + t;
				System.out.println(res);
				fin = false;
			}
		} while (fin == false);
		return res;
	}

	static int sustituir(String s, char a, char b) throws IOException {
		int contcambios = 0;
		System.out.print("Escriba el texto a modificar: ");
		s = Consola.leeString();
		System.out.print("Escriba el carácter a cambiar: ");
		a = Consola.leeChar();
		System.out.print("Escriba el carácter nuevo: ");
		b = Consola.leeChar();
		for (int cont = 0; cont < s.length(); cont++) {
			if (s.charAt(cont) == a) {
				contcambios = contcambios + 1;
			}
		}
		s = s.replace(a, b);
		return contcambios;
	}

	static String eliminarCar(String s, char a) throws IOException {
		System.out.print("Escriba el texto a cambiar: ");
		s = Consola.leeString();
		System.out.print("Escriba el carácter a eliminar: ");
		a = Consola.leeChar();
		s = s.replaceAll(Character.toString(a), "");
		System.out.println("El resultado es " + s);
		return s;
	}

	static String completar$(String s, int n) throws IOException {
		int cant = 0;
		System.out.print("Escriba un texto: ");
		s = Consola.leeString();
		System.out.print("Escriba la longitud deseada: ");
		n = Consola.leeInt();
		if (n <= s.length()) {
			return ("Error. La longitud debe ser mayor que el texto introducido.");
		} else {
			cant = n - s.length();
			for (int cont = 1; cont <= cant; cont++) {
				s = s + "$";
			}
		}

		return ("La operación se ha realizado con éxito. El resultado es " + s);
	}

	static void verPalabras(String s) throws IOException {
		int i, f;
		String res = "";
		System.out.print("Escriba un texto (varias palabras): ");
		s = Consola.leeString();
		do {
			i = 0;
			f = s.indexOf(' ');
			if (f == -1) {
				System.out.println(s.toUpperCase().substring(i));
				f = s.length();
				s = s.substring(f);
			} else {
				res = s.toUpperCase().substring(i, f);
				s = s.substring(f + 1);
				System.out.println(res);
			}
		} while (s.length() > 0);
	}

	static void verPalabrasAlReves(String s) throws IOException {
		String res = "";
		System.out.print("Escriba un texto (varias palabras): ");
		s = Consola.leeString();
		do {
			res = s.toLowerCase().substring(s.lastIndexOf(' ') + 1, s.length());
			s = s.substring(0, s.lastIndexOf(' ') + 1);
			s = s.trim();
			System.out.println(res);
		} while (s.length() > 0);
	}
}
