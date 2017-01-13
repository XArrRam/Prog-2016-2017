package otros;

import java.io.IOException;

import tanda1.Consola;

public class NumHexa {
	long numero;
	
	NumHexa(int n){
		numero=n;
	}
	int cuentaDigitos(int n){
		int dig=1;
		
		while(n>=16){
			n=n/16;
			dig=dig+1;
		}
		return dig;
	}	
	void calculadora(int n){

		int res, div, pot, cont=1, dig;
		
		dig=this.cuentaDigitos(n);
		pot=dig-1;
		do{			
			div=(int) (n/(Math.pow(16, pot)));
			res=(int) (n%(Math.pow(16, pot)));		
			switch(div){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.print(div);
			break;
			case 10:
				System.out.print("A");
			break;
			case 11:
				System.out.print("B");
			break;	
			case 12:
				System.out.print("C");
			break;	
			case 13:
				System.out.print("D");
			break;	
			case 14:
				System.out.print("E");
			break;
			case 15:
				System.out.print("F");
			break;
			}
			pot-=1;
			cont+=1;
			n=res;
		}while(cont<=dig);
	}
	public static void main(String[] args) throws IOException {
		int n;
		
		System.out.print("Introduzca un número para convertir a hexadecimal: ");
		n=Consola.leeInt();
		
		NumHexa num=new NumHexa(n);
		
		System.out.print("El número en hexadecimal es ");
		num.calculadora(n);
	}
}