package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import java.math.BigDecimal;
import java.util.Currency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Marketa Elederova
 */
public class MainJavaConfig {

    public static void main(String args[]) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        CurrencyConvertor currencyConvertor = context.getBean("currencyConvertor", CurrencyConvertor.class);
        BigDecimal result = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE);
        System.out.println(result);
    }
}
