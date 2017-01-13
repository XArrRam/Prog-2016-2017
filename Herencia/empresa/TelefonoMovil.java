package empresa;

public class TelefonoMovil {
	@SuppressWarnings("unused")
	private String numero;
	private int bateria;

	public int getBateria() {
		return bateria;
	}

	public TelefonoMovil(String n, int b) {
		numero = n;
		bateria = b;
	}

	void usar() {
		this.bateria -= 1;
	}

}
