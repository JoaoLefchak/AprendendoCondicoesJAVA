import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double primeironumero;
        Double segundonumero;
        String operacao;

        System.out.println("Digite o primeiro Numero: ");
        primeironumero = scanner.nextDouble();

        System.out.println("Digite o Segundo Numero: ");
        segundonumero = scanner.nextDouble();

        System.out.println("Digite a Operação: ");
        operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println(primeironumero + segundonumero);
                break;

            case "-":
                System.out.println(primeironumero - segundonumero);
                break;

            case "*":
                System.out.println(primeironumero * segundonumero);
                break;

            case "/":
                System.out.println(primeironumero / segundonumero);
                break;

            default:
                System.out.println("Operação Invalida.");
                break;

        }

    }

}