package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    static void main() {
        Circulo cir = new Circulo(3.14);
        System.out.println(cir);
        System.out.printf("Diâmetro: %.2f\n", cir.calcularDiametro());
        System.out.printf("Perímetro: %.2f\n", cir.calcularPerimetro());
        System.out.printf("Área: %.2f\n", cir.calcularArea());

        Circulo cir2 = new Circulo();
        cir2.setRaio(1001);
        System.out.println(cir2);
        cir2.setRaio(10);
        System.out.println(cir2);
    }
}