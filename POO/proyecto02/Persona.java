package proyecto02;

public class Persona {
	String nombre;
	int edad;
	char sexo;
	
	
	//Constructor 
	Persona(String nom, int ed, char s){
		nombre=nom;
		edad=ed;
		sexo=s;
	}
	String verNombre(){
		return this.nombre;
	}
}
