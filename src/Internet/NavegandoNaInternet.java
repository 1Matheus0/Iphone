package Internet;

import java.util.Scanner;

public class NavegandoNaInternet implements NavegadoNaInternetInterface {
    Scanner leia = new Scanner(System.in);
    String respota;




    @Override
    public void exibirPagina() {
        do {
            System.out.println("Digite uma url: ");
            respota = leia.nextLine();
            System.out.println("Acessando url: "+respota);

            System.out.println("Deseja voltar? Sim(S) Não (N) ");
            System.out.println("Deseja atuliza a pagina? (A)");
            respota = leia.nextLine();

            if (respota.equalsIgnoreCase("S")) {
                System.out.println("Tel inicial");
            } else if (respota.equalsIgnoreCase("A")) {
                atualizarPagina();
            }else {
                System.out.println("Erro");
            }
        }while (!respota.equalsIgnoreCase("S"));
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionado uma aba");
        exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }
}
