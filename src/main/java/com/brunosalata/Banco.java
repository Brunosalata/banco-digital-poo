package com.brunosalata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }
}
