package tanda4;

import java.io.IOException;

public class Ej3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n,num=0;
		//Pedir datos
		do{
			System.out.print("Introduzca el número de líneas: ");
			n=Consola.leeInt();
			if(n<0||n%2==0){
				System.out.println("Error. Introduzca un número positivo impar");
			}
			else{
				for(int numfila=1;numfila<=n;numfila++){
					num=0;
					if(numfila<=(n/2+1)){
						for(int numblanco=0;numblanco<=(n/2-numfila);numblanco++){
							System.out.print("  ");
							num=num+1;
						}
						for(int contcol=1;contcol<=(numfila+(numfila-1));contcol++){
							if(num%2!=0){
								System.out.print("X ");
							}
							else{
								System.out.print("Y ");
							}
							num=num+1;
						}	
						System.out.println();
					}
					else{
						for(int numblanco=1;numblanco<=(numfila-((n/2)+1));numblanco++){
							System.out.print("  ");
							num=num+1;
						}
						for(int contcol=1;contcol<=1+2*(n-numfila);contcol++){
							if(num%2!=0){
								System.out.print("X ");
							}
							else{
								System.out.print("Y ");
							}
							num=num+1;
						}	
						System.out.println();
					}
				}
			}
			
		}while(n<0||n%2==0);

	}

}
