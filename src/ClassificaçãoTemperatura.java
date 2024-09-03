import java.util.Scanner;

public class ClassificaçãoTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Qual a  Temperatura? ");
        Integer temperatura = scanner.nextInt();

        if (temperatura > 30){
            System.out.println("A Temperatura está Quente.");
        }
        else if (temperatura >= 15 && temperatura <=30) {
            System.out.println("A temperatura está Agradavel.");
        }
        else if (temperatura < 15) {
            System.out.println("A Temperatura está Frio");
        }


    }
}