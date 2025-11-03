package H2;

public class H2_main {

	public static void main(String[] args) {
		int jahr = 1300;
		boolean schalt = false;
		if (jahr %4 ==0) {		
			if (jahr %100 ==0) {	
				if (jahr %400 ==0) {
					schalt = true;
				} else {
					schalt = false;
				}
			} else {
				schalt = true;
			}	
		}
		// Ausgabe
		System.out.println("es handelt sich um ein Schaltjahr = " + schalt);		
	}

}
