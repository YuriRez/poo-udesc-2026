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
        System.out.println("Matrícula: " + yuri.getMatricula());
        System.out.println("Nome: " + yuri.getNome());
        System.out.println("Idade: " + yuri.getIdade());
        System.out.println("Nota 1: " + yuri.getNota1());
        System.out.println("Nota 2: " + yuri.getNota2());
        System.out.println("Nota 3: " + yuri.getNota3());
        System.out.println("Nota 4: " + yuri.getNota4());
    }
}
