import java.util.Scanner;

public class ContadorDiferenteDoWhile {
    public static void main(String[] args) {
        System.out.println("Deseja Continuar excutando?");
        int opcao;
        Scanner leia = new Scanner(System.in);
        do{
            System.out.println("Digite 1 - Sim");
            System.out.println("Digite 2 - Sair");
            opcao = leia.nextInt();
        }while (opcao != 2);
    }
}