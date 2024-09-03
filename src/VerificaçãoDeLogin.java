import java.util.Scanner;

public class VerificaçãoDeLogin {
    public static void main(String[] args) {

        String nome1 = "João";
        String senha = "Jk223941";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nome de Usuario: ");
        String nomeUsuario = scanner.next();

        System.out.println("Digite sua senha: ");
        String validacao = scanner.next();


        if (nomeUsuario.equals(nome1)&&
                validacao.equals(senha)){
            System.out.println("Parabens acesso Permitido");
        }
        else {
            System.out.println("Acesso Negado Corrija seu Usuário ou Senha!");
        }






    }
}