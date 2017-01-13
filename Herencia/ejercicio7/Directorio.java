package ejercicio7;

public class Directorio {
	private String nombre;
	private int tamaño;
	private final int MAXCAR = 40;

	Directorio(String n, int t) {
		nombre = n;
		tamaño = t;
	}

	void ver() {
		System.out.println("Directorio--> " + this.nombre);
		System.out.println("Tamaño: " + this.tamaño + "B");
	}

	int niveles() {
		int nivel = 1;
		for (int cont = 0; cont < this.nombre.length(); cont++) {
			if (this.nombre.charAt(cont) == '/') {
				nivel += 1;
			}
		}
		return nivel;
	}

	String ultimo() {
		return this.nombre.substring(this.nombre.lastIndexOf('/') + 1);
	}

	boolean ilegal() {
		boolean ilegal = false;
		for (int cont = 0; cont < this.nombre.length(); cont++) {
			if (this.nombre.charAt(cont) == '*' || this.nombre.charAt(cont) == '#' || this.nombre.charAt(cont) == '@') {
				ilegal = true;
			}
		}
		return ilegal;
	}

	String dirValido() {
		String res = "";
		if (this.nombre.length() > MAXCAR) {
			res += "Error: el nombre del directorio es demasiado largo. ";
		}
		if (this.ilegal() == true) {
			res += "Error: el nombre del directorio contiene caracteres ilegales. ";
		}
		for (int cont = 0; cont < this.nombre.length(); cont++) {
			if (cont > 0 && this.nombre.charAt(cont) == '/'
					&& this.nombre.charAt(cont) == this.nombre.charAt(cont - 1)) {
				res += "Error: el nombre del directorio contiene dos '/' contiguos. ";
			}
		}
		if (Character.toLowerCase(this.nombre.charAt(0)) > 'a' && Character.toLowerCase(this.nombre.charAt(0)) < 'z'
				&& this.nombre.charAt(1) == ':') {
		} else {
			res += "Error: el nombre del directorio no comienza por una unidad de disco. ";
		}
		if (res.equalsIgnoreCase("")) {
			res = "OK";
		}
		return res;
	}

	void compactarDir() {
		this.nombre.trim();
		for (int cont = 0; cont < this.nombre.length(); cont++) {
			if (this.nombre.charAt(cont) == ' ') {
				this.nombre = this.nombre.replaceAll(Character.toString(' '), "");
			}
		}
		this.nombre = this.nombre.toLowerCase();
	}

	public static void main(String[] args) {
		/*
		 * String n1, n2; int t1, t2;
		 */

		// Crear directorios
		Directorio d1 = new Directorio("C:/Program Files/Windows Defender/es-ES", 1065245);
		Directorio d2 = new Directorio("D:/User*/dw1//Music", 5462);

		/*
		 * n1 = Consola.leeString(); t1 = Consola.leeInt(); n2 =
		 * Consola.leeString(); t2 = Consola.leeInt();
		 * 
		 * Directorio d1 = new Directorio(n1, t1); Directorio d2 = new
		 * Directorio(n2, t2);
		 */

		// Visualizar
		d1.ver();
		d2.ver();
		System.out.println("----------------------------");
		// Sumar tamaños
		d2.tamaño += d1.tamaño / 2;
		// Visualizar tamaño descompuesto
		System.out.println("El tamaño del directorio '" + d1.nombre + "' es de " + d1.tamaño / (1024 * 1024) + " MB, "
				+ (d1.tamaño % (1024 * 1024)) / 1024 + " KB, y " + d1.tamaño % 1024 + " Bytes.");
		System.out.println("----------------------------");
		// Comparar tamaños
		if (d1.niveles() > d2.niveles()) {
			System.out.println("El directorio 1 tiene una ruta con más niveles (" + d1.niveles() + ").");
		} else {
			System.out.println("El directorio 2 tiene una ruta con más niveles (" + d2.niveles() + ").");
		}
		System.out.println("----------------------------");
		// Visualizar si son válidos
		System.out.println(d1.nombre);
		System.out.println(d1.dirValido());
		System.out.println("----------------------------");
		System.out.println(d2.nombre);
		System.out.println(d2.dirValido());
		System.out.println("----------------------------");
		// Comparar el último nivel y visualizar
		if (d1.ultimo().equals(d2.ultimo()) == false) {
			System.out.println("LOS ÚLTIMOS NIVELES SON DIFERENTES");
			d1.nombre = "X" + d1.nombre;
			d2.nombre = "X" + d2.nombre;
		}
		else{
			System.out.println("LOS ÚLTIMOS NIVELES SON IGUALES");
		}
		d1.ver();
		d2.ver();
		System.out.println("----------------------------");
		// Compactar rutas y visualizar
		System.out.println("COMPACTAR DIRECTORIOS");
		d1.compactarDir();
		d2.compactarDir();
		d1.ver();
		d2.ver();
		System.out.println("----------------------------");
	}

}
