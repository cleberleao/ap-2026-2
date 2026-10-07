
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Cleber";
        aluno.idade = 46;
        aluno.nota1 = 60;
        aluno.nota2 = 61;
        aluno.calcularMedia(aluno.nota1, aluno.nota2 );
        aluno.verificarMaioridade(aluno.idade);
        System.out.println(aluno.nome);
    }
}