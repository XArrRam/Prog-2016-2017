package tanda2;

import java.io.IOException;

public class Ej3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int num, a1=0, a2=1, a3;
				
		System.out.println("Introduzca la cantidad de números de la serie: ");
		num=Consola.leeInt();
		
		System.out.print("0, 1");
		
		for(int cont=1; cont<=num-2; cont++){
			a3=3*a2+2*a1;
			System.out.print(", "+a3);
			a2=a3;
			a1=a2;
		}
	}

}
