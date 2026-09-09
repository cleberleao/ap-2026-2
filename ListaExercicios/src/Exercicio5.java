import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String senha;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua senha");
        senha = leia.next().toLowerCase();
        if (senha.equals("1234") ) {
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    }
}
