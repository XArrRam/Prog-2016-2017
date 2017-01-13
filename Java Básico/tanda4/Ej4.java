package tanda4;

import java.io.IOException;

public class Ej4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		//Pedir datos
				do{
					System.out.print("Introduzca la dimensión: ");
					n=Consola.leeInt();
					if(n<0){
						System.out.println("Error. Introduzca un número positivo");
					}
					else{
						for (int numfila=1;numfila<=n;numfila++){
							if(numfila==1||numfila==n){
								for (int numcol=1;numcol<=n;numcol++){
									System.out.print("X ");
								}
							}
							else{
								for(int numcol=1;numcol<=n;numcol++){
									if(numcol==1||numcol==n){
										System.out.print("X ");
									}
									else{
										System.out.print("  ");
									}
								}
							}
							System.out.print('\n');
						}
						
						
					}
				}while(n<0);	

	}

}
