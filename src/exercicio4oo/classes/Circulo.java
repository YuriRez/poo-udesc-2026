package exercicio4oo.classes;

public class Circulo {
    private static final int FATOR_DIAMETRO = 2;

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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

}
