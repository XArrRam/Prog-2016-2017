package tanda1;

import java.io.IOException;

public class ej13 {

	public static void main(String[] args) throws IOException {
		int num, pos, cont, dig=0, res=0, aux;
		
		/*Pedir datos*/
		
		System.out.println("Escriba su número: ");
		num=Consola.leeInt();
		aux=num;
				
		/*Calcular cuantos dígitos tiene*/
		
		while (10<=aux){
			aux=aux/10;
			dig=dig+1;
		}
		dig=dig+1;
		System.out.println("El número "+num+" tiene "+dig+" dígito(s).");
		
		/*Pedir posición*/
		
		do{
			System.out.println("Escriba la posición: ");
			pos=Consola.leeInt();
		if ((pos>dig)||(pos<=0));{
			System.out.println("Error, introduzca un número válido.");
		}
		}while ((pos>dig) || (pos<=0));
		
		/*Calcular número en posición pos*/
		if ((pos<dig)&&(pos>0)){
			for(cont=1;cont<=pos;cont++){
				res=(int) (num/(Math.pow(10, (dig-1))));
				num=(int) (num-res*(Math.pow(10, (dig-1))));
				dig=dig-1;
			}
			System.out.println("El dígito de la posición "+pos+" es "+res+".");
		}
	}

}
