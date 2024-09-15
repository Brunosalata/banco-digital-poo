package com.brunosalata;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
