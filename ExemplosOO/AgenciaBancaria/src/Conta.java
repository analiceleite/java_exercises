public class Conta {

    public int agencia;
    public int numero;
    public Pessoa titular;
    public double saldo;


    public double depositar(double valor) {
        this.saldo = saldo + valor; // ou this.saldo += valor;
        return this.saldo += valor;
    }


    public double sacar(double valor) {
        return this.saldo -= valor;
    }
}
