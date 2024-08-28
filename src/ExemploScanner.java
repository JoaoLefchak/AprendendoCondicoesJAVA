import java.util.Scanner;

public class ExemploScanner {
    //Classe main pra iniciar o codigo
    //Scanner coletar dados do usuário
    //sc.next( ) = string
    //sc.nextInt = numero inteiro
    //sc.nextDouble = numero quebrado

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = " ";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Digite o nome do aluno: ");
        nome = sc.next( );

        System.out.println("Digite a sua idade");
        idade = sc.nextInt();

        System.out.println("Digite o seu peso");
        peso = sc.nextDouble();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Sua idade é: " + idade);


    }

}
