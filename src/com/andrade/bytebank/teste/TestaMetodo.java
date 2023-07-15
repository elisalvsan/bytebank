package com.andrade.bytebank.teste;

import com.andrade.bytebank.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 100;
        conta.desposita(50);
        System.out.println(conta.saldo);

        boolean retiraValor = conta.saca(35);
        System.out.println(conta.saldo);
        System.out.println(retiraValor);

        retiraValor = conta.saca(600);
        System.out.println(conta.saldo);
        System.out.println(retiraValor);
    }
}
