package model;

/**
 * class CurrencyList
 * 
 * @author: Karan Nandpal Sainani
 * @group: 2.20(46)
 */
import java.util.HashMap;
import java.util.Map;

public final class CurrencyList {
    
    private final Map<String, Currency> currencies = new HashMap<>();

    public CurrencyList() {
        add(new Currency("USD","Dolar americano","$"));
        add(new Currency("EUR","Euro","€"));  
        add(new Currency("GBP", "Libras Esterlinas", "£"));
        add (new Currency("JPY","Yen japonés","¥"));
        add (new Currency("INR", "Rupia India", "₹"));
        
    }
    
    public void add(Currency currency) {
        currencies.put(currency.getCode(), currency);
    }

    public Currency get(String code) {
        return currencies.get(code.toUpperCase());
    }
}
