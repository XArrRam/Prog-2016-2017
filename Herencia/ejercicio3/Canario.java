package ejercicio3;

public class Canario extends Ave {
	private float tamaño;

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}

	Canario(char s, int e) {
		super(s, e);
	}

	Canario(char s, int e, float t) {
		super(s, e);
		tamaño = t;
	}

	void altura() {
		if (this.tamaño > 30) {
			System.out.println("Alto");
		} else if (this.tamaño >= 15 && this.tamaño <= 30) {
			System.out.println("Mediano");
		} else {
			System.out.println("Bajo");
		}
	}

}
