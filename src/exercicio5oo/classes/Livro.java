package exercicio5oo.classes;

public class Livro {
    private static final String MENSAGEM_EMPRESTADO = "Livro emprestado\n";
    private static final String MENSAGEM_DEVOLVIDO = "Livro devolvido\n";
    private static final String MENSAGEM_JA_EMPRESTADO = "Livro já está emprestado\n";
    private static final String MENSAGEM_NAO_EMPRESTADO = "Livro não está emprestado\n";
    private static final String FORMATO_TO_STRING =
            "Livro{titulo=%s, autor=%s, genero=%s, emprestado=%b}";

    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar() {
        if (estaDisponivel()) {
            emprestado = true;
            System.out.printf(MENSAGEM_EMPRESTADO);
        } else {
            System.out.printf(MENSAGEM_JA_EMPRESTADO);
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.printf(MENSAGEM_DEVOLVIDO);
        } else {
            System.out.printf(MENSAGEM_NAO_EMPRESTADO);
        }
    }

    public boolean estaDisponivel() {
        return !emprestado;
    }

    @Override
    public String toString() {
        return String.format(FORMATO_TO_STRING, titulo, autor, genero, emprestado);
    }
}