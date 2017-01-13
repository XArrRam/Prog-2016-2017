package ejercicio11;

public class Punto {
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}

	public double distanciaOrigen() {
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	public double calcularDistancia(double x1, double y1) {
		return (Math.sqrt(Math.pow(Math.abs(x - x1), 2) + Math.pow(Math.abs(y - y1), 2)));
	}

	public int calcularCuadrante() {
		if (x > 0) {
			if (y > 0) {
				return 1;
			} else {
				return 2;
			}
		} else if (x < 0) {
			if (y > 0) {
				return 4;
			} else {
				return 3;
			}
		} else {
			return 0;
		}
	}

	public Punto calcularMasCercano(Punto p1, Punto p2, Punto p3) {
		double d1, d2, d3;
		d1 = calcularDistancia(p1.x, p1.y);
		d2 = calcularDistancia(p2.x, p2.y);
		d3 = calcularDistancia(p3.x, p3.y);

		if (d1 > d2 && d1 > d3) {
			return p1;
		}
		if (d2 > d1 && d2 > d3) {
			return p2;
		} else {
			return p3;
		}

	}

}
