import java.util.Scanner;

public class VerificaçãoDiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String semana= "";

        System.out.println("Pesquise dias da Semana por Numeração de 1 a 7:");
        semana= scanner.next();

        switch (semana){
            case"1":
                System.out.println("Segunda-feira.");
                break;
            case "2":
                System.out.println("Terça-Feira.");
                break;
            case "3":
                System.out.println("Quarta-Feira.");
                break;
            case"4":
                System.out.println("Quinta-Feira.");
                break;
            case"5":
                System.out.println("Sexta-Feira.");
                break;
            case "6":
                System.out.println("Sabado.");
                break;
            case "7":
                System.out.println("Domingo.");
                break;
            default:
                System.out.println("Numero Invalido.");
                break;
        }
    }
}