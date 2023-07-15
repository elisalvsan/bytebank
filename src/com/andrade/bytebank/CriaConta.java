package com.andrade.bytebank;

public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 200;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        primeiraConta.saldo += 104;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 1200;
        System.out.println("Saldo da segunda conta: " +segundaConta.saldo);
    }
}
