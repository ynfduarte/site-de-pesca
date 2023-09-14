import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Então é isso pe-pessoal");

        int valor = 10;
        byte valor2 = 127;
        short valor3 = 1235;
        long valor4 = 5675723;
        boolean valor5 = true;
        char valor6 = 'P';
        float valor7 = 10.9f;
        double valor8 = 8;

        System.out.println("varíavel int" + valor);
        System.out.println("varíavel byte" + valor2);
        System.out.println("varíavel short" + valor3);
        System.out.println("varíavel long" + valor4);
        System.out.println("varíavel boolean" + valor5);
        System.out.println("varíavel char" + valor6);
        System.out.println("varíavel float" + valor7);
        System.out.println("varíavel double" + valor8);

        int num1 = 10;
        int num2 = 20;
        int soma = num1 + num2;

        System.out.println("a soma é" + soma);


        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("numero: " + numero);


    }
}



