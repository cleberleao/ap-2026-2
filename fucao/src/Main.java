import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Result result = getResult();
        double media = calcularMedia(result.nota1(), result.nota2());
        String situacao = VerificaAprovacao.verificarSituacao(media);
        exibirNaTela(situacao, media);
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    private static void exibirNaTela(String exibir, double media) {
        System.out.println(exibir + " com a nota: " + media);
    }

    private static Result getResult() {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2;
        System.out.printf("Digite a nota 1: ");
        nota1 = leia.nextDouble();
        System.out.printf("Digite a nota 2: ");
        nota2 = leia.nextDouble();
        Result result = new Result(nota1, nota2);
        return result;
    }

    private record Result(double nota1, double nota2) {
    }

}