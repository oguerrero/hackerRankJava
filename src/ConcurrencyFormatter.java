import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ConcurrencyFormatter {
    public static void main(String[] args) throws ParseException {
        try {
            getConcurrency();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getConcurrency() throws ParseException {
       /* US: $12,324.13
        India: Rs.12,324.13
        China: ￥12,324.13
        France: 12 324,13 €*/
        Scanner sc = new Scanner(System.in);
        Double amount = sc.nextDouble();

        /* Print output */
        System.out.println("US: "     + NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        System.out.println("India: "  + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount));
        System.out.println("China: "  + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));

        sc.close();
    }
}
