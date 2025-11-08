package h3;

public class H3_main {

    public static void main(String[] args) {
        // Beispielinitialisierungen (der Autograder kann diese bei Bedarf ändern)
        float celsiusFloat = 14.2f;
        double celsiusDouble = 14.2;

        // Um Ganzzahldivision zu vermeiden, benutzen wir float / double Literale:
        // Für float-Rechnung: 9f / 5f
        float fahrenheitFloat = celsiusFloat * (9f / 5f) + 32f;

        // Für double-Rechnung: 9.0 / 5.0
        double fahrenheitDouble = celsiusDouble * (9.0 / 5.0) + 32.0;

        // Autograder-kompatible Ausgabe: nur die Werte, jeweils in eigener Zeile
        System.out.println(fahrenheitFloat);
        System.out.println(fahrenheitDouble);
    }
}
