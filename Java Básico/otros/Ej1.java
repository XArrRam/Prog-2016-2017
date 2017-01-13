package otros;

import java.io.IOException;

import tanda1.Consola;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n,ndig,aux,restaux=0,numdiv=0;
		
		System.out.print("Introduzca un número para convertir a hexadecimal: ");
		n=Consola.leeInt();
		ndig=n;
		
		if (n<16){
			switch(n){
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
				System.out.print(n);
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
			default:
				System.out.print("10");
			break;
			}
		}		
		while (16<=ndig){
			ndig=ndig/16;
			numdiv=numdiv+1;
		}		
		if(n%16!=0){
			aux=n;
			while(aux>16){
				n=aux;
				n=(int) (n/(Math.pow(16, numdiv)));
				restaux=(int) (aux%(Math.pow(16, numdiv)));
				switch(n){
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
						System.out.print(n);
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
					default:
						System.out.print("10");
					break;
				}
				aux=aux/16;
				numdiv=numdiv-1;
			}
				
			switch(restaux){
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
				System.out.print(restaux);
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
			default:
				System.out.print("10");
			break;
			}
		}
		
		else{
			System.out.println((int) Math.pow(10, numdiv));
		}
	}
}					
					
