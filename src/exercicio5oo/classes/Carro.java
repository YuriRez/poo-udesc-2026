package exercicio5oo.classes;

public class Carro {
    private static final double VARIACAO_VELOCIDADE = 10;
    private static final double VELOCIDADE_MINIMA = 0;
    private static final double VELOCIDADE_MAXIMA = 300;
    private static final String MENSAGEM_ACELERAR = "Carro acelerou, velocidade: %.2f km/h\n";
    private static final String MENSAGEM_FREAR = "Carro freou, velocidade: %.2f km/h\n";
    private static final String MENSAGEM_VELOCIDADE = "Velocidade atual: %.2f km/h\n";
    private static final String FORMATO_TO_STRING =
            "Carro{modelo=%s, marca=%s, ano=%d, velocidade=%.2f}";

    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade);
    }

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
        if (velocidade < VELOCIDADE_MINIMA || velocidade > VELOCIDADE_MAXIMA) {
            return;
        }
        this.velocidade = velocidade;
    }

    public void acelerar() {
        setVelocidade(Math.min(velocidade + VARIACAO_VELOCIDADE, VELOCIDADE_MAXIMA));
        System.out.printf(MENSAGEM_ACELERAR, velocidade);
    }

    public void frear() {
        setVelocidade(Math.max(velocidade - VARIACAO_VELOCIDADE, VELOCIDADE_MINIMA));
        System.out.printf(MENSAGEM_FREAR, velocidade);
    }

    public void imprimirVelocidade() {
        System.out.printf(MENSAGEM_VELOCIDADE, velocidade);
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, modelo, marca, ano, velocidade);
    }
}