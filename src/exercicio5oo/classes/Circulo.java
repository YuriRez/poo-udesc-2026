package exercicio5oo.classes;

public class Circulo {
    private static final int FATOR_DIAMETRO = 2;
    private static final double RAIO_MINIMO = 0;
    private static final double RAIO_MAXIMO = 1000;
    private static final String FORMATO_TO_STRING = "Circulo{raio=%.2f}";

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= RAIO_MINIMO && raio <= RAIO_MAXIMO) {
            this.raio = raio;
        }
    }

    public double calcularDiametro() {
        return FATOR_DIAMETRO * raio;
    }

    public double calcularPerimetro() {
        return Math.PI * calcularDiametro();
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, raio);
    }
}