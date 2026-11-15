package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TesteContaBancaria {
    static void main() {
        ContaBancaria op = new ContaBancaria();
        op.setNumeroConta("3596");
        op.setTitular("Yuri Rezende de Oliveira");
        op.setSaldo(25000.95);
        System.out.printf("Número da conta: %s\n", op.getNumeroConta());
        System.out.printf("Titular da conta: %s\n", op.getTitular());
        System.out.printf("Saldo: %.2f\n", op.getSaldo());

        op.imprimirSaldo();
        op.depositar(1000);
        op.imprimirSaldo();
        op.sacar(500.50);
        op.imprimirSaldo();
    }
}
