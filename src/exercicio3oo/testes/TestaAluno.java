package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {
     static void main() {
        Aluno yuri = new Aluno();
        yuri.setMatricula("321");
        yuri.setNome("yuri");
        yuri.setIdade(19);
        yuri.setNota1(8);
        yuri.setNota2(9);
        yuri.setNota3(10);
        yuri.setNota4(6);
        System.out.printf("Matrícula: %s \n", yuri.getMatricula());
        System.out.printf("Nome: %s \n", yuri.getNome());
        System.out.printf("Idade: %d \n", yuri.getIdade());
        System.out.printf("Nota 1: %d \n", yuri.getNota1());
        System.out.printf("Nota 2: %d \n", yuri.getNota2());
        System.out.printf("Nota 3: %d \n", yuri.getNota3());
        System.out.printf("Nota 4: %d \n", yuri.getNota4());
    }
}
