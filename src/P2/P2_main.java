package P2;

public class P2_main {

	public static void main(String[] args) {
		// Beispielwerte
        int a = 49;
        int b = 50;
        int c = 100;
        int d = 0; // Zähler für erfüllte Eigenschaften

        // E1: a == b
        if (a == b) {
            d++;
        }

        // E2: a == b oder a == c
        if (a == b || a == c) {
            d++;
        }

        // E3: a + b >= c
        if (a + b >= c) {
            d++;
        }

        // E4: a + b + c >= 100
        if (a + b + c >= 100) {
            d++;
        }

        // Ausgabe
        System.out.println("Anzahl erfüllter Eigenschaften: " + d);

	}

}
