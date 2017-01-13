package ejercicio3;

public class Ave {
	private static int cuentaAves;
	private char sexo;
	private int edad;
	private DatosPersonales nombres;

	public DatosPersonales getNombres() {
		return nombres;
	}

	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

	public static int getCuentaAves() {
		return cuentaAves;
	}

	public static void setCuentaAves(int cuentaAves) {
		Ave.cuentaAves = cuentaAves;
	}

	/* static int cuantasAves() { return cuentaAves; } */

	Ave(char s, int e) {
		sexo = s;
		edad = e;
		cuentaAves = cuentaAves + 1;
		nombres = new DatosPersonales("", "");
	}

	protected void quienSoy() {
		if (this.sexo == 'H' || this.sexo == 'h') {
			System.out.println("Soy hombre y tengo " + this.edad + " años");
		} else if (this.sexo == 'M' || this.sexo == 'm') {
			System.out.println("Soy mujer y tengo " + this.edad + " años");
		} else {
			System.out.println("Soy ¿¿¿??? y tengo " + this.edad + " años");
		}

	}

	void cantar() {

	}
}
