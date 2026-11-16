package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TestaAluno {
    static void main() {
        Aluno yuri = new Aluno("321", "yuri", 19, 8, 9, 10, 6);
        System.out.println(yuri);
        System.out.printf("Média: %.2f \n", yuri.calcularMedia());
        yuri.imprimirSituacao();

        Aluno maria = new Aluno();
        maria.setMatricula("654");
        maria.setNome("maria");
        maria.setIdade(20);
        maria.setNota1(5);
        maria.setNota2(6);
        maria.setNota3(4);
        maria.setNota4(7);

    }
}