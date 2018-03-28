package com.example.Money;

public class Money {
    private int valor;
    private String moneda;

    public Money(int i,String money) {
        valor=i;
        moneda=money;
    }
    public int add(Money i){
        if(moneda.equals(i.getMoneda())){
            return valor+i.valor;
        }
        return 0;
    }

    public String getMoneda() {
        return moneda;
    }

    public int getValor() {
        return valor;
    }
}
