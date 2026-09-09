import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        float km, consumo, litros, precoCombustivel, total;
        Scanner leia = new Scanner(System.in);
        System.out.println("Distância percorrida em Km: ");
        km = leia.nextFloat();
        System.out.println("Consumo do carro km/l: ");
        consumo = leia.nextFloat();
        System.out.println("Preço do combustível R$");
        precoCombustivel = leia.nextFloat();
        litros= km / consumo;
        total = litros * precoCombustivel;
        System.out.println("Litros Consumidos " + litros);
        System.out.println("Total Gasto R$ " + total);
    }
}
