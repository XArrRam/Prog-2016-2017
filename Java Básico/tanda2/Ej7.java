package tanda2;

import java.io.IOException;

public class Ej7 {

	public static void main(String[] args) throws IOException {
	
		int coef, edad, coefmax=0, sumcoef=0, contmad=0;
		char sex, ciu;
		
		for(int cont=1; cont<=10; cont++){
			System.out.println("Para el sujeto nº "+cont);
			System.out.println();			
			do{
				System.out.println("Escriba el sexo (H/M)");
				sex=Consola.leeChar();
				System.out.println();
				if (sex!='h' && sex!='H' && sex!='m' && sex!='M'){
					System.out.println("Error. Introduzca un valor válido (H/M)");
					System.out.println();
				}
			}while(sex!='h' && sex!='H' && sex!='m' && sex!='M');			
			do{
				System.out.println("Escriba la edad (0-150)");
				edad=Consola.leeInt();
				System.out.println();
				if(edad<0 || edad>150){
					System.out.println("Error. Introduzca un valor válido (0-150)");
					System.out.println();
				}				
			}while(edad<0 ||edad>150);			
			do{
				System.out.println("Escriba la ciudad (M/S)");
				ciu=Consola.leeChar();
				System.out.println();
				if (ciu!='m' && ciu!='M' && ciu!='s' && ciu!='S'){
					System.out.println("Error. Introduzca un valor válido (M/S)");
					System.out.println();
				}
			}while(ciu!='m' && ciu!='M' && ciu!='s' && ciu!='S');			
			do{
				System.out.println("Escriba el coeficiente intelectual (50-250)");
				coef=Consola.leeInt();
				System.out.println();
				if(coef<50 || coef>250){
					System.out.println("Error. Introduzca un valor válido (50-250)");
					System.out.println();
				}				
			}while(coef<50 || coef>250);			
			if(sex=='H'||sex=='h'){	
				if(ciu=='s'||ciu=='S'){
					if(edad>=20 && edad<=30){
						if(coef>coefmax){
							coefmax=coef;
						}
					}
				}	
			}			
			if(ciu=='m'||ciu=='M'){
				sumcoef=sumcoef+coef;
				contmad=contmad+1;
			}			
			if(sex=='m'||sex=='M'){
				if(ciu=='m'||ciu=='M'){
					if(coef<102){
						System.out.println("El coeficiente del sujeto nº "+cont+" es menor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else if(coef==102){
						System.out.println("El coeficiente del sujeto nº "+cont+" es igual que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else{
						System.out.println("El coeficiente del sujeto nº "+cont+" es mayor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
				}
				else{
					if(coef<106){
						System.out.println("El coeficiente del sujeto nº "+cont+" es menor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else if(coef==106){
						System.out.println("El coeficiente del sujeto nº "+cont+" es igual que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else{
						System.out.println("El coeficiente del sujeto nº "+cont+" es mayor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
				}
			}
			else{
				if(ciu=='m'||ciu=='M'){
					if(coef<101){
						System.out.println("El coeficiente del sujeto nº "+cont+" es menor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else if(coef==101){
						System.out.println("El coeficiente del sujeto nº "+cont+" es igual que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else{
						System.out.println("El coeficiente del sujeto nº "+cont+" es mayor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
				}
				else{
					if(coef<105){
						System.out.println("El coeficiente del sujeto nº "+cont+" es menor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else if(coef==105){
						System.out.println("El coeficiente del sujeto nº "+cont+" es igual que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
					else{
						System.out.println("El coeficiente del sujeto nº "+cont+" es mayor que la media de la ciudad "+ciu+" para el sexo "+sex);
					}
				}
			}
		System.out.println();
		}
		if(coefmax!=0){
			System.out.println("El coeficiente máximo de los hombres de Sevilla con edades comprendidas entre 20 y 30 años es "+coefmax);
		}
		else{
			System.out.println("No se han introducido los datos necesarios para calcular el coeficiente máximo de los hombres de Sevilla con edades comprendidas entre 20 y 30 años ");
		}
		System.out.println();
		if(sumcoef!=0){
			System.out.println("El coeficiente medio de las personas de Madrid es "+(sumcoef/contmad));
		}
		else{
			System.out.println("No se han introducido los datos necesarios para calcular el coeficiente medio de las personas de Madrid");
		}
	}	
}
