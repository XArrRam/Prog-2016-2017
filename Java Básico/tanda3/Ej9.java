package tanda3;

import java.io.IOException;

public class Ej9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;
		//Pedir datos
		System.out.print("Introducir número de filas: ");
		n=Consola.leeInt();
		for(int contfilas=n;contfilas>=1;contfilas--){
			for(int contblancos=1;contblancos<=(contfilas-1);contblancos++){
				System.out.print("  ");
			}
			System.out.print("X X X X");
			System.out.print('\n');
		}
	}

}
