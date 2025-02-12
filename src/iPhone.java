import Internet.NavegandoNaInternet;
import Reprodutor.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

import java.util.Scanner;

public class iPhone {
Scanner leia = new Scanner(System.in);
    NavegandoNaInternet navegando = new NavegandoNaInternet();
    ReprodutorMusical reprodutor = new ReprodutorMusical();
    AparelhoTelefonico aparelho = new AparelhoTelefonico();

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
                System.out.println("Tela inincial");
            }else {
                System.out.println("erro");
            }
        }while(!resposta.equalsIgnoreCase("V"));
    }


    public void reprodutorMusical(){
        do {
            System.out.println("Deseja escolher uma nova musica? [N]");
            System.out.println("Deseja pausar a música? [P]");
            System.out.println("Deseja voltar? [V]");
            resposta = leia.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                reprodutor.selecionarMusica();
            } else if (resposta.equalsIgnoreCase("P")) {
                reprodutor.pausar();
            } else if (resposta.equalsIgnoreCase("V")) {
                System.out.println("Tela inicial");
            } else {
                System.out.println("Não entedi o que disse");
            }
        } while (!resposta.equalsIgnoreCase("V"));

    }

    public void aparelhoTelefonico(){
        do{
            System.out.println("Deseja fazer uma ligacao? (L)");
            System.out.println("Deseja atender a ligação? (A)");
            System.out.println("Deseja abrir o carreio de voz? (C)");
            System.out.println("Deseja voltar? (V)");
            resposta = leia.nextLine();

            if (resposta.equalsIgnoreCase("L")){
                System.out.println("Digite o numero: ");
                resposta = leia.nextLine();
                aparelho.ligar(resposta);

            }else if (resposta.equalsIgnoreCase("A")){
                aparelho.atender();

            } else if (resposta.equalsIgnoreCase("C")) {
                aparelho.iniciarCorreioVoz();

            }else if (resposta.equalsIgnoreCase("v")) {
                System.out.println("Tela inincial");
            }else{
                System.out.println("Não entedi o que disse");
            }

        }while (!resposta.equalsIgnoreCase("V"));
    }


}
