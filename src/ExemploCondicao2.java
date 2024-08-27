import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ExemploCondicao2 {

    //Quero adicionar um desconto gradativo
    //Valor maior que 1000 = 10% desconto
    //Valor maior que 2000 = 20% desconto
    //Valor maior que 3000 = 30% desconto
    //Valor menor igual a 1000 = 0%


    //////Operadores Logicos
    // && e quando as duas são verdades
    // || ou quando um dos comparativos é verdadeiro

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto = 0d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do bruto: ");
        valorBruto = scanner.nextDouble();

        if (valorBruto > 1000 && valorBruto <= 2000) {
             desconto = valorBruto * 0.10;
        }
        else if (valorBruto > 2000 && valorBruto > 3000){
             desconto = valorBruto * (20/100);
        }
        else if (valorBruto >= 3000){
             desconto = valorBruto * (30./100);
        }

        System.out.println("Valor bruto é: " + valorBruto);
        System.out.println("Valor de desconto é: " + desconto);
        System.out.println("Valor liguido é: " + (valorBruto - desconto) );

    }


}
