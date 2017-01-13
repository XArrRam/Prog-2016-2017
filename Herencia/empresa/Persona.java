package empresa;

public class Persona {
	private String nombre, dni;
	private int altura, peso;

	Persona(String n, String d, int a, int p) {
		nombre = n;
		dni = d;
		altura = a;
		peso = p;
	}

	Persona(String d) {
		nombre = "*******";
		dni = d;
		altura = 0;
		peso = 0;
	}

	public String toString() {
		return ("El nombre de la persona es " + nombre + " y su peso es de " + peso + "kg");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
