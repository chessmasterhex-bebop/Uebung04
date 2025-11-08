package p3;

/**
 * Präsenzaufgabe 3 - Wahrheitstabellen
 *
 * Evaluierung der vier Ausdrücke für alle Kombinationen von x,y ∈ {true, false}.
 * Zusätzliche Ausgabe: erklärende Zwischenschritte und algebraische Vereinfachung.
 */
public class P3_main {

    public static void main(String[] args) {
        boolean[] vals = { true, false };

        System.out.println("x\t y\t a: !(x!=y && x==y)\t b: x || true\t c: x && false\t d: (x && !y) || (!x)");
        System.out.println("---------------------------------------------------------------------------------------");

        for (boolean x : vals) {
            for (boolean y : vals) {
                boolean a = !(x != y && x == y);        // immer true, da (x!=y && x==y) unmöglich
                boolean b = x || true;                  // immer true
                boolean c = x && false;                 // immer false
                boolean d = (x && !y) || (!x);          // vereinfacht zu (!x || !y) == !(x && y)

                System.out.printf("%b\t %b\t %b\t\t\t %b\t\t %b\t\t %b%n",
                        x, y, a, b, c, d);
            }
        }

        System.out.println("\nKurze Erklärungen:");
        System.out.println("a) (x!=y && x==y) kann nie wahr sein -> a ist immer true.");
        System.out.println("b) x || true -> true (immer).");
        System.out.println("c) x && false -> false (immer).");
        System.out.println("d) (x && !y) || (!x)  = (!x) || (x && !y)  (Distributiv) ");
        System.out.println("   = (!x || x) && (!x || !y) = true && (!x || !y) = !x || !y");
        System.out.println("   => d ist äquivalent zu !(x && y).");
    }
}
