package p2;

/**
 * Präsenzaufgabe 2 - Typumwandlungen und Ausdrücke
 *
 * - Zeigt die Originalauswertung der Ausdrücke (a)-(f)
 * - Korrigiert (d) und (e) so, dass doubleResult den mathematisch erwarteten double-Wert enthält.
 * - Jede Korrektur verwendet höchstens einen zusätzlichen Operator (hier: ein Cast).
 *
 */
public class P2_main {

    public static void main(String[] args) {
        // Gegebene Werte
        int a = 3, b = 5, c = 6;
        double x = 1.5, y = 2.3;

        // Zielvariablen
        int intResult;
        double doubleResult;

        System.out.println("=== Präsenzaufgabe 2: Auswertung (explizite Zwischenschritte) ===\n");

        // ----------------------------
        // (a) intResult = c - a * 3;
        // ----------------------------
        System.out.println("(a) intResult = c - a * 3;");
        // Schritt 1: a * 3 = 3 * 3 = 9
        int stepA1 = a * 3; // 9
        System.out.println("    Schritt 1: a * 3 = " + a + " * 3 = " + stepA1 + "  (int)");
        // Schritt 2: c - 9 = 6 - 9 = -3
        int stepA2 = c - stepA1; // -3
        System.out.println("    Schritt 2: c - " + stepA1 + " = " + c + " - " + stepA1 + " = " + stepA2 + "  (int)");
        intResult = stepA2;
        System.out.println("    Ergebnis: intResult = " + intResult + "  (Typ: int)\n");

        // ----------------------------
        // (b) intResult = c / b;
        // ----------------------------
        System.out.println("(b) intResult = c / b;");
        // Ganzzahlige Division: 6 / 5 -> Quotient 1, Rest 1
        int div_b = c / b; // 1
        int rem_b = c % b; // 1 (nur informativ)
        System.out.println("    Ganzzahlige Division: " + c + " / " + b + " = " + div_b + "  (Rest " + rem_b + ")");
        intResult = div_b;
        System.out.println("    Ergebnis: intResult = " + intResult + "  (Typ: int)\n");

        // ----------------------------
        // (c) intResult = a + b / c;
        // ----------------------------
        System.out.println("(c) intResult = a + b / c;");
        // Division zuerst: b / c = 5 / 6 -> 0 (Ganzzahldivision)
        int div_c = b / c; // 0
        int stepC = a + div_c; // 3 + 0 = 3
        System.out.println("    Schritt 1: b / c = " + b + " / " + c + " = " + div_c + "  (Ganzzahldivision)");
        System.out.println("    Schritt 2: a + " + div_c + " = " + a + " + " + div_c + " = " + stepC);
        intResult = stepC;
        System.out.println("    Ergebnis: intResult = " + intResult + "  (Typ: int)\n");

        // ----------------------------
        // (d) doubleResult = c / b;
        // ----------------------------
        System.out.println("(d) doubleResult = c / b;");
        // Ohne Korrektur: c / b ist int 6/5 = 1 -> dann beim Assign zu double -> 1.0
        int rawDiv_d = c / b; // 1
        System.out.println("    Ohne Korrektur (ganzzahlige Division): " + c + " / " + b + " = " + rawDiv_d + "  (Typ: int)");
        doubleResult = rawDiv_d; // implizite Promotion -> 1.0
        System.out.println("    doubleResult (original) = " + doubleResult + "  (aus int -> double, also 1.0)");
        // Korrektur: mache die Division als double mittels eines einzigen Cast-Operators
        double corrected_d = (double) c / b; // (double)6 / 5 -> 6.0 / 5 -> 1.2
        System.out.println("    Korrektur (ein Operator): (double)c / b = " + corrected_d + "  (Typ: double)");
        System.out.println("    => Setze doubleResult = (double)c / b;  -> doubleResult = " + corrected_d + "\n");

        // ----------------------------
        // (e) doubleResult = c + a / b;
        // ----------------------------
        System.out.println("(e) doubleResult = c + a / b;");
        // Ohne Korrektur: a / b = 3/5 = 0 (int), dann c + 0 = 6 -> assigned -> 6.0
        int rawDiv_e = a / b; // 0
        System.out.println("    Ohne Korrektur (ganzzahlige Division): a / b = " + a + " / " + b + " = " + rawDiv_e + "  (Typ: int)");
        doubleResult = c + rawDiv_e; // 6 -> 6.0
        System.out.println("    doubleResult (original) = " + doubleResult + "  (weil c + 0 = 6 -> 6.0)");
        // Korrektur: ein Cast genügt -> c + (double)a / b  => 6 + 3.0/5 = 6.6
        double corrected_e = c + (double) a / b; // 6 + 3.0/5 = 6.6
        System.out.println("    Korrektur (ein Operator): c + (double)a / b = " + corrected_e + "  (Typ: double)");
        System.out.println("    => Setze doubleResult = c + (double)a / b;  -> doubleResult = " + corrected_e + "\n");

        // ----------------------------
        // (f) doubleResult = x + y * b;
        // ----------------------------
        System.out.println("(f) doubleResult = x + y * b;");
        // y * b: 2.3 * 5 = 11.5 (double), x + 11.5 = 13.0
        double mult_f = y * b; // 2.3 * 5 = 11.5
        double sum_f = x + mult_f; // 1.5 + 11.5 = 13.0
        System.out.println("    y * b = " + y + " * " + b + " = " + mult_f + "  (double)");
        System.out.println("    x + (y*b) = " + x + " + " + mult_f + " = " + sum_f + "  (double)");
        doubleResult = sum_f;
        System.out.println("    Ergebnis: doubleResult = " + doubleResult + "  (Typ: double)\n");

        // Kurze Zusammenfassung
        System.out.println("=== Zusammenfassung (Original vs korrigiert) ===");
        System.out.println("(a) c - a*3 -> int = -3");
        System.out.println("(b) c / b  -> int = 1   (ganzzahldivision)");
        System.out.println("(c) a + b/c -> int = 3  (b/c = 0 als int)");
        System.out.println("(d) original: c/b -> int 1 => doubleResult = 1.0");
        System.out.println("    korrigiert: (double)c / b -> 1.2");
        System.out.println("(e) original: c + a/b -> 6 => doubleResult = 6.0");
        System.out.println("    korrigiert: c + (double)a / b -> 6.6");
        System.out.println("(f) x + y*b -> 13.0 (bereits double)");
    }
}
