package exercicio5oo.classes;

public class ContaBancaria {
    private static final double VALOR_MINIMO = 0;
    private static final String MENSAGEM_SALDO = "Saldo atual: R$ %.2f\n";
    private static final String FORMATO_TO_STRING =
            "ContaBancaria{numeroConta=%s, titular=%s, saldo=%.2f}";

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > VALOR_MINIMO) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > VALOR_MINIMO) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > VALOR_MINIMO) {
            saldo -= valor;
        }
    }

    public void imprimirSaldo() {
        System.out.printf(MENSAGEM_SALDO, saldo);
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, numeroConta, titular, saldo);
    }
}