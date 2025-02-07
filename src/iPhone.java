import Internet.NavegandoNaInternet;

import java.util.Scanner;

public class iPhone {
Scanner leia = new Scanner(System.in);
    NavegandoNaInternet navegando = new NavegandoNaInternet();


    String resposta;

    public void navegandoNaInternet(){
        do {
            System.out.println("Entrar em um página? [P]");
            System.out.println("Adicionar uma nova aba? [A]");
            System.out.println("Atualizar a página? [Y]");
            System.out.println("Deseja voltar? [V]");

            resposta = leia.nextLine();

            if (resposta.equalsIgnoreCase("P")){
                navegando.exibirPagina();
            } else if (resposta.equalsIgnoreCase("A")) {
                navegando.adicionarNovaAba();
            } else if (resposta.equalsIgnoreCase("Y")) {
                navegando.atualizarPagina();
            } else if (resposta.equalsIgnoreCase("v")) {
                System.out.println("tela inincial");
            }else {
                System.out.println("erro");
            }
        }while(!resposta.equalsIgnoreCase("V"));
    }

}
