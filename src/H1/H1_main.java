package H1;

public class H1_main {

	public static void main(String[] args) {
        // Deklaration und Initialisierung
        double guthaben = -8.0;
        double monEingang =9.0;
        int rating = 0;
        boolean negativ;
        boolean warnhinweis;

        // Regel 1: negativ setzen
        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }

        // Regel 2: Guthaben > 0 → rating+3
        if (guthaben > 0) {
            rating += 3;
        }

        // Regel 3: Guthaben == 0 → +2
        else if (guthaben == 0) {
            rating += 2;
        }

        // Regel 4 & 5: Guthaben < 0 → +1 oder -1 je nach monEingang
        else {
            if (Math.abs(monEingang) >= Math.abs(guthaben)) { //Absolutwert von "monEingang" ist grösser oder gleich dem Absolutwert von "guthaben"
                rating += 1;
            } else {
                rating -= 1;
            }
        }

        // Regel 6: Warnhinweis setzen
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        // Ausgabe
        System.out.println("Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);
        System.out.println("Warnhinweis: " + warnhinweis);
	}

}
