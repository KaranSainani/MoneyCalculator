package model;

import java.util.Date;

/**
 * class ExchangeRate
 * 
 * @author Karan Nandpal Sainani
 * @group: 2.20(46)
 */

public class ExchangeRate {
    
    private final Currency from;
    private final Currency to;
    private final Date date;
    private final double rate;

    public ExchangeRate(Currency from, Currency to, Date date, double rate) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.rate = rate;
    }
    

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
}
