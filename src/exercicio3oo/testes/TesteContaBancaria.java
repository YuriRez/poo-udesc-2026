package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TesteContaBancaria {
    static void main() {
        ContaBancaria op = new ContaBancaria();
        op.setNumeroConta("3596");
        op.setTitular("Yuri Rezende de Oliveira");
        op.setSaldo(25000.95);
        System.out.println("Numero da conta:" + op.getNumeroConta());
        System.out.println("Titular da conta:" + op.getTitular());
        System.out.println("Saldo:" + op.getSaldo());
    }
}
