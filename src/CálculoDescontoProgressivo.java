import java.util.Scanner;

public class CálculoDescontoProgressivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal;
        double desconto =0d ;
        double percentual= 0d;

        System.out.println("Digite o valor Total da Compra: ");
        valorTotal = scanner.nextDouble();

        if (valorTotal > 500){
            desconto= valorTotal * 0.20;
            System.out.println("O Percentual de Desconto foi de 20%.");

        } else if (valorTotal >= 200 && valorTotal <= 500) {
            desconto = valorTotal * 0.10;
            System.out.println("O Percentual de Desconto foi de 10%.");

        } else if (valorTotal >= 100 && valorTotal < 200) {
            desconto = valorTotal * 0.05;
            System.out.println("O Percentual de Desconto foi de 5%.");
        }

        System.out.println("O Valor Total foi de: "+valorTotal);
        System.out.println("O Valor do Desconto foi de: "+desconto);
        System.out.println("O Valor Fina é de: "+ (valorTotal-desconto));


    }
}
