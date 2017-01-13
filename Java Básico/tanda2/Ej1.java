package tanda2;

import java.io.IOException;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		
		int cont, sumacont=0, prodcont=21;
		
		for (cont=20;cont<=40;cont++){
			if (cont%2!=0){
				sumacont=sumacont+cont;
				prodcont=prodcont*cont;
			}
		}
		
		System.out.println("La suma de los numeros impares entre 20 y 40 es "+sumacont);
		System.out.println("El producto de los numeros impares entre 20 y 40 es "+prodcont);
			
		

	}

}
