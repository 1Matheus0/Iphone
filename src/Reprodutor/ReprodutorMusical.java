package Reprodutor;

import java.util.Scanner;

public class ReprodutorMusical implements ReprodutorMusicalInterface{
    Scanner leia = new Scanner(System.in);

    //metodo implementado da interface ReprodutorMusicalInterface
    @Override
    public void selecionarMusica() {
        System.out.println("** Tela de faixas de musicas **");
        System.out.println("");
        System.out.println("|-------- MENU --------|");
        System.out.println("| 1- Faixa 1           |");
        System.out.println("| 2- Faixa 2           |");
        System.out.println("| 3- Faixa 3           |");
        System.out.println("| 4- Faixa 4           |");
        System.out.println("| 5- Faixa 5           |");
        System.out.println("|----------------------|");
        System.out.println("");
        System.out.print("Selecione a faixa desejada: ");

        int musica = leia.nextInt();

        switch (musica){
            case 1:
                tocar(musica);
                break;
            case 2:
                tocar(musica);
                break;
            case 3:
                tocar(musica);
                break;
            case 4:
                tocar(musica);
                break;
            case 5:
                tocar(musica);
                break;
            default:


        }

    }

    //metodo implementado da interface ReprodutorMusicalInterface
    @Override
    public void tocar(int musica) {
        System.out.printf("Tocando faixa %s %n%n", musica);


    }

    //metodo implementado da interface ReprodutorMusicalInterface
    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

}
