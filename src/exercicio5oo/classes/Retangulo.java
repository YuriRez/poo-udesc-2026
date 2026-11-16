package exercicio5oo.classes;

public class Retangulo {
    private static final double MEDIDA_MINIMA = 0;
    private static final double MEDIDA_MAXIMA = 1000;
    private static final String FORMATO_TO_STRING = "Retangulo{altura=%.2f, largura=%.2f}";

    private double altura;
    private double largura;

    public Retangulo() {
    }

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (!medidaInvalida(altura)) {
            this.altura = altura;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (!medidaInvalida(largura)) {
            this.largura = largura;
        }
    }

    public double calcularArea() {
        return altura * largura;
    }

    private boolean medidaInvalida(double medida) {
        return medida < MEDIDA_MINIMA || medida > MEDIDA_MAXIMA;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, altura, largura);
    }
}