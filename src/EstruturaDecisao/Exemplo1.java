package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //criou variavel

        System.out.print("Digite o salário: "); //console.log

        //double salario = Double.parseDouble(leitor.nextLine()); // armazenamento variável tipo double
        double salario = leitor.nextDouble();

        if (salario < 1000) {
            double salarioReajustado = salario * 1.1;
            System.out.println(salarioReajustado);
        }else{
            System.out.println("Salário sem reajuste");
        }
    }
}
