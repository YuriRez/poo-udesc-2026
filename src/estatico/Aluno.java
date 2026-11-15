package estatico;

public class Aluno {
    String nome;
    int idade;
    static int quantidadeAlunos = 0;

    public Aluno(){
        quantidadeAlunos++;
        System.out.println("Criando o(a) " + quantidadeAlunos + "º aluno(a)");
    }
}
