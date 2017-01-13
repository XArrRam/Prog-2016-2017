package ejercicio3;

public class Loro extends Ave {
	private char region;
	@SuppressWarnings("unused")
	private String color;

	Loro(char s, int e, char r, String c, String nombre, String nombredueño) {
		super(s, e);
		region = r;
		color = c;
		getNombres().setNombre(nombre);
		getNombres().setNombredueño(nombredueño);
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	protected void deDondeEres() {
		if (region == 'n' || region == 'N') {
			System.out.println("Norte");
		} else if (region == 's' || region == 'S') {
			System.out.println("Sur");
		} else if (region == 'e' || region == 'E') {
			System.out.println("Este");
		} else if (region == 'o' || region == 'O') {
			System.out.println("Oeste");
		} else {
			System.out.println("Otro");
		}
	}

	void cantar() {
		System.out.println("Mi nombre es " + this.getNombres().getNombre() + ", Piiiio piiiio loro bonito");
	}

}
