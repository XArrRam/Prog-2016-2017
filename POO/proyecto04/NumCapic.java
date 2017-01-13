package proyecto04;

import java.io.IOException;

public class NumCapic {

	long num;
	boolean escapicua;
	
	NumCapic(){
		num=0;
	}
	
	NumCapic(long n){
		num=n;
		escapicua=this.capicua();
	}

	static int cantDigitos(long n){
		int dig=1;
		
		while(n>=10){
			n=n/10;
			dig=dig+1;
		}
		//System.out.println(dig);
		return dig;
	}

	int digitoEnPosicionN(int n){
		int dig,res=0;
		dig=NumCapic.cantDigitos(num);
		long aux=num;
		n=dig-n+1;
				
		for(int cont=1;cont<=n;cont++){
			res=(int) (aux%10);
			aux=aux/10;
		}
		return res;
	}
	
	boolean capicua(){
		int dig=NumCapic.cantDigitos(num);
		boolean cap=true;

		for(int cont=1; cont<=dig/2; cont++){
			if(digitoEnPosicionN(cont)!=digitoEnPosicionN(dig-cont+1)){
				cap=false;
			}
		}
		return cap;
	}
	
	public static void main(String[] args) throws IOException{
		long n;
		
		System.out.print("Introduzca el número 1: ");
		n=Consola.leeLong();
		NumCapic nc1=new NumCapic(n);
		if (nc1.escapicua){
		//if(nc1.capicua()==true){
			System.out.println("ES CAPICÚA");
		}
		else{
			System.out.println("NO ES CAPICÚA");
		}
		
		System.out.print("Introduzca el número 2: ");
		n=Consola.leeLong();
		NumCapic nc2=new NumCapic(n);
		if (nc2.escapicua){
		//if(nc2.capicua()==true){
			System.out.println("ES CAPICÚA");
		}
		else{
			System.out.println("NO ES CAPICÚA");
		}
		
		System.out.print("Introduzca el número 3: ");
		n=Consola.leeLong();
		NumCapic nc3=new NumCapic(n);
		if (nc3.escapicua){
		//if(nc3.capicua()==true){
			System.out.println("ES CAPICÚA");
		}
		else{
			System.out.println("NO ES CAPICÚA");
		}
		
		System.out.print("Introduzca el número 4: ");
		n=Consola.leeLong();
		NumCapic nc4=new NumCapic(n);
		if (nc4.escapicua){
		//if(nc4.capicua()==true){
			System.out.println("ES CAPICÚA");
		}
		else{
			System.out.println("NO ES CAPICÚA");
		}
		
		System.out.print("Introduzca el número 5: ");
		n=Consola.leeLong();
		NumCapic nc5=new NumCapic(n);
		if (nc5.escapicua){
		//if(nc5.capicua()==true){
			System.out.println("ES CAPICÚA");
		}
		else{
			System.out.println("NO ES CAPICÚA");
		}
	}
}
