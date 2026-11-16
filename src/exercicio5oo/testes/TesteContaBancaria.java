package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    static void main() {
        ContaBancaria op = new ContaBancaria("3596", "Yuri Rezende de Oliveira", 25000.95);
        System.out.println(op);
        op.depositar(1000);
        op.imprimirSaldo();
        op.sacar(500.50);
        op.imprimirSaldo();
    }
}