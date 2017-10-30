package cz.muni.fi.pa165.currency;

import java.math.BigDecimal;
import java.util.Currency;

/**
 *
 * @author Marketa
 */
public class ExchangeRateTableImpl implements ExchangeRateTable {

    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) throws ExternalServiceFailureException {

        if ((sourceCurrency == null) || (targetCurrency == null)) {
            throw new IllegalArgumentException();
        }
        if (sourceCurrency.getCurrencyCode().equals("EUR") && (targetCurrency.getCurrencyCode().equals("CZK"))) {
            return new BigDecimal(27);
        }
        if (sourceCurrency.getCurrencyCode().equals("CZK") && (targetCurrency.getCurrencyCode().equals("EUR"))) {
            return new BigDecimal(1).divide(new BigDecimal(27));
        }
        return null;
    }

}
