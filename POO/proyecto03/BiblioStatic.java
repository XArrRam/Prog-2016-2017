package proyecto03;

import java.io.IOException;

import tanda3.Consola;

public class BiblioStatic {
	
	static void verMultiplos(int e1, int e2) throws IOException{
		
		int contmulti, aux;
		char res;
		
		if(e1>e2){
			do{
				System.out.print("El primer n�mero debe ser menor que el segundo. �Desea invertir los datos introducidos? (S/N): ");
				res=Consola.leeChar();
				if(res=='s'||res=='S'){
					aux=e2;
					e2=e1;
					e1=aux;
				}
				else if(res=='n'||res=='N'){
					System.out.println("FIN DEL PROGRAMA");
				}
				else{
						System.out.println("Error. Introduzca un dato v�lido");	
				}	
			}while(res!='s' && res!='S' &&  res!='n' && res!='N');
		}	

		if(e1<e2){
			contmulti=0;
			System.out.println("Los m�ltiplos de 5 entre "+e1+" y "+e2+" son:");
			for(int cont=e1; cont<=e2; cont++){
				if(cont%5==0 && cont!=0){
					System.out.print(cont+" ");
					contmulti+=1;
				}
			}
			if(contmulti==0){
				System.out.println("No hay m�ltiplos");
			}
		}	
		System.out.println();	
	}	

	static void tipoCaracter(char c){
		if('0' <= c && c <= '9' ){
			System.out.println("El car�cter "+c+" es un n�mero.");
		}
		else if('a' <= c && c <= 'z' ){
			System.out.println("El car�cter "+c+" es una letra min�scula.");
		}
		else if('A' <= c && c <= 'Z' ){
			System.out.println("El car�cter "+c+" es una letra may�scula.");
		}
		else{
			System.out.println("El car�cter "+c+" no es ni un n�mero, ni una letra.");
		}
	}

	static int potencia(float x, int n){
		return (int) Math.pow(x, n);
	}
	
	static float sumatorio(int n){
		
		int suma=0;
		
		for(int cont=n; cont>=1; cont--){
			suma=suma+cont;
		}	
		return suma; 
	}
	
	static void verTabla(int n){
		
		for(int cont=1; cont<=10; cont++){
			if(cont<10){
				System.out.println(" "+cont+"x"+n+"="+n*cont);
			}
			else{
				System.out.println(cont+"x"+n+"="+n*cont);
			}
		}	
		
	}
	
	static void verTablaRestringida (int n){

		boolean vis;
		
		vis=false;
		if(n>=1&&n<=20){
			vis=true;
		}	
		if(vis==true){
			for(int cont=1; cont<=10; cont++){
				if(cont<10){
					System.out.println(" "+cont+"x"+n+"="+n*cont);
				}
				else{
					System.out.println(cont+"x"+n+"="+n*cont);
				}
			}	
		}
		else{
			System.out.println("La tabla del n�mero indicado no se puede visualizar");
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		int res, e1, e2, n, x, numtabla;
		float ter, sum;
		char c;
		
		
		do{
			System.out.println("Introduzca una de las siguientes opciones:");	
			System.out.println();
			System.out.println("1.-Visualizar m�ltiplos de 5");
			System.out.println("2.-Analizar Car�cter");
			System.out.println("3.-Potencias de 2");
			System.out.println("4.-F�rmula");
			System.out.println("5.-Ver tabla de multiplicar");
			System.out.println("6.-Ver tabla de multiplicar restringida");
			System.out.println("7.-FIN");
			System.out.println();
			System.out.print("Respuesta: ");
			res=Consola.leeInt();
			System.out.println("---------------------------------------");
			
			switch(res){
				
				case 1:
					do{
						System.out.println("Introduzca dos n�meros. AVISO: uno de ellos debe ser 0");
						System.out.print("Introduzca el primer n�mero: ");
						e1 = Consola.leeInt();
						System.out.print("Introduzca el segundo n�mero: ");
						e2 = Consola.leeInt();
						
						if(e1!=0 && e2!=0){
							System.out.println("Error: uno de los n�meros debe ser 0");
						}
					}while(e1!=0 && e2!=0);	
					
					BiblioStatic.verMultiplos(e1, e2);
					
					System.out.println("---------------------------------------");
				break;
				
				case 2:
					for(int cont=1; cont<=5; cont++){
						System.out.print("Introduzca el car�cter n�"+cont+": ");
						c = Consola.leeChar();
						
						BiblioStatic.tipoCaracter(c);
						System.out.println();
					}	
					
					System.out.println("---------------------------------------");
				break;
				
				case 3:
					System.out.print("�Cu�ntas potencias de 2 quiere calcular?: ");
					n=Consola.leeInt();
					
					for(int cont=1; cont<=n; cont++){
						System.out.print(BiblioStatic.potencia(2, cont)+" ");
					}
					System.out.println();
					System.out.println("---------------------------------------");
				
				break;
				
				case 4:
					sum=0;
					
					System.out.print("Introduzca un n�mero: ");
					x=Consola.leeInt();
					
					for(int cont=1; cont<=8; cont++){
						ter=(BiblioStatic.potencia(x, cont)/BiblioStatic.sumatorio(cont));
						sum=sum+ter;
					}
					
					System.out.println("El resultado es: "+sum);
					System.out.println("---------------------------------------");
					
				break;	
				
				case 5:
					
					do{
						System.out.print("Introduzca el n�mero del que quiere ver la tabla de multiplicar: ");
						numtabla=Consola.leeInt();
						
						if(numtabla>=1&&numtabla<=10){
							verTabla(numtabla);
						}
						else{
							System.out.println("Error. Introduzca un n�mero entre 1 y 10");
						}
					}while(numtabla<1||numtabla>10);
						
					System.out.println("---------------------------------------");					
				break;	
				
				case 6:
					
					do{
						System.out.print("Introduzca el n�mero del que quiere ver la tabla de multiplicar: ");
						numtabla=Consola.leeInt();
						BiblioStatic.verTablaRestringida(numtabla);
					}while(numtabla!=0);
					System.out.println("---------------------------------------");	
				break;	
				
				case 7:
					System.out.println("FIN DEL PROGRAMA");
					System.out.println("---------------------------------------");
				break;	
				
				
				default:
					System.out.println("Error. Introduzca una opci�n v�lida");
			}	
		}while(res!=7);		
	}
}
