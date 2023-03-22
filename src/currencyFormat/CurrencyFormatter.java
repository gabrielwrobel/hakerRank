package currencyFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {

    public static String format(Double payment) {

        List<Formatter> formaters = Arrays.asList(
                new USFormatter(),
                new IndiaFormatter(),
                new ChinaFormatter(),
                new FranceFormatter());

        return format(payment, formaters);
    }

    public static String format(Double payment, List<Formatter> formatters) {
        StringBuffer result = new StringBuffer();
        for (Formatter formatter : formatters) {
            result.append(formatter.format(payment) + "\n");
        }

        return result.toString();
    }
}

interface Formatter {
    String format(Double payment);
}

class USFormatter implements Formatter {
    @Override
    public String format(Double payment) {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return "US: " + currencyFormatter.format(payment);
    }
}

class IndiaFormatter implements Formatter {
    @Override
    public String format(Double payment) {
        NumberFormat indiaFormat = NumberFormat.getInstance();
        indiaFormat.setMaximumFractionDigits(2);
        indiaFormat.setMinimumFractionDigits(2);
        String indiaFormatted = indiaFormat.format(payment);
        String india = String.format("India: Rs.%s", indiaFormatted);
        return india;
    }
}

class ChinaFormatter implements Formatter {
    @Override
    public String format(Double payment) {
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormatted = chinaFormat.format(payment);
        String china = String.format("China: %s", chinaFormatted);
        return china;
    }
}

class FranceFormatter implements Formatter {

    @Override
    public String format(Double payment) {
        String franceFormatted = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String france = String.format("France: %s", franceFormatted);
        return france;
    }
}
