package P1;

public class P1_main {

	public static void main(String[] args) {
		int wuerfel = (int)(Math.random() * 6) + 1; // Diese Funktion erzeugt eine Zufallszahl zwischen 1 und 6
        System.out.println("Gewürfelt wurde: " + wuerfel);

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("Gewonnen!");
        } else if (wuerfel == 2) {
            System.out.println("Verloren!");
        } else if (wuerfel == 5) {
            System.out.println("Unentschieden.");
        } else {
            System.out.println("Lage unklar.");
        }
	}

}
