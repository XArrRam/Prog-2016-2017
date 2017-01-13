package tanda3;

import java.io.IOException;

public class Ej8 {

	public static void main(String[] args) throws IOException {
		
		int n, num=1, inc=1;
		//Pedir datos
		System.out.print("Introduzca el número de líneas: ");
		n=Consola.leeInt();
		//Escribir serie dejando al principio un número (n-1) de espacios (n es el número de fila)
		for(int numfilas=1;numfilas<=n;numfilas++){
			num=(int) (num*Math.pow(2, (numfilas-1)));
			for(int numblancos=1;numblancos<=(numfilas-1);numblancos++)
				System.out.print("  ");
			for(int numcol=1;numcol<=(numfilas+2);numcol++){
				System.out.print(num+" ");
				num=num+inc*numfilas;
			}
			System.out.print('\n');
			num=1;
		}
	}
}
