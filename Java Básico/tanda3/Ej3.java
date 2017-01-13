package tanda3;

import java.io.IOException;

public class Ej3 {

	public static void main(String[] args) throws IOException {
		
		int n1, n2, aux=0,contprimos=0, cont, cont2;
		double res, sumprimos=0;
		boolean primo;
		
		do{
			System.out.print("Introduzca N1: ");
			n1=Consola.leeInt();
			System.out.print("Introduzca N2: ");
			n2=Consola.leeInt();
			//Error si los numeros son iguales
			if(n1==n2){
				System.out.println("Error. Introduzca dos números diferentes");
			}
		}while(n1==n2);
		
		//Corregir si n1>n2
		if(n1>n2){
			aux=n1;
			n1=n2;
			n2=aux;
		}	
		//Probar cada número de n1 a n2 para ver si es primo (por defecto será primo y se anulará si tiene algún divisor)
		for (cont=n1;cont<=n2;cont++){
			primo=true;
			for (cont2=2;cont2<cont;cont2++){
				if(cont%cont2==0){
					primo=false;
				}
			}
			if (primo==true){
				sumprimos=sumprimos+cont;
				contprimos=contprimos+1;
			}
		}
		//Escribir resultado
		res=(sumprimos/contprimos);
		System.out.println("La media de los números primos entre "+n1+" y "+n2+" es "+res);
	}	
}