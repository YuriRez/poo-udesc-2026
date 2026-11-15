package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    static void main() {
        Circulo cir = new Circulo();
        cir.setRaio(3.14);
        System.out.printf("Raio: %.2f\n", cir.getRaio());
        System.out.printf("Diâmetro: %.2f\n", cir.calcularDiametro());
        System.out.printf("Perímetro: %.2f\n", cir.calcularPerimetro());
        System.out.printf("Área: %.2f\n", cir.calcularArea());
    }
}
