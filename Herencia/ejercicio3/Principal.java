package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// Crear 3 Piolines
		Piolin p1 = new Piolin('H', 20, 15, 30, "Seraf�n", "William");
		Piolin p2 = new Piolin('M', 30, 10, 40, "Rogelio", "Richard");
		Piolin p3 = new Piolin('H', 10, 20, 50, "To��n", "Henry");

		// Cambiar el nombre al animal y al due�o del primer Piol�n
		p1.getNombres().setNombre("Manol�n");
		p1.getNombres().setNombredue�o("Timmy");

		// Crear instancia de loro
		Loro l1 = new Loro('M', 40, 'E', "rojo", "Pedrito", "Susana");

		// Hacer cantar al loro y a los Piolines
		l1.cantar();
		p1.cantar();
		p2.cantar();
		p3.cantar();

		// Mostrar el n�mero de aves
		System.out.println("Se han creado " + Ave.getCuentaAves() + " aves");

		// Mostrar el nombre del primer Piol�n y el de su due�o
		System.out.println("El nombre del primer Piol�n es " + p1.getNombres().getNombre() + ", y el de su due�o "
				+ p1.getNombres().getNombredue�o());
	}

}
