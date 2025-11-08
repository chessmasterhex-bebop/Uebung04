package h1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class H1_main {

    public static void main(String[] args) {

        int zone = 3;   // <- wird vom Autograder ersetzt
        double price;

        switch (zone) {
            case 1 -> price = 2.00;
            case 2 -> price = 2.35;
            case 3, 4 -> price = 2.85;
            case 5 -> price = 3.55;
            default -> price = 4.00;
        }

        // Deutsches Kommaformat explizit erzwingen
        DecimalFormat df = new DecimalFormat("#0.00");
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.GERMANY));

        // exakt wie Aufgabenstellung: "2,85 €"
        System.out.println(df.format(price) + " €");
    }
}
