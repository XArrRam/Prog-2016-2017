package tanda2;

import java.io.IOException;

public class Ej5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n, ventas, num, sumven=0, venmax=0, venmin=1000000, nummax=0, nummin=0;
		char cat, catmax='A', catmin='A';
		
		System.out.println("Introduzca el n�mero de productos");
		n=Consola.leeInt();
		
		for(int cont=1;cont<=n;cont++){
			System.out.println("Para el producto n� "+cont);
			System.out.println();
			System.out.println("Introduzca el n�mero identificativo");
			num=Consola.leeInt();
			do{
				System.out.println("Introduzca la categor�a del producto");
				cat=Consola.leeChar();
				if(cat!='A' && cat!='a' && cat!='B' && cat!='b' && cat!='C' && cat!='c'){
					System.out.println("Error. Introduzca un valor v�lido (A/B/C)");
					System.out.println();
				}
			}while(cat!='A' && cat!='a' && cat!='B' && cat!='b' && cat!='C' && cat!='c');			
			System.out.println("Introduzca el n�mero de ventas");
			ventas=Consola.leeInt();
			System.out.println();
			if(cat=='B'||cat=='b'){
				sumven=sumven+ventas;
			}
			if(ventas>venmax){
				catmax=cat;
				nummax=num;
				venmax=ventas;
			}
			if(ventas<venmin){
				catmin=cat;
				nummin=num;
				venmin=ventas;
			}
		}
		if (sumven==0){
			System.out.println("No hay productos de categor�a B");
		}
		else{
		System.out.println("El total de ventas de la categoria B es "+sumven);
		}
		System.out.println("El identificativo del producto m�s vendido es "+nummax+" (Categor�a "+catmax+")");
		System.out.println("El identificativo del producto menos vendido es "+nummin+" (Categor�a "+catmin+")");

	}

}
