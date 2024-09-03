import java.util.Scanner;

public class SistemaCálculoSalárioBonificação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBruto;
        double anosDeImpresa;
        double imposto = 0d;
        double bonus = 0d;
        System.out.println("Digite seu Salario Bruto: ");
        salarioBruto = scanner.nextDouble();

        System.out.println("digite o Numero de Anos de impresa: ");
        anosDeImpresa = scanner.nextDouble();

        if (salarioBruto > 5000){
            imposto = salarioBruto * 0.27;

        } else if (salarioBruto > 3000 && salarioBruto < 5000) {
            imposto = salarioBruto * 0.18;

        } else if (salarioBruto < 3000) {
            imposto = salarioBruto * 0.10;
        }
        if (anosDeImpresa > 10 ){
            bonus = salarioBruto * 0.10;

        } else if (anosDeImpresa >= 5 && anosDeImpresa <= 10) {
            bonus = salarioBruto * 0.05;

        } else if (anosDeImpresa < 5 ) {
            System.out.println("Sem Bônus");
        }
        System.out.println("Seu Salário Bruto é: "+salarioBruto);
        System.out.println("Seu Bônus é de:"+bonus);
        System.out.println("O Imposto Descontado é:"+imposto);
        System.out.println("Seu Salário líquido é de: "+ (salarioBruto - imposto + bonus) );

    }
}