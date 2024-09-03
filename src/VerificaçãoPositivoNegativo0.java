import java.util.Scanner;

public class VerificaçãoPositivoNegativo0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        Double numero = scanner.nextDouble();

        if ( numero > 0){
            System.out.println("O Numero é Positivo.");
        }
        else if (numero < 0){
            System.out.println(" O Numero é negativo.");
        }
        else if (numero == 0) {
            System.out.println(" O Numero é Zero.");
        }
    }
}
