package ejercicio1;

public class Vaca {

	private String pelo;
	private int edad;
	protected String nombre;
	static int cuentavacas = 0;

	// Constructores
	Vaca(String n) {
		pelo = "marr�n";
		edad = 10;
		nombre = n;
		cuentavacas = cuentavacas + 1;
		System.out.println("Instanciada la vaca n� " + cuentavacas);
	}

	Vaca(int e, String n) {
		pelo = "negro";
		edad = e;
		nombre = n;
		cuentavacas = cuentavacas + 1;
		System.out.println("Instanciada la vaca n� " + cuentavacas);
	}

	Vaca(String p, int e, String n) {
		pelo = p;
		edad = e;
		nombre = n;
		cuentavacas = cuentavacas + 1;
		System.out.println("Instanciada la vaca n� " + cuentavacas);
	}

	/* private */protected void muu() {
		System.out.println("Muuu...mi nombre es " + this.nombre + " y mi color de pelo es " + this.pelo);
	}

	public void compararEdad(Vaca v) {
		if (v.edad > this.edad) {
			System.out.println("La vaca " + v.nombre + " es m�s vieja que la vaca " + this.nombre);
		} else if (v.edad == this.edad) {
			System.out.println("Las dos vacas son de la misma edad");
		} else {
			System.out.println("La vaca " + this.nombre + " es m�s vieja que la vaca " + v.nombre);
		}
	}

	// Get y Set para la edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
