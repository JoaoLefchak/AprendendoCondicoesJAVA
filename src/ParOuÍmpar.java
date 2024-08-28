import java.util.Scanner;

public class ParOuÍmpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numero = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        }
        else if (numero % 2 != 0) {
            System.out.println("Impar");
        }

    }
}
