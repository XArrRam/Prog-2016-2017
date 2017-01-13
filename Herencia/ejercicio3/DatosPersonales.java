package ejercicio3;

public class DatosPersonales {
	private String nombre;
	private String nombredueño;

	public DatosPersonales(String nombre, String nombredueño) {
		this.nombre = nombre;
		this.nombredueño = nombredueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombredueño() {
		return nombredueño;
	}

	public void setNombredueño(String nombredueño) {
		this.nombredueño = nombredueño;
	}

}
