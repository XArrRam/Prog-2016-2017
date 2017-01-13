package ejercicio2;

public class Piolin extends Canario {
	int numero;

	Piolin(char s, int e, float t, int n) {
		super(s, e, t);
		numero = n;
	}

	public static void main(String[] args) {

		// Crear instancias de Piol�n y Loro
		Piolin p1 = new Piolin('H', 74, 7, 45);
		Loro l1 = new Loro('M', 35, 'S', "Rojo");

		// Llamar al m�todo quienSoy
		p1.quienSoy();
		l1.quienSoy();
		System.out.println("--------------------------");

		// Llamar al m�todo altura() con Piol�n
		p1.altura();
		System.out.println("--------------------------");

		// Llamar al m�todo deDondeEres() con el loro
		l1.deDondeEres();
		System.out.println("--------------------------");

		// Cambiar el tama�o de Piol�n
		p1.setTama�o(15);
		p1.altura();
		System.out.println("--------------------------");

		// Cambiar la regi�n del loro
		l1.setRegion('N');

		// Mostrar el n�mero de aves
		System.out.println("Se han creado " + cuentaAves + " aves");
	}
}
