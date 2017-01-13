package ejercicio2;

public class Loro extends Ave {
	char region;
	String color;
	
	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}

	Loro(char s, int e, char r, String c) {
		super(s, e);
		region = r;
		color = c;
	}

	void deDondeEres(){
		if(region=='n'||region=='N'){
			System.out.println("Norte");
		}
		else if(region=='s'||region=='S'){
			System.out.println("Sur");
		}
		else if(region=='e'||region=='E'){
			System.out.println("Este");
		}
		else if(region=='o'||region=='O'){
			System.out.println("Oeste");
		}
		else{
			System.out.println("Otro");
		}
	}
}
