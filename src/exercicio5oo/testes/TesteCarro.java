package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    static void main() {
        Carro ferrari = new Carro("Ferrari Roma", "Ferrari", 2016, 290);
        System.out.println(ferrari);
        ferrari.imprimirVelocidade();
        ferrari.acelerar();
        ferrari.frear();
        ferrari.imprimirVelocidade();


    }
}