package exercicio5oo.classes;

public class Aluno {
    private static final int QUANTIDADE_NOTAS = 4;
    private static final double MEDIA_APROVACAO = 7;
    private static final int NOTA_MINIMA = 0;
    private static final int NOTA_MAXIMA = 10;
    private static final String SITUACAO_APROVADO = "aprovado";
    private static final String SITUACAO_REPROVADO = "reprovado";
    private static final String FORMATO_TO_STRING =
            "Aluno{matricula=%s, nome=%s, idade=%d, nota1=%d, nota2=%d, nota3=%d, nota4=%d}";

    private String matricula;
    private String nome;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, int idade, int nota1, int nota2, int nota3, int nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if (notaValida(nota1)) {
            this.nota1 = nota1;
        }
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if (notaValida(nota2)) {
            this.nota2 = nota2;
        }
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        if (notaValida(nota3)) {
            this.nota3 = nota3;
        }
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        if (notaValida(nota4)) {
            this.nota4 = nota4;
        }
    }

    public double calcularMedia() {
        return (double) (nota1 + nota2 + nota3 + nota4) / QUANTIDADE_NOTAS;
    }

    public void imprimirSituacao() {
        String situacao = calcularMedia() >= MEDIA_APROVACAO ? SITUACAO_APROVADO : SITUACAO_REPROVADO;
        System.out.printf("Situação: %s \n", situacao);
    }

    private boolean notaValida(int nota) {
        return nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, matricula, nome, idade, nota1, nota2, nota3, nota4);
    }
}