package com.brunosalata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Cliente 1
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Bruno");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta poupanca1 = new ContaPoupanca(cliente1);

        cc1.depositar(100);
        cc1.transferir(100, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        banco.adicionaConta(cc1);

        // Cliente 2
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Thais");

        Conta cc2 = new ContaCorrente(cliente2);
        Conta poupanca2 = new ContaPoupanca(cliente2);

        cc2.depositar(320);
        cc2.transferir(250, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        banco.adicionaConta(cc2);

        System.out.println("Relação de clientes:");
        for(Conta conta : banco.getContas()){
            System.out.println(conta.getCliente().getNome());
        }
    }
}