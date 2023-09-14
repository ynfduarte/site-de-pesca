import java.util.Scanner;

public class livre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int compra = 0;

        System.out.println("Você acabou de chegar na loja de Carro ");

        System.out.println("Você acaba de ver um ASTRA, deseja compra-lo? (sim ou não)");
        String resposta = scanner.nextLine();
        if (resposta.equals("sim")){
            compra += 1;
        }else compra -=0;

        System.out.println("Você acaba de ver um CIVIC, deseja compra-lo? (sim ou não)");
        String resposta1 = scanner.nextLine();
        if (resposta1.equals("sim")){
            compra += 1;
        }else compra -=0;

        System.out.println("Você acaba de ver um F250, deseja compra-lo? (sim ou não)");
        String resposta2 = scanner.nextLine();
        if (resposta2.equals("sim")){
            compra += 1;
        }else compra -=0;

        System.out.println("Você acaba de ver um HILUX, deseja compra-lo? (sim ou não)");
        String resposta3 = scanner.nextLine();
        if (resposta3.equals("sim")){
            compra += 1;
        }else compra -=0;

        System.out.println("Você acaban de ver um RAM 2500, deseja compra-lo? (sim ou não)");
        String resposta4 = scanner.nextLine();
        if (resposta4.equals("sim")){
            compra += 1;
        }else compra -=0;

        System.out.println("Parabéns você comprou " + compra + " carros");
    }
}
