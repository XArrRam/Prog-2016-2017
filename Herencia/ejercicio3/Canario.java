package ejercicio3;

public class Canario extends Ave {
	private float tama�o;

	public float getTama�o() {
		return tama�o;
	}

	public void setTama�o(float tama�o) {
		this.tama�o = tama�o;
	}

	Canario(char s, int e) {
		super(s, e);
	}

	Canario(char s, int e, float t) {
		super(s, e);
		tama�o = t;
	}

	void altura() {
		if (this.tama�o > 30) {
			System.out.println("Alto");
		} else if (this.tama�o >= 15 && this.tama�o <= 30) {
			System.out.println("Mediano");
		} else {
			System.out.println("Bajo");
		}
	}

}
