package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        if (valor1 > valor2) {
            System.out.println("valor1");
        }else if (valor2 > valor1) {
            System.out.println("valor2");
        }else{
            System.out.println("os dois números são iguais");
        }


    }

    }
