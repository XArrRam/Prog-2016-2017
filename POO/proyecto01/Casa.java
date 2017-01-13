package proyecto01;

public class Casa {
	String direccion; // p.ej. Calle Álava, 39
	double superficie; 
	char tipo; // P para pisos, U para unifamiliares
	
	static int contador=0;
	
	Casa(String dir, double sup, char tip){
		direccion=dir;
		superficie=sup;
		tipo=tip;
		contador+=1;
		System.out.println("INSTANCIADA LA CASA "+contador);
	}
			
	void mostrar(){
		if(superficie>=0){
			if(tipo=='p'||tipo=='P'){
				System.out.println("Piso en "+direccion+". Superficie: "+superficie+"m2.");
			}
			else if(tipo=='u'||tipo=='U'){
				System.out.println("Vivienda unifamiliar en "+direccion+". Superficie: "+superficie+"m2.");
			}
			else{
				System.out.println("Los datos introducidos son incorrectos");
			}	
		}
		else{
			System.out.println("Los datos introducidos son incorrectos");
		}
	}
	
	double dameImpuesto(){
		if(superficie<60){
			return 0;
		}
		else if(superficie>=60&&superficie<=80){
			return (4.5*superficie);
		}
		else{
			return (5.5*superficie);
		}
	}
	
	boolean esVendible(){
		if(tipo=='u'||tipo=='U'||((tipo=='p'||tipo=='P')&&superficie<100)){
			return true;
		}
		return false;
	}

	boolean esSimilar(Casa c){
		if(this.tipo==c.tipo){
			if((this.superficie-c.superficie<10)&&(this.superficie-c.superficie)>-10){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}	
	}

	public static void main (String[]args){
	
	/*
		//crear las casas y asignar valores a las propiedades ----------CODIGO ANTIGUO-----------
		Casa casa1=new Casa();
			casa1.direccion="C/Rioja, 18";
			casa1.superficie=65;
			casa1.tipo='P';
			
		Casa casa2=new Casa();
			casa2.direccion="C/Alava, 5";
			casa2.superficie=150;
			casa2.tipo='U';
			
		Casa casa3=new Casa();
			casa3.direccion="C/Gorbea, 23";
			casa3.superficie=105.5;
			casa3.tipo='P';
												*/
		
		//Construir las casas a partir del constructor
		Casa casa1=new Casa("C/Rioja, 18",65,'P');
		Casa casa2=new Casa("C/Alava, 5",150,'U');
		Casa casa3=new Casa("C/Gorbea, 23",105.5,'P');
		System.out.println();
		
		//Mostrar las casas	
		System.out.println("--------------------CASAS--------------------");
		casa1.mostrar();
		casa2.mostrar();
		casa3.mostrar();
		
		System.out.println();
		
		//Cambiar superficie y mostrar
		System.out.println("-------------CAMBIO DE SUPERFICIE-------------");
		casa2.superficie-=5;
		System.out.println("La nueva superficie de la casa 2 es "+casa2.superficie+"m2");
		System.out.println();
		
		//Mostrar las casas	de nuevo
		casa1.mostrar();
		casa2.mostrar();
		casa3.mostrar();
		System.out.println();
		
		//Mostrar los impuestos de cada casa
		System.out.println("------------------IMPUESTOS------------------");
		System.out.println("El impuesto a pagar por la casa 1 es: "+casa1.dameImpuesto());
		System.out.println("El impuesto a pagar por la casa 2 es: "+casa2.dameImpuesto());
		System.out.println("El impuesto a pagar por la casa 3 es: "+casa3.dameImpuesto());
		System.out.println();
		
		//Mostrar las casas vendibles
		System.out.println("---------------CASAS VENDIBLES---------------");
		if(casa1.esVendible()==true){
			casa1.mostrar();
		}
		if(casa2.esVendible()==true){
			casa2.mostrar();
		}
		if(casa3.esVendible()==true){
			casa3.mostrar();
		}
		System.out.println();
		
		//Mostrar las casas similares
		System.out.println("---------------CASAS SIMILARES---------------");
		if(casa2.esSimilar(casa3)==true){
			System.out.println("Las casas 2 y 3 son similares");
		}
		else{
			System.out.println("Las casas 2 y 3 no son similares");
		}
		if(casa1.esSimilar(casa3)==true){
			System.out.println("Las casas 1 y 3 son similares");
		}
		else{
			System.out.println("Las casas 1 y 3 no son similares");
		}
		System.out.println();
		
		//Aumentar el tamaño de la casa 3
		System.out.println("-------------CAMBIO DE SUPERFICIE-------------");
		casa1.superficie+=35;
		System.out.println("La nueva superficie de la casa 1 es "+casa1.superficie+"m2");
		System.out.println();
		
		//Volver a mostrar las casas similares
		System.out.println("---------------CASAS SIMILARES---------------");
		if(casa1.esSimilar(casa3)==true){
			System.out.println("Las casas 1 y 3 son similares");
		}
		else{
			System.out.println("Las casas 1 y 3 no son similares");
		}
		System.out.println();
	}
}	

