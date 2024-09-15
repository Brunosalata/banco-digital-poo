package com.brunosalata;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}