package tanda3;

import java.io.IOException;

public class Ej5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c,n;
		float r,aux,aux2=1,cuotamens;
		//Introducción de datos
		do{
			System.out.print("Introduzca el capital (€): ");
			c=Consola.leeInt();
			if(c<=0){
				System.out.println("Error. Introduzca un valor válido");
			}	
		}while(c<=0);
		do{
			System.out.print("Introduzca el interés anual (%): ");
			r=Consola.leeFloat();
			if(r<=0){
				System.out.println("Error. Introduzca un valor válido");
			}
		}while(r<=0);
		//Tambíen se puede poner r/=100
		r=r/100;
		do{
			System.out.print("Introduzca el número de meses: ");
			n=Consola.leeInt();
			if(n<=0){
				System.out.println("Error. Introduzca un valor válido");
			}
		}while(n<=0);
		//Cálculo
		aux=(1/(1+r));
		for(int cont=1;cont<=n;cont++){
			aux2=aux2*aux;
		}
		cuotamens=(c*r)/(1-aux2);
		//Escribir el resultado
		System.out.println("La cuota mensual a pagar es de "+cuotamens+"€");
		System.out.println("La cuota total a pagar es de "+cuotamens*n+"€");
	}
}
