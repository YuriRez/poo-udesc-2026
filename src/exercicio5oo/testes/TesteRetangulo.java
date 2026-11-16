package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TesteRetangulo {
    static void main() {
        Retangulo ret = new Retangulo(1.5, 2.8);
        System.out.println(ret);
        System.out.printf("Área: %.2f\n", ret.calcularArea());

    }
}