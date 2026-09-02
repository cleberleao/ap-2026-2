import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        System.out.printf("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }
        else {
            System.out.println("Você é menor de idade");
        }
    }
}