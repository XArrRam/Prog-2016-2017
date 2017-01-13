package empresa;

public class Trabajador extends Persona {
	double dinero;
	TelefonoMovil movil;

	Trabajador(String n, String d, int a, int p, double din, TelefonoMovil m) {
		super(n, d, a, p);
		dinero = din;
		movil = m;
	}

	void ganarDinero(double d) {
		this.dinero = this.dinero + d;
	}

	void gastarDinero(double d) {
		this.dinero = this.dinero - d;
	}

	public String toString() {
		return ("El nombre del trabajador es " + this.getNombre() + ", su peso es de " + this.getPeso() + " kg y tiene "
				+ this.dinero + "€. " + "\n" + "La batería de su teléfono es del " + movil.getBateria() + "%");
	}

	void trabajar() {
		this.movil.usar();
		this.ganarDinero(10);
	}
}
