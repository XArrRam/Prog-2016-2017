package ejercicio3;

public class Piolin extends Canario {
	@SuppressWarnings("unused")
	private int numero;

	Piolin(char s, int e, float t, int n, String nombre, String nombredue�o) {
		super(s, e, t);
		numero = n;
		getNombres().setNombre(nombre);
		getNombres().setNombredue�o(nombredue�o);
	}

	void cantar() {
		System.out.println("Mi nombre es " + this.getNombres().getNombre() + ", Pio pio soy un Piol�n");
	}
}
