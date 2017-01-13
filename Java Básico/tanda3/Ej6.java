package tanda3;

import java.io.IOException;

public class Ej6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int mes,dia,ndias,nblanco=0,diaact=1,contdia=0;
		//Pedir datos
		do{
			System.out.print("Introduzca el número del mes (Enero=1, Febrero=2, Marzo=3...): ");
			mes=Consola.leeInt();
			if(mes<=0||mes>12){
				System.out.println("Error. Introduzca un valor válido");
			}
		}while(mes<=0||mes>12);
		do{
			System.out.print("Introduzca el número del día en el que empieza el mes (Lunes=1, Martes=2, Miércoles=3...): ");
			dia=Consola.leeInt();
			if(dia<=0||dia>7){
				System.out.println("Error. Introduzca un valor válido");
			}
		}while(dia<=0||dia>7);
		/*Plantear todas las opciones diferentes de cada mes en un switch (default:febrero=28 días) 
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
		//Para cada dia "vacio" de la primera semana añadir un espacio en blanco (4x barra espaciadora)
		while(nblanco<(dia-1)){
			nblanco=nblanco+1;
		}
		//Escribir siempre la primera linea (L-D)
		System.out.println("L   M   X   J   V   S   D");
		//Escribir los huecos de los dias que faltan
		for(int cont=1;cont<=nblanco;cont++){
			System.out.print("    ");
			//Contar estos espacios vacíos como días para que funcione el salto de línea
			contdia=contdia+1;
		}
		//Empezar a escribir los numeros de los dias y que se vayan incrementando en cada paso
		do{
			//Si el número tiene dos dígitos se descuadra, asi que se añade un espacio más pequeño
			if(diaact>=10){
				System.out.print(diaact+"  ");
			}
			//Si el número tiene solo un dígito espacios normales
			else{
				System.out.print(diaact+"   ");
			}
			//Aumentar el día que se va a escribir y el contador de días de cada semana
			diaact=diaact+1;
			contdia=contdia+1;
			//Cuando el contador de días llegue a 7, salto de línea ('\n')
			if(contdia==7){
				System.out.print('\n');
				//Cada salto de línea, reiniciar el contador
				contdia=0;
			}
		//Finalizar el ciclo cuando se acaben los días del mes
		}while(diaact<=ndias);
	}
}
