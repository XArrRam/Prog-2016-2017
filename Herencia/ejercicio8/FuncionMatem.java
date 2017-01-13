package ejercicio8;

public class FuncionMatem {

	private double x;

	public FuncionMatem(double val) {
		x = val;
	}

	public double evaluar() {
		return (Math.sqrt(Math.sin(Math.pow(x, 3) + (2 * x / 9))
				+ Math.cos(6 * Math.PI + Math.tan(Math.pow(Math.E, Math.pow(x, 3))))));
	}

	public static double evaluarX(double x) {
		return (Math.sqrt(Math.sin(Math.pow(x, 3) + (2 * x / 9))
				+ Math.cos(6 * Math.PI + Math.tan(Math.pow(Math.E, Math.pow(x, 3))))));
	}

	public static void main(String[] args) {
		FuncionMatem o1 = new FuncionMatem(0);
		System.out.println("El valor de la función para x=0 es: " + o1.evaluar());
		System.out.println("El valor de la función para x=1 es: " + FuncionMatem.evaluarX(1));

	}

}
