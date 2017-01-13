package otros;

import java.io.IOException;

import tanda1.Consola;

public class CuentaDigitosHex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num;
		int cont=0;
	
		System.out.print("Escriba su número: ");
		num=Consola.leeInt();
		while (16<=num){
			num=num/16;
			cont=cont+1;
		}
		cont=cont+1;
		System.out.println("El número tiene "+cont+" dígito(s).");

	}

}
