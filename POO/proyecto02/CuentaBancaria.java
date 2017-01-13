package proyecto02;

import proyecto02.Persona;

public class CuentaBancaria {
	
	/*String nombre;*/
	
	Persona titular;
	double saldo;
	boolean numerosrojos=false;
		
	//Constructor con Saldo 0 por defecto	
	CuentaBancaria(Persona p){

	/*CuentaBancaria(String nom){
		nombre=nom;*/
		
		titular=p;
		saldo=0;
	}

	//Constructor que pide el saldo
	CuentaBancaria(Persona p, double sal){
		
		/*CuentaBancaria(String nom, double sal){	
		nombre=nom;*/
		
		titular=p;
		saldo=sal;
		if(saldo<0){
			numerosrojos=true;
		}
	}
	
	//Método para ingresar (Aumentar saldo)	
	void ingresar(double cant){
		this.saldo+=cant;
		if(this.saldo<0){
			numerosrojos=true;
		}
		else{
			numerosrojos=false;
		}
	}
	
	//Método para gastar (Decrementar saldo)	
	void gastar(double cant){
		
		/*if(cant>this.saldo){
			System.out.println("Error. La cuenta de "+this.nombre+" está en números rojos y no puede gastar");
		}
		else{
			this.saldo-=cant;
		}*/
		
		this.saldo-=cant;
		if(this.saldo<0){
			numerosrojos=true;
		}
		else{
			numerosrojos=false;
		}
	}
	
	//Método para ver cuentas		
	void ver(){
		
		/*System.out.print ("Cuenta de "+this.nombre+", Saldo: "+this.saldo);*/
		
		System.out.print ("Cuenta de "+titular.verNombre()+", Saldo: "+this.saldo);
		if(this.saldo>1000000){
			System.out.print(" (Cuenta VIP)");
		}
		if(numerosrojos==true){
			System.out.print(" (NR)");
		}
		System.out.println();
	}


}
