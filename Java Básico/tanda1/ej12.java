package tanda1;

import java.io.IOException;

public class ej12 {
	public static void main (String[]args) throws IOException{
		int num;
		int cont=0;
	
		System.out.print("Escriba su n�mero: ");
		num=Consola.leeInt();
		while (10<=num){
			num=num/10;
			cont=cont+1;
		}
		cont=cont+1;
		System.out.println("El n�mero tiene "+cont+" d�gito(s).");
	}
}	
