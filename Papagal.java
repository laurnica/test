
public class Papagal {
	
	public String nume;
	public String culoare;
	public String stapan;
	int varsta;  // este initializat default la ZERO 
	int intensitateCiripit=50;
	
	public Papagal(String nume,int intensitate) {
		intensitateCiripit=intensitate;
		this.nume=nume;
	}

	public Papagal() {
	}

	public void ciripeste() {
		System.out.println("Cirip Cirip sunt " + nume + " si cant cu " + intensitateCiripit + " DB");
	}
	
	public void zboara() {
		System.out.println("Flop flop flop, sunt " + nume);
	}
	

}
