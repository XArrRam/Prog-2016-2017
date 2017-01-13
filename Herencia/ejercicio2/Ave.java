package ejercicio2;

public class Ave {
	static int cuentaAves;
	char sexo;
	int edad;

	Ave(char s, int e) {
		sexo = s;
		edad = e;
		cuentaAves = cuentaAves + 1;
	}

	static int cuantasAves() {
		return cuentaAves;
	}

	void quienSoy() {
		if (this.sexo == 'H' || this.sexo == 'h') {
			System.out.println("Soy hombre y tengo " + this.edad + " años");
		} else if (this.sexo == 'M' || this.sexo == 'm') {
			System.out.println("Soy mujer y tengo " + this.edad + " años");
		} else {
			System.out.println("Soy ¿¿¿??? y tengo " + this.edad + " años");
		}

	}
}
