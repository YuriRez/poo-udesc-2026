package estatico;

public class TestaUtils {
    public static void main(String[] args) {
        //Utils u = new Utils();
        System.out.println("PI = " + Utils.PI);
        //System.out.println("PI = " + u.PI);
        //Não é mais necessário estanciar, pode colocar o nome da classe
        System.out.println(Utils.max(100,50));
        System.out.println(Utils.max(-3,-5));

        System.out.println("Alunos cadastrados: " + Aluno.quantidadeAlunos);
        Aluno ze = new Aluno();
        System.out.println("Alunos cadastrados: " + Aluno.quantidadeAlunos);
        Aluno maria = new Aluno();
        System.out.println("Alunos cadastrados: " + Aluno.quantidadeAlunos);
    }

}
