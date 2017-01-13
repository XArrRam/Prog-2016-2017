package tanda4;

import java.io.IOException;

public class Ej2 {

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
					for(int numblanco=1;numblanco<=(n-numfila);numblanco++){
						System.out.print("  ");
					}
					if(numfila%2!=0){
						for(int num=1;num<=(numfila+(numfila-1));num++){
							System.out.print("X ");							
						}
					}
					else{
						for(int num=1;num<=(numfila+(numfila-1));num++){
							System.out.print("Y ");							
						}
					}
				System.out.println();
				}		
			}
		}while(n<0);	
	}

}
