package org.example;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
