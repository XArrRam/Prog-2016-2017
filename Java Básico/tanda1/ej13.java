package tanda1;

import java.io.IOException;

public class ej13 {

	public static void main(String[] args) throws IOException {
		int num, pos, cont, dig=0, res=0, aux;
		
		/*Pedir datos*/
		
		System.out.println("Escriba su n�mero: ");
		num=Consola.leeInt();
		aux=num;
				
		/*Calcular cuantos d�gitos tiene*/
		
		while (10<=aux){
			aux=aux/10;
			dig=dig+1;
		}
		dig=dig+1;
		System.out.println("El n�mero "+num+" tiene "+dig+" d�gito(s).");
		
		/*Pedir posici�n*/
		
		do{
			System.out.println("Escriba la posici�n: ");
			pos=Consola.leeInt();
		if ((pos>dig)||(pos<=0));{
			System.out.println("Error, introduzca un n�mero v�lido.");
		}
		}while ((pos>dig) || (pos<=0));
		
		/*Calcular n�mero en posici�n pos*/
		if ((pos<dig)&&(pos>0)){
			for(cont=1;cont<=pos;cont++){
				res=(int) (num/(Math.pow(10, (dig-1))));
				num=(int) (num-res*(Math.pow(10, (dig-1))));
				dig=dig-1;
			}
			System.out.println("El d�gito de la posici�n "+pos+" es "+res+".");
		}
	}

}
