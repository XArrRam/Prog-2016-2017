package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// Crear 3 Piolines
		Piolin p1 = new Piolin('H', 20, 15, 30, "Serafín", "William");
		Piolin p2 = new Piolin('M', 30, 10, 40, "Rogelio", "Richard");
		Piolin p3 = new Piolin('H', 10, 20, 50, "Toñín", "Henry");

		// Cambiar el nombre al animal y al dueño del primer Piolín
		p1.getNombres().setNombre("Manolín");
		p1.getNombres().setNombredueño("Timmy");

		// Crear instancia de loro
		Loro l1 = new Loro('M', 40, 'E', "rojo", "Pedrito", "Susana");

		// Hacer cantar al loro y a los Piolines
		l1.cantar();
		p1.cantar();
		p2.cantar();
		p3.cantar();

		// Mostrar el número de aves
		System.out.println("Se han creado " + Ave.getCuentaAves() + " aves");

		// Mostrar el nombre del primer Piolín y el de su dueño
		System.out.println("El nombre del primer Piolín es " + p1.getNombres().getNombre() + ", y el de su dueño "
				+ p1.getNombres().getNombredueño());
	}

}
