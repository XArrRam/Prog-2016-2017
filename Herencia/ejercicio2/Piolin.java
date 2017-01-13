package ejercicio2;

public class Piolin extends Canario {
	int numero;

	Piolin(char s, int e, float t, int n) {
		super(s, e, t);
		numero = n;
	}

	public static void main(String[] args) {

		// Crear instancias de Piolín y Loro
		Piolin p1 = new Piolin('H', 74, 7, 45);
		Loro l1 = new Loro('M', 35, 'S', "Rojo");

		// Llamar al método quienSoy
		p1.quienSoy();
		l1.quienSoy();
		System.out.println("--------------------------");

		// Llamar al método altura() con Piolín
		p1.altura();
		System.out.println("--------------------------");

		// Llamar al método deDondeEres() con el loro
		l1.deDondeEres();
		System.out.println("--------------------------");

		// Cambiar el tamaño de Piolín
		p1.setTamaño(15);
		p1.altura();
		System.out.println("--------------------------");

		// Cambiar la región del loro
		l1.setRegion('N');

		// Mostrar el número de aves
		System.out.println("Se han creado " + cuentaAves + " aves");
	}
}
