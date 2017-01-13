package empresa;

public class Programa2 {

	public static void main(String[] args) {
		// Crear los trabajadores con sus teléfonos
		TelefonoMovil m1 = new TelefonoMovil("666666666", 100);
		TelefonoMovil m2 = new TelefonoMovil("677777777", 90);
		Trabajador t1 = new Trabajador("Recesvinto", "72727272J", 150, 100, 15000, m1);
		Trabajador t2 = new Trabajador("Miguel", "7878787878P", 180, 90, 8900, m2);
		Empresa e1 = new Empresa("Bocamones de Jadillo S.L.", 100000, t1);
		e1.contratarGerente(t2);
		System.out.println(e1.toString());
		System.out.println("--------------------------------");
		e1.trabajar();
		e1.trabajar();
		System.out.println(e1.toString());
		System.out.println("--------------------------------");

	}

}
