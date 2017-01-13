package figura;

import java.io.IOException;

public class Figura {
	
	int dimension;
	char tipo;
	
	//Constructor vacío
	Figura (){
		dimension=1;
		tipo=' ';
	}
	
	//Constructor con dimensiones (este es el que vamos a usar para crear nuestra figura)
	Figura (int dim, char t){
		dimension=dim;
		tipo=t;
	}
	
	//Nos devuelve un resultado si cumple las condiciones y llama a la clase Bibliofigura dependiendo de en que caso nos encontremos
	boolean dibujar(){
		if(dimension>=3){
			if(tipo=='C'||tipo=='c'){
				Bibliofigura.dibujarC(dimension);
				return true;
			}else if(tipo=='T'||tipo=='t'){
				Bibliofigura.dibujarT(dimension);
				return true;
			}
		}
		return false;
	}
	 	
	public static void main(String[] args) throws IOException {
		int dim;
		char t;
		boolean b;
		
		System.out.print("Escriba la dimensión: ");
		dim=Consola.leeInt();
		System.out.print("Escriba la figura (C/T): ");
		t=Consola.leeChar();
		
		Figura f=new Figura(dim, t);	
		b=f.dibujar();
		if(b==false)
			System.out.println("no se ha podido dibujar");
		}
}
