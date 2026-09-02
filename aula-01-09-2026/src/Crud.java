import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        int opcao;
        Scanner leia = new Scanner(System.in);
        String nome;
        System.out.println("para cadastrar Digite 1: ");
        System.out.println("para Buscar Digite 2: ");
        System.out.println("para Atualizar Digite 3: ");
        System.out.println("para Apagar Digite 4: ");
        opcao = leia.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite seu nome: ");
                nome = leia.next();
                System.out.println("Cadastro realizado com sucesso: " + nome);
                break;
            case 2:
                System.out.println("Seu cadastro pesquisado é: Teste de pesquisa");
                break;
            case 3:
                System.out.println("Altere o seu nome: ");
                nome = leia.next();
                System.out.println("Cadastro atualizado com sucesso: " + nome);
                break;
            case 4:
                nome = "";
                System.out.println("Cadastro apagado com sucesso");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
