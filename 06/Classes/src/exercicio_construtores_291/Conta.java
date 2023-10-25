package exercicio_construtores_291;

public class Conta {
    private int numero;
    private String titular;
    private double Saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta(int numero, String titular, double inicial) {
        this.numero = numero;
        this.titular = titular;
        Depositar(inicial);
    }
    public double getSaldo() {
        return Saldo;
    }
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void Depositar(double valor) {
        this.Saldo += valor;
    }

    public void Sacar(double valor) {
        this.Saldo -= valor + 5.0;
    }
}
