package p1;

import java.util.Scanner;

/**
 * Präsenzaufgabe 1 – Fahrstuhlsimulation (mit Eingabevalidierung)
 *
 * Zulässige Eingaben:
 *   -1 = Parkhaus
 *    0 = Angebote
 *    1 = Damenbekleidung
 *    2 = Herrenbekleidung
 *    3 = Kinderbekleidung
 *
 * Nur Werte von -1 bis 3 sind zulässig.
 * Bei ungültiger oder nicht-numerischer Eingabe -> Fehlermeldung + erneute Eingabe.
 */
public class P1_main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stockwerk;

        System.out.println("=== Fahrstuhl Display Simulation ===");

        while (true) {
            System.out.print("Bitte geben Sie eine Zahl von -1 bis 3 ein: ");

            // Prüft, ob überhaupt eine ganze Zahl eingegeben wurde
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Fehler: Das ist keine Zahl!");
                scanner.next();   // Eingabe verwerfen
                continue;         // Eingabe erneut anfordern
            }

            stockwerk = scanner.nextInt();

            // Bereich validieren
            if (stockwerk < -1 || stockwerk > 3) {
                System.out.println("❌ Fehler: Gültige Eingaben sind nur -1, 0, 1, 2 oder 3.");
                continue;
            }

            // gültige Eingabe -> Schleife verlassen
            break;
        }

        System.out.println("\n--- Teil 1: Einfache Anzeige ---");
        displaySingle(stockwerk);

        System.out.println("\n--- Teil 2: Display (höchste Etage oben) ---");
        displayFromTop(stockwerk);

        scanner.close();
    }


    /** Teil 1: Gibt nur das passende Label zur gewählten Etage aus */
    public static void displaySingle(int stockwerk) {
        switch (stockwerk) {
            case -1: System.out.println("Parkhaus");          break;
            case 0:  System.out.println("Angebote");         break;
            case 1:  System.out.println("Damenbekleidung");  break;
            case 2:  System.out.println("Herrenbekleidung"); break;
            case 3:  System.out.println("Kinderbekleidung"); break;
        }
    }


    /**
     * Teil 2: Display mit Fallthrough (höchste Etage oben).
     * Beispiel:
     *   Eingabe: 2
     *   Ausgabe:
     *      Herrenbekleidung
     *      Damenbekleidung
     *      Angebote
     *
     * Umsetzung per switch + Fallthrough (kein break zwischen den Stockwerken),
     * Ausnahme: -1 (Parkhaus) wird einzeln behandelt.
     */
    public static void displayFromTop(int stockwerk) {
        switch (stockwerk) {
            case 3:
                System.out.println("Kinderbekleidung");
                // fallthrough
            case 2:
                System.out.println("Herrenbekleidung");
                // fallthrough
            case 1:
                System.out.println("Damenbekleidung");
                // fallthrough
            case 0:
                System.out.println("Angebote");
                break;
            case -1:
                System.out.println("Parkhaus");
                break;
        }
    }
}
