package com.in28minutes.microservices.currencyexchangeservice;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {
    @Id
    private long id;

    private String currencyfrom;

    private String currencyto;

    private BigDecimal conversionMultiple;
    private int port;


    public ExchangeValue() {
    }

    public ExchangeValue(long id, String currencyfrom, String currencyto, BigDecimal conversionMultiple) {
        this.id = id;
        this.currencyfrom = currencyfrom;
        this.currencyto = currencyto;
        this.conversionMultiple = conversionMultiple;
    }

    public long getId() {
        return id;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurrencyfrom() {
        return currencyfrom;
    }

    public void setCurrencyfrom(String from) {
        this.currencyfrom = from;
    }

    public String getCurrencyto() {
        return currencyto;
    }

    public void setCurrencyto(String to) {
        this.currencyto = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }


}
