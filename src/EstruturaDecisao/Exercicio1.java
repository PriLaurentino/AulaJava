package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String usuario = leitor.nextLine();

        System.out.println("Digite a senha: ");
        String senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Login bem sucedido!");
        } else {
            System.out.println("nome de usuário ou senha incorretos.");
        }

    }
}
