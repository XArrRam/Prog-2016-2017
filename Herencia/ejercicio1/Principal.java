package ejercicio1;

public class Principal {

	public static void main(String[] args) {

		// Instanciar vacas
		Vaca miVaca1 = new Vaca("Rita");
		Vaca miVaca2 = new Vaca(15, "Felisa");
		Vaca miVaca3 = new Vaca("morado", 20, "Cecilia");
		System.out.println("-------------------------------");

		// Las 3 vacas mugen (cambiar el método a protected)
		miVaca1.muu();
		miVaca2.muu();
		miVaca3.muu();
		System.out.println("-------------------------------");

		// Comparar la edad de la vaca 1 y la vaca 2
		miVaca1.compararEdad(miVaca2);
		System.out.println("-------------------------------");

		// Visualizar el nombre de la vaca 1
		System.out.println("El nombre de la vaca 1 es " + miVaca1.nombre);
		System.out.println("-------------------------------");

		// Sumar 1 a la edad de la vaca 1
		miVaca1.setEdad(miVaca1.getEdad() + 1);
		System.out.println(miVaca1.nombre + " tiene ahora " + miVaca1.getEdad() + " años");
		System.out.println("-------------------------------");
	}

}
