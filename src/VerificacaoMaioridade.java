import java.util.Scanner;

public class VerificacaoMaioridade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer idade = 0;

        System.out.println("Digite a sua idade");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println ("Maior idade");
        }

        else if (idade < 18) {
            System.out.println ("Menor de idade");
        }

        System.out.println("Digite a sua idade é: " + idade);

    }
}
