package Telefone;

import java.util.Scanner;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface{
    Scanner leia = new Scanner(System.in);
    String resposta;


    //Metodo implementado da interface AparelhoTelefonicoInterface
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+ numero);
        System.out.println("Deligar (D): ");
        resposta  = leia.nextLine();

        if (resposta.equalsIgnoreCase("D")){
            desligar();
        }

    }


    //Metodo implementado da interface AparelhoTelefonicoInterface
    @Override
    public void atender() {
        System.out.println("liagação atendida ");
        System.out.println("Deligar (D): ");
        resposta  = leia.nextLine();

        if (resposta.equalsIgnoreCase("D")){
            desligar();
        }


    }

    //Metodo implementado da interface AparelhoTelefonicoInterface
    @Override
    public void desligar() {
        System.out.println("chamada encerrada");

    }


    //Metodo implementado da interface AparelhoTelefonicoInterface
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("voce tem 5 mensagens");

    }
}
