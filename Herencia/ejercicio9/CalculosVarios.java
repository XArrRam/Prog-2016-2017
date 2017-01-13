package ejercicio9;

import java.io.IOException;

public class CalculosVarios {

	public static void main(String[] args) throws IOException {
		String str_int1 = "12", str_int2 = "34", str_f1 = "15.5", str_f2 = "4.5f";
		final int a = 20;
		final String b = "30";
		int mul, n, index;
		final double c = 2.3;
		char letra;

		System.out.println("CONCATENAR ENTEROS");
		System.out.println(str_int1 + str_int2);
		System.out.println("----------------------------");
		System.out.println("SUMAR ENTEROS");
		System.out.println(Integer.parseInt(str_int1) + Integer.parseInt(str_int2));
		System.out.println("----------------------------");
		System.out.println("CONCATENAR FLOAT");
		System.out.println(str_f1 + str_f2);
		System.out.println("----------------------------");
		System.out.println("SUMAR FLOAT");
		System.out.println(Float.parseFloat(str_f1) + Float.parseFloat(str_f2));
		System.out.println("----------------------------");
		Integer n1 = a;
		Integer n2 = Integer.parseInt(b);
		System.out.println("MULTIPLICAR");
		mul = n1 * n2;
		System.out.println(mul);
		System.out.println("----------------------------");
		System.out.println("TECHO");
		System.out.println(Math.ceil(c));
		System.out.println("----------------------------");
		System.out.println("REDONDEAR");
		System.out.println(Math.round(2 * Math.PI));
		System.out.println("----------------------------");
		System.out.println("VALOR ABSOLUTO");
		System.out.println(Math.abs(Math.sin(-2)));
		System.out.println("----------------------------");
		System.out.println("MÍNIMO");
		System.out.println(Math.min(Math.sin(180 * Math.PI / 180), Math.sin(270 * Math.PI / 180)));
		System.out.println("----------------------------");
		System.out.println("POTENCIAS");
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println((int) Math.pow(3, cont));
		}
		System.out.println("----------------------------");
		System.out.println("ALEATORIO 0--10");
		System.out.println((int) (Math.random() * 11));
		System.out.println("----------------------------");
		System.out.println("ALEATORIO 10--20");
		System.out.println((int) (Math.random() * 11 + 10));
		System.out.println("----------------------------");
		System.out.println("ALEATORIO 10--20 REPETIDO");
		for (int cont = 0; cont < 5; cont++) {
			System.out.println((int) (Math.random() * 11 + 10));
		}
		System.out.println("----------------------------");
		System.out.println("DADO");
		System.out.print("¿Cuántas veces quieres tirar el dado? ");
		n = Consola.leeInt();
		for (int cont = 0; cont < n; cont++) {
			System.out.println((int) (Math.random() * 6 + 1));
		}
		System.out.println("----------------------------");
		System.out.println("ALEATORIO -20--10");
		System.out.println((int) (Math.random() * 30 - 20));
		System.out.println("----------------------------");
		System.out.println("LETRA AL AZAR");
		index = (int) (Math.random() * 26);
		// Este índice dará un valor entre 0 y 25, que sumado al "1" que le
		// corresponde a la A mayúscula dará la posición de la letra.
		letra = (char) ('A' + index);
		System.out.println(letra);
		System.out.println("----------------------------");

	}

}
