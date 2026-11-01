package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    static void main() {
        Livro ring = new Livro();
        ring.setTitulo("Senhor dos Aneis");
        ring.setAutor("John Ronald Reuel Tolkien");
        ring.setGenero("Fantasia");
        ring.setEmprestado(true);//para testar pode alterar entre true e false
        System.out.printf("Título do livro: %s\n", ring.getTitulo());
        System.out.printf("Autor: %s\n", ring.getAutor());
        System.out.printf("Gênero do livro: %s\n", ring.getGenero());

        if (ring.isEmprestado()) {
            System.out.printf("Este livro já foi emprestado\n");
        } else {
            System.out.printf("Este livro está disponível\n");
        }
    }
}
