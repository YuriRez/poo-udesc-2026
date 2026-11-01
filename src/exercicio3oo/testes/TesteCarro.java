package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TesteCarro {
    static void main() {
        Carro ferrari = new Carro();
        ferrari.setModelo("Ferrari Roma");
        ferrari.setMarca("Ferrari");
        ferrari.setAno(2016);
        ferrari.setVelocidade(350.50);
        System.out.println("Modelo do carro:" + ferrari.getModelo());
        System.out.println("Marca do carro:" + ferrari.getMarca());
        System.out.println("Ano em que foi produzido:" + ferrari.getAno());
        System.out.println("Velocidade maxima:" + ferrari.getVelocidade());
    }
}
