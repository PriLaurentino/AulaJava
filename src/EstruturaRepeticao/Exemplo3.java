package EstruturaRepeticao;

public class Exemplo3 {
    public static void main(String[] args)throws InterruptedException {

        String[] listaCarrosCompactos = {"Maverick", "Opala", "Mustang", "Galaxy"};

        for (String cadaCarro : listaCarrosCompactos) {

            System.out.println(cadaCarro);
            Thread.sleep(1000);

        }
    }
}
