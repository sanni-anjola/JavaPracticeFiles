package africa.semicolon.chapterEightExercises;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Interest {
    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);
        BigDecimal amount;
        System.out.printf("%-4s %-10s%n", "Year", "Interest");
        for (int year = 1; year <= 10 ; year++) {
            amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%-4d %10s%n",year, NumberFormat.getCurrencyInstance().format(amount));
        }

        MathContext m = new MathContext(4); // setting precision
        BigDecimal num = new BigDecimal("1000.00", m);
        num = num.setScale(3, RoundingMode.HALF_UP);
        System.out.println(num);
    }
}
