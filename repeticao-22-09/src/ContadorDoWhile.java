public class ContadorDoWhile {
    public static void main(String[] args) {
        System.out.println("Olá esse é meu contador Do While!");
        int contador = 1;
        do{
            System.out.println(contador);
            contador = contador + 1;
        }while (contador <= 10);
    }
}