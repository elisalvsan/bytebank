package com.andrade.bytebank.teste;

import com.andrade.bytebank.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoJosias = new Conta();

        contaDoJosias.saldo = 100;
        contaDoJosias.desposita(50);
        System.out.println("Saldo de Josias: " + contaDoJosias.saldo);

        boolean retiraValor = contaDoJosias.saca(35);
        System.out.println("Saldo de Josias: " + contaDoJosias.saldo);
        System.out.println(retiraValor);

        retiraValor = contaDoJosias.saca(600);
        System.out.println("Saldo de Josias: " + contaDoJosias.saldo);
        System.out.println(retiraValor);

        Conta contaDaClaudia = new Conta();

        contaDaClaudia.saldo = 1500;
        System.out.println("Saldo de Claudia: " + contaDaClaudia.saldo);

        if(contaDaClaudia.transfere(520, contaDoJosias)){
            System.out.println("Transferencia realizada com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo de Claudia: " + contaDaClaudia.saldo);
        System.out.println("Saldo de Josias: " + contaDoJosias.saldo);
    }
}
