package exercicio1oo.classes;

public class TesteCarro {
    static void main(){
        Carro ferrari = new Carro();
        ferrari.modelo="Ferrari Roma";
        ferrari.marca="Ferrari";
        ferrari.ano=2016;
        ferrari.velocidade=350.50;
        System.out.println("Modelo do carro:"+ferrari.modelo);
        System.out.println("Marca do carro:"+ferrari.marca);
        System.out.println("Ano em que foi produzido:"+ferrari.ano);
        System.out.println("Velocidade maxima:"+ferrari.velocidade);
    }
}
