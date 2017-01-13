package tanda3;

import java.io.IOException;

public class Ej6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int mes,dia,ndias,nblanco=0,diaact=1,contdia=0;
		//Pedir datos
		do{
			System.out.print("Introduzca el n�mero del mes (Enero=1, Febrero=2, Marzo=3...): ");
			mes=Consola.leeInt();
			if(mes<=0||mes>12){
				System.out.println("Error. Introduzca un valor v�lido");
			}
		}while(mes<=0||mes>12);
		do{
			System.out.print("Introduzca el n�mero del d�a en el que empieza el mes (Lunes=1, Martes=2, Mi�rcoles=3...): ");
			dia=Consola.leeInt();
			if(dia<=0||dia>7){
				System.out.println("Error. Introduzca un valor v�lido");
			}
		}while(dia<=0||dia>7);
		/*Plantear todas las opciones diferentes de cada mes en un switch (default:febrero=28 d�as) 
		y que escriba el nombre del mes correspondiente en la cabecera*/
		switch(mes){
		case 1:
			System.out.println("Enero");
			ndias=31;
		break;
		case 3:
			System.out.println("Marzo");
			ndias=31;
		break;
		case 5:
			System.out.println("Mayo");
			ndias=31;
		break;
		case 7:
			System.out.println("Julio");
			ndias=31;
		break;
		case 8:
			System.out.println("Agosto");
			ndias=31;
		break;
		case 10:
			System.out.println("Octubre");
			ndias=31;
		break;
		case 12:
			System.out.println("Diciembre");
			ndias=31;
		break;
		
		case 4:
			System.out.println("Abril");
			ndias=30;
		break;	
		case 6:
			System.out.println("Junio");
			ndias=30;
		break;
		case 9:
			System.out.println("Septiembre");
			ndias=30;
		break;
		case 11:
			System.out.println("Noviembre");
			ndias=30;
		break;
		default:
			System.out.println("Febrero");
			ndias=28;
		}
		//Para cada dia "vacio" de la primera semana a�adir un espacio en blanco (4x barra espaciadora)
		while(nblanco<(dia-1)){
			nblanco=nblanco+1;
		}
		//Escribir siempre la primera linea (L-D)
		System.out.println("L   M   X   J   V   S   D");
		//Escribir los huecos de los dias que faltan
		for(int cont=1;cont<=nblanco;cont++){
			System.out.print("    ");
			//Contar estos espacios vac�os como d�as para que funcione el salto de l�nea
			contdia=contdia+1;
		}
		//Empezar a escribir los numeros de los dias y que se vayan incrementando en cada paso
		do{
			//Si el n�mero tiene dos d�gitos se descuadra, asi que se a�ade un espacio m�s peque�o
			if(diaact>=10){
				System.out.print(diaact+"  ");
			}
			//Si el n�mero tiene solo un d�gito espacios normales
			else{
				System.out.print(diaact+"   ");
			}
			//Aumentar el d�a que se va a escribir y el contador de d�as de cada semana
			diaact=diaact+1;
			contdia=contdia+1;
			//Cuando el contador de d�as llegue a 7, salto de l�nea ('\n')
			if(contdia==7){
				System.out.print('\n');
				//Cada salto de l�nea, reiniciar el contador
				contdia=0;
			}
		//Finalizar el ciclo cuando se acaben los d�as del mes
		}while(diaact<=ndias);
	}
}
