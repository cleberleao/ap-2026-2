public class VerificaAprovacao {
    public static String verificarSituacao(double media) {
        if(media >= 60) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
