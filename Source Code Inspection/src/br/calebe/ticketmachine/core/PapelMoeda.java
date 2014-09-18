package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {
    

    protected double valor;
    protected double quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
