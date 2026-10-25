package exercicio2oo.testes;

import exercicio2oo.classes.Livro;

public class TesteLivro {
    static void main() {
        Livro ring = new Livro();
        ring.titulo = "Senhor dos Aneis";
        ring.autor = "John Ronald Reuel Tolkien";
        ring.genero = "Fantasia";
        ring.emprestado = false; //para testar pode alterar entre true e false
        System.out.println("Titulo do livro:" + ring.titulo);
        System.out.println("Autor:" + ring.autor);
        System.out.println("Genero do livro:" + ring.genero);

        if (ring.emprestado){
            System.out.println("Este livro já foi emprestado");
        }
        else{
            System.out.println("Este livro está disponivel");
        }
    }
}
