package figura;

public class Bibliofigura {
	
	static void dibujarC(int dimension){
		for(int numfila=1; numfila<=dimension; numfila++){
			if(numfila==1|numfila==dimension){
				for(int numcol=1; numcol<=dimension; numcol++){				
					System.out.print("X ");
				}
			}
			else{
				System.out.print("X ");
			}
			System.out.println();	
		}
		
	}

	static void dibujarT(int dimension){
		for(int numfila=1;numfila<=dimension;numfila++){
			for(int numblanco=1;numblanco<=dimension-numfila;numblanco++){
				System.out.print("  ");
			}
			for(int numcol=1; numcol<=numfila;numcol++){
				System.out.print("X ");
			}
			System.out.println();
		}
	}	
}	