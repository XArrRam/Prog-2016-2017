package tanda3;

import java.io.IOException;

import tanda2.Consola;

public class Ej2 {

	public static void main(String[] args) throws IOException {
	
		int n, i, x, facn=1, faci=1, facx=1;
		
		System.out.println("Se va a calcular n!/(i!*(n-i)!)");
		System.out.println();
		do{
		System.out.print("Introduzca un número (n): ");
		n=Consola.leeInt();
		System.out.print("Introduzca otro número (i): ");
		i=Consola.leeInt();
		if(n<=i){
			System.out.println("Error. n debe ser mayor que i");
		}
		}while(n<=i);
			
		for(int cont=2;cont<=n;cont++){
			facn=facn*cont;
		}
		for(int cont=2;cont<=i;cont++){
			faci=faci*cont;
		}
		x=n-i;
		for(int cont=2;cont<=x;cont++){
			facx=facx*cont;
		}
		System.out.println("El resultado es "+facn/(faci*facx));
	}
}
