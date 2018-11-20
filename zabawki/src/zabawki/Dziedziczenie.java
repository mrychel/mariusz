package zabawki;

public class Dziedziczenie {

	public static void main(String[] args) {
		
		Trojkat pierwsza_instancja_trojkata = new Trojkat(10, 3);
		Trojkat inna_instancja_trojkata = new Trojkat(5, 4);
		
		double pole_jakiegos_jeszcze_innego_trojkata = (new Trojkat(6, 9)).pole();
		
		System.out.println("pole pierwszego trojkata: "+pierwsza_instancja_trojkata.pole());
		System.out.println("pole innej instancji trojkata: "+inna_instancja_trojkata.pole());
		System.out.println("pole_jakiegos_jeszcze_innego_trojkata: "+pole_jakiegos_jeszcze_innego_trojkata);
	}
	
	

}
