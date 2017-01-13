package empresa;

public class Empresa {
	private String nombre;
	private double beneficio;
	private Trabajador due�o;
	private Trabajador gerente;

	Empresa(String n, double b, Trabajador d) {
		nombre = n;
		beneficio = b;
		due�o = d;
	}

	void contratarGerente(Trabajador t) {
		this.gerente = t;
	}

	void trabajar() {
		this.due�o.trabajar();
		this.gerente.trabajar();
		this.beneficio += 100;
	}

	public String toString() {
		return ("La empresa " + this.nombre + " tiene un beneficio de " + this.beneficio + "�. " + "\n"
				+ due�o.toString() + "\n" + gerente.toString());
	}

}
