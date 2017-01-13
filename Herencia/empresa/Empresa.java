package empresa;

public class Empresa {
	private String nombre;
	private double beneficio;
	private Trabajador dueño;
	private Trabajador gerente;

	Empresa(String n, double b, Trabajador d) {
		nombre = n;
		beneficio = b;
		dueño = d;
	}

	void contratarGerente(Trabajador t) {
		this.gerente = t;
	}

	void trabajar() {
		this.dueño.trabajar();
		this.gerente.trabajar();
		this.beneficio += 100;
	}

	public String toString() {
		return ("La empresa " + this.nombre + " tiene un beneficio de " + this.beneficio + "€. " + "\n"
				+ dueño.toString() + "\n" + gerente.toString());
	}

}
