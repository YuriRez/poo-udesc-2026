package exercicio1oo.classes;

public class TestaAluno {
    public static void main() {
        Aluno yuri = new Aluno();
        yuri.matricula = "321";
        yuri.nome = "yuri";
        yuri.idade = 19;
        yuri.nota1 = 8;
        yuri.nota2 = 9;
        yuri.nota3 = 10;
        yuri.nota4 = 6;
        System.out.println("Matrícula: " + yuri.matricula);
        System.out.println("Nome: " + yuri.nome);
        System.out.println("Idade: " + yuri.idade);
        System.out.println("Nota 1: " + yuri.nota1);
        System.out.println("Nota 2: " + yuri.nota2);
        System.out.println("Nota 3: " + yuri.nota3);
        System.out.println("Nota 4: " + yuri.nota4);
    }
}
