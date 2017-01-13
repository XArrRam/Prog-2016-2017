package tanda3;

import java.io.IOException;

public class Ej4 {

	public static void main(String[] args) throws IOException {

		int respuesta,x,y,z,x1,x2,y1,y2,z1,z2;
		double res;

		//Escribir menú hasta que se introduzca un 3
		do{
			System.out.println("Introduzca una de las siguientes opciones:");	
			System.out.println();
			System.out.println("1.-Calcular el módulo de un vector (√(x²+y²+z²))");
			System.out.println("2.-Calcular el producto escalar de dos vectores (x1*x2+y1*y2+z1*z2)");
			System.out.println("3.-Finalizar programa");
			System.out.println();
			System.out.print("Respuesta: ");
			respuesta=Consola.leeInt();
			//Si la opción elegida es la 1 pedir los datos y calcular con las funciones Math.sqr y Math.pow
			switch (respuesta){
			case 1:{
				//Pedir datos
				System.out.println();
				System.out.println("Definir vector:");
				System.out.print("Introduzca el valor de x: ");
				x=Consola.leeInt();
				System.out.print("Introduzca el valor de y: ");
				y=Consola.leeInt();
				System.out.print("Introduzca el valor de z: ");
				z=Consola.leeInt();
				//Calcular
				res=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
				//Escribir
				System.out.println("EL módulo del vector es "+res);
			break;
			}
			//Si la opción elegida es la 2 calcular normalmente
			case 2:{
				//Pedir datos
				System.out.println();
				System.out.println("Definir vector 1:");
				System.out.print("Introduzca el valor de x1: ");
				x1=Consola.leeInt();
				System.out.print("Introduzca el valor de y1: ");
				y1=Consola.leeInt();
				System.out.print("Introduzca el valor de z1: ");
				z1=Consola.leeInt();
				System.out.println();
				System.out.println("Definir vector 2:");
				System.out.print("Introduzca el valor de x2: ");
				x2=Consola.leeInt();
				System.out.print("Introduzca el valor de y2: ");
				y2=Consola.leeInt();
				System.out.print("Introduzca el valor de z2: ");
				z2=Consola.leeInt();
				//Calcular
				res=(x1*x2+y1*y2+z1*z2);
				//Escribir
				System.out.println("El producto escalar de los vectores es "+res);
				break;
			}	
			}
		}while(respuesta!=3);
		System.out.println();
		System.out.println("Fin del programa. ");
	}

}
