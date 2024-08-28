import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ClassificacaoNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Nota = 0;

        System.out.println("Nota aluno: " );
        Nota = sc.nextDouble();

        if (Nota >= 9){
            System.out.println("Excelente");
        }
        else if (Nota >= 7){
            System.out.println("Bom");
        }
        else if (Nota >= 5){
            System.out.println("Satisfatório");
        }
        else if (Nota < 5){
            System.out.println("Insatisfatório");
        }

        System.out.println("Sua clássificação é: " + Nota);
    }
}
