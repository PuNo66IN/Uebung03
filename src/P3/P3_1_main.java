package P3;

public class P3_1_main {

	public static void main(String[] args) {
		int zahl = -42; // beliebiger Startwert

        if (zahl < 0) {
            zahl = -zahl;
        }

        System.out.println("Betrag: " + zahl);
	}

}
