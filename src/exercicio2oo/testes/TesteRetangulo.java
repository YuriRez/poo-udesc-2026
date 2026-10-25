package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TesteRetangulo {
    static void main() {
        Retangulo ret = new Retangulo();
        ret.altura = 1.5;
        ret.largura = 2.8;
        System.out.println("Altura:" + ret.altura);
        System.out.println("Largura:" + ret.largura);
    }
}
