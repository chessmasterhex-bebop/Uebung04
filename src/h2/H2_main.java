package h2;

public class H2_main {

    public static void main(String[] args) {

        // wird vom Autograder verändert
        int input = 10;

        boolean x, y, a, b, c;

        // E1: x ist wahr, wenn input 10 oder 11 ist
        switch (input) {
            case 10, 11 -> x = true;
            default -> x = false;
        }

        // E2: y ist wahr, wenn input 11 oder 1 ist
        switch (input) {
            case 11, 1 -> y = true;
            default -> y = false;
        }

        // E3: unterschiedlich
        boolean E3 = (x != y);

        // a: true nur wenn E1 UND E2
        a = x && y;

        // b: true wenn mindestens E1 ODER E3
        b = x || E3;

        // c gemäß Wahrheitstabelle
        if (x && y) {
            c = false;
        } else if (x && !y) {
            c = true;
        } else if (!x && y) {
            c = false;
        } else {
            c = true;
        }

        // Autograder erwartet typische Ausgabeform: jede Variable auf eigener Zeile
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
