package proyecto02;

import proyecto02.CuentaBancaria;
import proyecto02.Persona;

public class Principal {

	public static void main(String[] args) {
		
		//Crear personas
		Persona p1=new Persona("Juan López", 30, 'H');
		Persona p2=new Persona("Ana Agirre", 25, 'M');
		Persona p3=new Persona("Jorge Gil", 58, 'H');
		
		/*//Crear cuentas bancarias
		CuentaBancaria c1=new CuentaBancaria("Juan López");
		CuentaBancaria c2=new CuentaBancaria("Ana Agirre");
		CuentaBancaria c3=new CuentaBancaria("Jorge Gil",800);
		System.out.println();*/
		
		//Crear cuentas bancarias
		CuentaBancaria c1=new CuentaBancaria(p1);
		CuentaBancaria c2=new CuentaBancaria(p2);
		CuentaBancaria c3=new CuentaBancaria(p3,800);
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();

		//Iniciar saldos
		System.out.println("------------------MOVIMIENTOS------------------");
		c1.ingresar(500);
		System.out.println("El saldo de la cuenta de "+p1.nombre+" es ahora "+c1.saldo+"€");
		c2.ingresar(2000);
		System.out.println("El saldo de la cuenta de "+p2.nombre+" es ahora "+c2.saldo+"€");
		c3.ingresar(100);
		System.out.println("El saldo de la cuenta de "+p3.nombre+" es ahora "+c3.saldo+"€");
		System.out.println();
		System.out.println();
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();
		
		//Ingresar 100
		System.out.println("------------------MOVIMIENTOS------------------");
		c1.gastar(100);
		System.out.println("El saldo de la cuenta de "+p1.nombre+" es ahora "+c1.saldo+"€");
		c2.gastar(100);
		System.out.println("El saldo de la cuenta de "+p2.nombre+" es ahora "+c2.saldo+"€");
		c3.gastar(100);
		System.out.println("El saldo de la cuenta de "+p3.nombre+" es ahora "+c3.saldo+"€");
		System.out.println();
		System.out.println();
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();
		
		//Gastar 500
		System.out.println("--------------MOVIMIENTOS (-500€)--------------");
		c1.gastar(500);
		System.out.println("El saldo de la cuenta de "+p1.nombre+" es ahora "+c1.saldo+"€");
		c2.gastar(500);
		System.out.println("El saldo de la cuenta de "+p2.nombre+" es ahora "+c2.saldo+"€");
		c3.gastar(500);
		System.out.println("El saldo de la cuenta de "+p3.nombre+" es ahora "+c3.saldo+"€");
		System.out.println();
		System.out.println();
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();
		
		//Ingresar 2.000.000 en la cuenta 3
		System.out.println("---------------MOVIMIENTOS (+2M)---------------");
		c3.ingresar(2000000);
		System.out.println("El saldo de la cuenta de "+p3.nombre+" es ahora "+c3.saldo+"€");
		System.out.println();
		System.out.println();
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();
		
		//Traspaso
		System.out.println("------------MOVIMIENTOS (TRASPASO)-------------");
		c3.gastar(100);
		System.out.println("El saldo de la cuenta de "+p3.nombre+" es ahora "+c3.saldo+"€");
		c1.ingresar(100);
		System.out.println("El saldo de la cuenta de "+p1.nombre+" es ahora "+c1.saldo+"€");
		System.out.println();
		System.out.println();
		
		//Visualizar cuentas
		System.out.println("------------------VER CUENTAS------------------");
		c1.ver();
		c2.ver();
		c3.ver();
		System.out.println();
		System.out.println();
	}
}
