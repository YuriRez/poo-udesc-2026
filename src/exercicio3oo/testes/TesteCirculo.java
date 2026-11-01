package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    static void main() {
        Circulo cir = new Circulo();
        cir.setRaio(3.14);
        System.out.println("Raio:" + cir.getRaio());
    }
}
