import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("difite a idade");
        int idade = scanner.nextInt();

        System.out.println("idade " + idade + " em dias " + idade * 365);

        System.out.println("idade " + idade + " em dias " + idade + 12);



        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        // Calcula o antecessor e o sucessor
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor é: " + antecessor);
        System.out.println("O sucessor é: " + sucessor);




        int n1 = 8;
        int n2 = 9;
        int n3 = 7;

        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        int soma1 = n1 + n2 + n3;
        int soma2 = n4 + n5 + n6;

        float media1 = soma1 / 3;
        float media2 = soma2 / 3;

        float somamm = media1 + media2;
        float mediamedia = somamm / 2;
        System.out.println("a média de 7,8,9 é: " + media1);
        System.out.println("a média de 4,5,6 é: " + media2);
        System.out.println("a média da média é: " + mediamedia);









        
    }
}
