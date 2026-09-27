package exercicio1oo.classes;

public class TesteContaBancaria {
    static void main() {
        ContaBancaria op = new ContaBancaria();
        op.numeroConta = "3596";
        op.titular = "Yuri Rezende de Oliveira";
        op.saldo = 25000.95;
        System.out.println("Numero da conta:" + op.numeroConta);
        System.out.println("Titular da conta:" + op.titular);
        System.out.println("Saldo:" + op.saldo);
    }
}
