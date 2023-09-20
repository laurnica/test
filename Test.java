
public class Test {

	public static void main(String[] args) {
		
	//	System.out.println("Hello David !");
		
		Papagal primulPapagal = new Papagal();
		Papagal alDoileaPapagal = new Papagal();
		
		Papagal celMaiZbomotosPapagal = new Papagal("Gicu",70);
	

		primulPapagal.nume="Albert";
		primulPapagal.culoare="verde";
		
		alDoileaPapagal.nume="Sergiu";
	
		
		System.out.println(primulPapagal.culoare);
		System.out.println(primulPapagal.nume);
		System.out.println(primulPapagal.varsta);
		System.out.println(primulPapagal.stapan);
		
		
		
		//primulPapagal.zboara();
		//alDoileaPapagal.zboara();
		
		primulPapagal.ciripeste();
		alDoileaPapagal.ciripeste();		
		celMaiZbomotosPapagal.ciripeste();
		
		
		PapagalRegal smecher = new PapagalRegal("Constantin",100);
		System.out.println(smecher.intensitateCiripit);	
		smecher.ciripeste();
	}

}
