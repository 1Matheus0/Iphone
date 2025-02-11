import Internet.NavegandoNaInternet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String resposta;

        iPhone iphone = new iPhone();

        do{
            System.out.println("Escolha uma das opcoes: ");
            System.out.println("Navegar na internet (I): ");
            System.out.println("Escutar musica (M): ");
            System.out.println("Fazer uma ligacao (L): ");
            System.out.println("Desligar Iphone (D): ");

            resposta = leia.nextLine();

            if (resposta.equalsIgnoreCase("I")){
                iphone.navegandoNaInternet();
            } else if (resposta.equalsIgnoreCase("M")) {
                iphone.reprodutorMusical();
            } else if (resposta.equalsIgnoreCase("L")) {
                iphone.aparelhoTelefonico();
            } else if (resposta.equalsIgnoreCase("D")) {
                System.out.println("Desligando aparelho");
                leia.close();
            } else{
                System.out.println("erro");
            }

        }while (!resposta.equalsIgnoreCase("D"));

    }
}