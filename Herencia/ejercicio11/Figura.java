package ejercicio11;

public abstract class Figura {
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularArea();

	public abstract String esRegular();

}
