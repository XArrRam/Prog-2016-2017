package tanda3;

import java.io.IOException;

public class Ej7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num, numres, aux, dig=1, digres=0, res, sumnum=0;
		//Pedir el numero de la tarjeta
		System.out.print("Introduzca el n�mero de su tarjeta: ");
		num=Consola.leeInt();
		aux=num;
		numres=num;
		//Contar d�gitos
		while(aux>=10){
			aux=aux/10;
			dig=dig+1;
			digres=dig;
		};
		//Calcular n�mero de cada posici�n y multiplicar por su peso
		for(int pos=1;pos<=dig;pos++){
			res=num%10;
			num=num/10;
			if(pos%2==0){
				res=res*2;
				if(res>9){
					res=res-9;
				}
			}
			//Suma de los d�gitos*peso
			sumnum=sumnum+res;
		}
		//Calcular m�dulo y dar el resultado
		if(sumnum%10==0){
			System.out.println("El n�mero "+numres+" tiene "+digres+" d�gitos y es correcto");
		}
		else{
			System.out.println("El n�mero "+numres+" tiene "+digres+" d�gitos y es incorrecto");
		}
	}
}
