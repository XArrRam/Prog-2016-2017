package tanda2;

import java.io.IOException;

public class Ej6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int numhijos, sueldo,sumsueldo=0,contfam=0,sueldomax=0,sueldomin=100000;
		double fijo,tasa;
		
		
		for(int cont=1;cont<=20;cont++){
			System.out.println("Para la familia nº "+cont+":");
			System.out.println("Introduzca el número de hijos:");
			numhijos=Consola.leeInt();
			System.out.println("Introduzca el sueldo del cabeza de familia:");
			sueldo=Consola.leeInt();
			fijo=sueldo*0.10;
			
			if (numhijos==0){
				tasa=fijo;
				if (sueldo>sueldomax){
					sueldomax=sueldo;
				}
			}
			else if(numhijos==1||numhijos==2){
				tasa=fijo*Math.pow(0.95, numhijos);
			}
			else{
				tasa=fijo*Math.pow(0.9, numhijos);
				sumsueldo=sumsueldo+sueldo;
				contfam=contfam+1;
			}
			if (sueldo<sueldomin){
				sueldomin=sueldo;
			}
			System.out.println("La familia nº "+cont+" deberá pagar "+tasa+" €");
			System.out.println();
		}
		System.out.println("La media del sueldo de las familias numerosas es "+(sumsueldo/contfam)+" €");
		System.out.println("El sueldo máximo de las familias sin hijos es "+sueldomax+" €");
		System.out.println("El sueldo mínimo es de "+sueldomin+" €");
	}

}
