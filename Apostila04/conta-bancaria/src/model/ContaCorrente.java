package model;

public class ContaCorrente {

    public double saldo;
    public Cliente titular;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double retornarSaldo() {
        return saldo;
    }
}
