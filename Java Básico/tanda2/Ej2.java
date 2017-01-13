package tanda2;

import java.io.IOException;

public class Ej2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char res;
		int num, sumnum=0, facnum=1;
		
		do{
			System.out.println("A-Calcular raíz cuadrada");
			System.out.println("B-Calcular cubo");
			System.out.println("C-Calcular sumatorio");
			System.out.println("D-Calcular factorial");
			System.out.println("E-Salir");
			System.out.println();
			
			System.out.print("Introduzca una opción de las anteriores: ");
			
			res=Consola.leeChar();
			
			if(res=='A'||res=='a'){
				System.out.println("Introduzca un número: ");
				num=Consola.leeInt();
				System.out.println("La raíz cuadrada de "+num+" es "+Math.sqrt(num));
				System.out.println();
			}
			
			else if(res=='B'||res=='b'){
				System.out.println("Introduzca un número: ");
				num=Consola.leeInt();
				System.out.println("El cubo de "+num+" es "+num*num*num);
				System.out.println();
			}
			
			else if(res=='C'||res=='c'){
				System.out.println("Introduzca un número: ");
				num=Consola.leeInt();
				for(int cont=1; cont<=num; cont++){
					sumnum=sumnum+cont;
				}
				System.out.println("El sumatorio de "+num+" es "+sumnum);
				System.out.println();
			}
			
			else if(res=='D'||res=='d'){
				System.out.println("Introduzca un número: ");
				num=Consola.leeInt();
				for(int cont=2;cont<=num;cont++){
					facnum=facnum*cont;
				}
				System.out.println("El factorial de "+num+" es "+facnum);
				System.out.println();
			}
			
			else if(res=='E'||res=='e'){
				System.out.println("Fin del programa.");
			}
			
			else{
				System.out.println("Error. Introduzca una de las opciones anteriores");
				System.out.println();
			}
			
		}while(res!='E' && res!='e');
	 }

}
