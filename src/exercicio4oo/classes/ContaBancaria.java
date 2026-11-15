package exercicio4oo.classes;

 public class ContaBancaria {
     private static final String MENSAGEM_SALDO = "Saldo atual: R$ %.2f\n";

     private String numeroConta;
     private String titular;
     private double saldo;

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
         this.saldo = saldo;
     }
     public void depositar(double valor) {
         saldo += valor;
     }

     public void sacar(double valor) {
         saldo -= valor;
     }

     public void imprimirSaldo() {
         System.out.printf(MENSAGEM_SALDO, saldo);
     }
 }
