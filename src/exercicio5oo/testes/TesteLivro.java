package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TesteLivro {
    private static final String MENSAGEM_DISPONIVEL = "Este livro está disponível\n";
    private static final String MENSAGEM_INDISPONIVEL = "Este livro já foi emprestado\n";

    static void main() {
        Livro ring = new Livro();
        ring.setTitulo("Senhor dos Aneis");
        ring.setAutor("John Ronald Reuel Tolkien");
        ring.setGenero("Fantasia");
        ring.setEmprestado(false);//para testar pode alterar entre true e false
        System.out.printf("Título do livro: %s\n", ring.getTitulo());
        System.out.printf("Autor: %s\n", ring.getAutor());
        System.out.printf("Gênero do livro: %s\n", ring.getGenero());

        imprimirDisponibilidade(ring);
        ring.emprestar();
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
