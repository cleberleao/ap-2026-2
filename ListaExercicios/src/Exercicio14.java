import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        final float dolar = 5.40f;
        float valor, resultado;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor em reais para ser convertido: ");
        valor = leia.nextFloat();
        resultado = valor / dolar;
        System.out.println("Você consegue comprar $ " +  String.format("%.2f", resultado) + " dólares com R$ " + String.format("%.2f", valor));
    }
}
