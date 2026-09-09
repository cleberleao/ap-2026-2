import java.util.Scanner;

public class DesafioLanche {
    public static void main(String[] args) {

        String nome;
        int qtde;
        float valor, desconto, valorFinal;
        Scanner leia = new Scanner(System.in);
        System.out.println("Haburgueria XTUDO");
        System.out.println("Nome para o pedido: ");
        nome = leia.next();
        System.out.println("Quantidade da compra " );
        qtde = leia.nextInt();
        System.out.println("valor do produto " );
        valor = leia.nextFloat();
        valorFinal = qtde * valor;
        System.out.println("Nome do cliente = " + nome);

        if (valorFinal >= 50.0f){
            desconto = valorFinal * 0.05f;
            System.out.println("Valor total " + valorFinal);
            System.out.println("com 5 % de desconto " + desconto);
            valorFinal = valorFinal - desconto;
            System.out.println("Valor total a Pagar " + valorFinal);
        }
         else{
            System.out.println("Não atingiu o valor para obter desconto");
            System.out.println("Valor total a Pagar " + valorFinal);
        }

    }
}
