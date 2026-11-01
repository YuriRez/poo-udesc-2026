package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TesteLivro {
    static void main() {
        Livro ring = new Livro();
        ring.setTitulo("Senhor dos Aneis");
        ring.setAutor("John Ronald Reuel Tolkien");
        ring.setGenero("Fantasia");
        ring.setEmprestado(true);//para testar pode alterar entre true e false
        System.out.println("Titulo do livro:" + ring.getTitulo());
        System.out.println("Autor:" + ring.getAutor());
        System.out.println("Genero do livro:" + ring.getGenero());

        if (ring.isEmprestado()){
            System.out.println("Este livro já foi emprestado");
        }
        else{
            System.out.println("Este livro está disponivel");
        }
    }
}
