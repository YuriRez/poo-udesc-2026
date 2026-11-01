package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TesteCarro {
    static void main() {
        Carro ferrari = new Carro();
        ferrari.setModelo("Ferrari Roma");
        ferrari.setMarca("Ferrari");
        ferrari.setAno(2016);
        ferrari.setVelocidade(350.50);
        System.out.printf("Modelo do carro: %s\n", ferrari.getModelo());
        System.out.printf("Marca do carro: %s\n", ferrari.getMarca());
        System.out.printf("Ano em que foi produzido: %d\n", ferrari.getAno());
        System.out.printf("Velocidade máxima: %.2f\n", ferrari.getVelocidade());
    }
}
