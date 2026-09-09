import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        float temperatura;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a temperatura atual");
        temperatura = leia.nextFloat();
        if(temperatura >= 28.0){
            System.out.println("Ligar ar-condicionado");
        }
        else{
            System.out.println("Temperatura agradável");
        }
    }
}