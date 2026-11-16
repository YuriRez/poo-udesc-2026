package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TesteLivro {
    private static final String MENSAGEM_DISPONIVEL = "Este livro está disponível\n";
    private static final String MENSAGEM_INDISPONIVEL = "Este livro já foi emprestado\n";

    static void main() {
        Livro ring = new Livro("Senhor dos Aneis", "John Ronald Reuel Tolkien", "Fantasia", false);
        System.out.println(ring);
        imprimirDisponibilidade(ring);
        ring.emprestar();
        imprimirDisponibilidade(ring);
        ring.devolver();
        imprimirDisponibilidade(ring);

    }

    private static void imprimirDisponibilidade(Livro livro) {
        if (livro.estaDisponivel()) {
            System.out.printf(MENSAGEM_DISPONIVEL);
        } else {
            System.out.printf(MENSAGEM_INDISPONIVEL);
        }
    }
}