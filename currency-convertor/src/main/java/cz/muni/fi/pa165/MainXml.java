package cz.muni.fi.pa165;

import cz.muni.fi.pa165.currency.CurrencyConvertor;
import java.math.BigDecimal;
import java.util.Currency;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Marketa
 */
public class MainXml {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CurrencyConvertor currencyConvertor = (CurrencyConvertor)ctx.getBean("currencyConvertor");
        BigDecimal result = currencyConvertor.convert(Currency.getInstance("EUR"), Currency.getInstance("CZK"), BigDecimal.ONE);
        System.out.println(result);
    }
}
