package tanda3;

import java.io.IOException;

public class Ej1 {

	public static void main(String[] args) throws IOException {

		int n, cod, nh, sal,edadh,conth2=0, edadmin=151,sumsal=0,contfamnum=0,nhmax=0,codmax=0;
		char sexh;
		//Pedir el número N de familias
		System.out.print("Inroduzca el número de familias a analizar: ");
		n=Consola.leeInt();
		//En un for de 1 a n pedir todos los daros de cada familia y mostrar en pantalla los resultados de cada una
		for(int cont=1;cont<=n;cont++){
			System.out.println("Para la familia nº "+cont);
			System.out.println();
			System.out.print("Introduzca el código de la familia: ");
			cod=Consola.leeInt();
			System.out.print("Introduzca el salario medio de la familia: ");
			sal=Consola.leeInt();
			System.out.print("Introduzca el número de hijos: ");
			nh=Consola.leeInt();
			System.out.println();
			//Guardar el código de la familia con más hijos
			if(nh>=nhmax){
				codmax=cod;
			}
			//Si la familia no tiene hijos mostrar un mensaje
			if(nh==0){
				System.out.println("La familia "+cont+" no tiene hijos.");
				System.out.println();
			}
			else{
				//Sumar los salarios de las familias con 3 o más hijos
				if(nh>=3){
					sumsal=sumsal+sal;
					contfamnum=contfamnum+1;
				}
				//En un for de 1 al numero de hijos pedir todos los datos necesarios para cada uno de ellos (validados)
				for(int conth=1;conth<=nh;conth++){
					System.out.println("Para el hijo nº "+conth);
					System.out.println();
					do{
						System.out.print("Introduzca la edad: ");
						edadh=Consola.leeInt();
						if (edadh<0||edadh>150){
							System.out.println("Error. Introduzca un dato válido (0-150)");
						}
					}while(edadh<0||edadh>150);
					do{
						System.out.print("Introduzca el sexo (H/M): ");
					sexh=Consola.leeChar();
					System.out.println();
						if(sexh!='h' && sexh!='H' && sexh!='m' && sexh!='M'){
							System.out.println("Error. Introduzca un dato válido (H/M)");
						}
					}while(sexh!='h' && sexh!='H' && sexh!='m' && sexh!='M');
					//Contar los hijos varones de entre 10 y 15 años
					if(sexh=='h' || sexh=='H'){
						if(edadh>=10 && edadh<=15){
							conth2=conth2+1;
						}
					}
					if(edadh<edadmin){
						edadmin=edadh;
					}
				}
			System.out.println("La familia "+cont+" tiene "+conth2+" hijo(s) con edad(es) entre 10 y 15 años.");
			System.out.println();
			System.out.println("La edad mínima de los hijos de la familia "+cont+" es "+edadmin+" años.");
			System.out.println();
			}
		}
		if(contfamnum!=0){
			System.out.println("El salario medio de las familias numerosas es "+(sumsal/contfamnum)+"€.");
			System.out.println();
		}
		else{
			System.out.println("No hay familias numerosas.");
			System.out.println();
		}
		System.out.println("El código de la familia con mayor número de hijos es "+codmax+".");
	}
}