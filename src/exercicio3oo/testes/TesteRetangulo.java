package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TesteRetangulo {
    static void main() {
        Retangulo ret = new Retangulo();
        ret.setAltura(1.5);
        ret.setLargura(2.8);
        System.out.printf("Altura: %.2f\n", ret.getAltura());
        System.out.printf("Largura: %.2f\n", ret.getLargura());
    }
}
