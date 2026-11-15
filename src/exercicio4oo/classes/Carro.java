package exercicio4oo.classes;

 public class Carro {
     private static final double VARIACAO_VELOCIDADE = 10;

     private String modelo;
     private String marca;
     private int ano;
     private double velocidade;

     public String getModelo() {
         return modelo;
     }

     public void setModelo(String modelo) {
         this.modelo = modelo;
     }

     public String getMarca() {
         return marca;
     }

     public void setMarca(String marca) {
         this.marca = marca;
     }

     public int getAno() {
         return ano;
     }

     public void setAno(int ano) {
         this.ano = ano;
     }

     public double getVelocidade() {
         return velocidade;
     }

     public void setVelocidade(double velocidade) {
         this.velocidade = velocidade;
     }

     public void acelerar() {
         velocidade += VARIACAO_VELOCIDADE;
         System.out.printf("Carro acelerou, velocidade: %.2f km/h\n",velocidade);
     }

     public void frear() {
         velocidade -= VARIACAO_VELOCIDADE;
         System.out.printf("Carro freou, velocidade: %.2f km/h\n",velocidade);
     }

     public void imprimirVelocidade() {
         System.out.printf("Velocidade atual: %.2f km/h\n", velocidade);
     }
 }
