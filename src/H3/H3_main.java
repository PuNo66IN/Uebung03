package H3;

public class H3_main {

	public static void main(String[] args) {
		// Initialwerte
        int max = 100;       // maximale Anzahl an Fixplätzen
        int fix = 7;        // bereits vergebene Fixplätze
        int wartend = 5;    // Personen auf der Warteliste
        boolean istVoll = false; // beliebiger Startwert, wird im Programm korrekt gesetzt

        // Berechnung: Wie viele Plätze sind noch frei?
        int frei = max - fix;

        // Zuweisung von Fixplätzen, falls möglich
        if (frei > 0 && wartend > 0 && frei >= wartend) {
            fix = fix + wartend;
            wartend = 0;
            frei = max - fix;
        } else if (frei > 0 && wartend > 0 && frei < wartend) {
        	fix = max;
        	wartend = wartend - frei;
        	frei = 0;
        } 

        // Aktualisierung von istVoll
        if (fix >= max) {
            istVoll = true;
        } else {
            istVoll = false;
        }     
        // Ausgabe der aktuellen Situation
        System.out.println("max. Teilnehmerzahl: " + max);
        System.out.println("Fixplätze vergeben: " + fix);
        System.out.println("Personen auf Warteliste: " + wartend);
        System.out.println("Ist voll: " + istVoll);
        System.out.println("noch freie Plätze: " + frei);
	}

}
