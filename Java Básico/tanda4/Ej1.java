package tanda4;

import java.io.IOException;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		//Pedir datos
		do{
			System.out.print("Introduzca el número de líneas: ");
			n=Consola.leeInt();
			if(n<0){
				System.out.println("Error. Introduzca un número positivo");
			}
			else{
				for(int numfila=1;numfila<=n;numfila++){
					for(int numcol=1;numcol<=numfila;numcol++){
						System.out.print("X");
						System.out.print(" ");
						System.out.print("Y");
						System.out.print(" ");
					}
					System.out.println();
				}
			}
		}while(n<0);	
			
	}

}
