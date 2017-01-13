package tanda2;

import java.io.IOException;

public class Ej4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n, distancia, distanciamin=1000000;
		char origen, destino, origenmin='A', destinomin='B';
		
		System.out.print("Introduzca el n�mero de trayectos: ");
		n=Consola.leeInt();
		
		for(int cont=1; cont<=n; cont++){
			System.out.println("Para el trayecto n� "+cont+": ");
			System.out.println("Introduzca la ciudad de origen");
			origen=Consola.leeChar();
			System.out.println("Introduzca la ciudad de destino");
			destino=Consola.leeChar();
			System.out.println("Introduzca la distancia entre "+origen+" y "+destino);
			distancia=Consola.leeInt();
			
			if (distancia<distanciamin){
				distanciamin=distancia;
				origenmin=origen;
				destinomin=destino;
			}
		}
		
		System.out.println("La distancia m�s corta est� entre "+origenmin+" y "+destinomin+" y es de "+distanciamin+" km.");
	} 

}
