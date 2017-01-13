package tanda3;

import java.io.IOException;

public class Ej10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;
		
		//Pedir datos validados
		do{
			System.out.print("Introducir dimensión: ");
			n=Consola.leeInt();
			if(n%2!=0||n<6){
				System.out.println("Error. Introduzca un número par mayor que 6");
			}
		}while(n%2!=0||n<6);
		for(int contfila=1;contfila<=n/2;contfila++){
			for(int contcol=1;contcol<=n;contcol++){
				if(contcol==contfila||contcol==(contfila+1)||contcol==n-(contfila-1)||contcol==(n-contfila)){
					System.out.print("X ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print('\n');
		}
		for(int contfila=n/2;contfila<n;contfila++){
			for(int contcol=1;contcol<=n;contcol++){
				if(contcol==contfila||contcol==(contfila+1)||contcol==n-(contfila-1)||contcol==(n-contfila)){
					System.out.print("X ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print('\n');
		}	
	}		
}
		
		
