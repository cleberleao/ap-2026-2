public class Aluno {

    String nome;
    int idade;
    double nota1;
    double nota2;
//    private double media;

    public double calcularMedia(double nota1 , double nota2){
        return nota1 + nota2 / 2;
    }

    public static void verificarMaioridade(int idade){
        if(idade>= 18){
            System.out.println("Maior de idade tem " + idade + " anos");
        }
        else {
            System.out.println("Menor de idade tem " + idade + " anos");
        }
    }
}
