package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import java.math.BigDecimal;
import java.util.Currency;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Marketa Elederova
 */
public class MainAnnotations {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-AutoScan.xml");
        CurrencyConvertor currencyConvertor = (CurrencyConvertor)context.getBean(CurrencyConvertor.class);
        BigDecimal result = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE);
        System.out.println(result);
    }
}
