package com.andrade.bytebank;

public class Conta {
    public double saldo;
    public int agencia, numero;
    public String titular;

    public void desposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
